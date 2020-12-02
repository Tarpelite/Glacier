# Glacier 函数式深度学习编程语言

`陈天宇 BY2006105`
`闫坤 BY2006175`


## 语言设计的背景及范型

### 背景与动机

随着深度学习在越来越多的领域展现出惊人的效果，来自不同背景的研究者都渴望构建自己的深度学习模型来解决领域的前沿问题。Google和Facebook等互联网巨头很早就注意到了这个问题，推出了tensorflow和pytorch等框架，在工业领域和研究领域都取得了巨大的成功。但是，和自然数学语言相近的深度学习编程工具却一直没有出现，大多数深度学习框架遵循了传统增量开发的思想，为了兼容主流的编程语言，在设计之初便包含了大量过程式、命令式和面向对象的特性，导致了一些难以避免的缺陷。

pytorch和tensorflow提供了两个主要的功能：具有强大的GPU加速的张量计算和包含自动求导系统的深度神经网络。

随着pytorch和tensorflow的进一步推广，这些缺陷也在逐渐放大。首先，对于神经网络的抽象，无论是pytorch还是tensorflow，都将神经网络层描述为对象，而面向对象的继承、多态和封装特性却很容易造成计算图构建的困扰。其次，中间层隐变量在过程式语言环境下无可避免地需要被储存，造成了内存管理的麻烦。更重要的是，python脚本语言的特性限制了其类型检查的功能，而程序员在开发深度学习的过程中不得不将大量精力用于保证矩阵大小的配合，而矩阵大小不匹配的错误，只有在运行时才会由硬件驱动抛出异常，会造成较大的运维风险。最后，缺少编译环节的脚本语言无法有效估计底层加速卡的资源占用情况，因而容易造成资源的浪费，在云计算和集群训练的时代会大大降低生产效率。

因此我们设计了Glacier(冰川)函数式编程语言，针对深度学习模型的日常开发和研究人员，目的是从函数式的视角重新描述深度学习的模型构建过程，解决上述框架的历史遗留问题，并通过TVM的Relay语言作为中间代码，最终编译成可被TVM加载的ONNX模型。

### 语言特性

考虑到纯函数式语言的特性，没有赋值语句和可修改变量会增大自动求导的难度。本语言的语法主要参考了函数式语言Haskell和过程式语言Python，并根据我们的需求对其语法进行截取。例如选取了Haskell的函数签名和类型系统。在人工智能的视野下，“川”是涌动的水流，是大数据时代的流式数据，也是模型训练中来回流动的梯度信息，“冰川”是大数据的凝练，是被学习固化的深度模型结构，也是模型中被永久保存的固定参数。为了提供基本的模型构建能力，Glacier语言提供的主要特性有：

1. Glacier是一个函数式编程语言。相对于命令式编程语言，Glacier**不保存任何的中间状态**，包括大型神经网络的中间变量。在Glacier中，函数将被认为是神经网络组成的最小单位。Glacier**不接受直接赋值操作**，它设计的基础理念是控制数据的流向而不是创造数据。在Glacier中，任何已经**freeze**的神经网络函数是**无副作用**的，如果一个神经网络函数被传入两次相同的参数，它输出的结果必定是相同的。这种**指代透明**的特性允许编译器对矩阵的形状进行推断，从而更好地管理内存。
2. Glacier是一个惰性语言。Glacier不会直接执行函数操作，除非必须使用它。这种惰性也体现在对显存的管理上，一个巨大的深度学习模型不会一次性被全部加载到显存，而是只加载需要进行计算的部分。另外，这种特征更贴近于数学中的概念，可以在语法上实现接近无穷序列。
3. Glacier是一个静态类型语言。这意味着当编译程序的时候，编译器知道目前的矩阵的大小，和即将链乘的矩阵大小，从而避免大量没有意义的修复矩阵不匹配，维度不对的错误。另外，编译器也可以推断出目前设备的显存占用情况，从而避免模型过大无法运行的情况。
4. Glacier是一个异构原生语言。Glacier将TVM的Relay IR作为中间代码，从而可以利用TVM完整的技术栈，向下兼容LLVM，CUDA，Metal，FPGA， ASIC各类设备。

## 语言的语法、语义规格说明

### Glacier 语法

Glacier 语法主要参考Haskell语言，部分参考Python语言，截取了两者和DL相关的部分。比如函数签名和类型系统等，其余部分比较相似，包括使用def定义函数，类型置于变量名后方等。

#### 关键字

Glacier语法中有下列关键字。

+ def
+ let
+ in
+ if
+ then
+ else
+ Grad
+ Zero
+ freeze
+ Ref
+ foldl
+ unfoldr
+ replicate
+ fold
+ unfold
+ map
+ tail
+ filter
+ relu
+ softmax
+ Tensor
+ List
+ Int
+ UInt
+ Float
+ Bool
+ Func
+ Shape

#### EBNF 语法

为了减少表达式数量，Glacier的语法使用EBNF表示，“;”代表一条EBNF表达式的结束。

···g4
WS: [ \t\r\n]+ -> skip;
COMMENT: '//' .*? '\n' -> skip;
program: (func|expr)*;

func: 'def' name  '::' (typeConstraint '=>')? params*  '{' (expr| func)* '}';


typeConstraint: '(' name (',' name)* ')';

expr: name
    | INT
    | FLOAT
    | 'True'
    | 'False'
    | expr '(' (expr (',' expr)*)? ')'
    | 'let' name (':' typeG)? '=' expr ('in' expr)?
    | '(' typeG ')' expr
    | expr binOp expr
    | unaryOp expr
    | '(' (expr (',' expr)*)? ')'
    | expr '[' INT ']'
    |'[' expr (',' expr)* ']'
    | 'if' expr 'then' expr 'else' expr
    | 'Zero' expr
    | 'Grad' expr
    | 'Ref' expr
    | '!' expr
    | expr ':=' expr
    |'\\' expr '->' expr
    | 'unfoldr' expr 
    | 'replicate' expr
    | 'foldl' '(' func | expr ',' expr ',' expr ')'
    | basicOp expr
    ;


basicOp: '@' basicFn;

basicFn:
    'relu'
    | 'softmax';

binOp: '+'
    | '-'
    | '*'
    |'/'
    |'!='
    |'='
    |'<'
    |'<='
    |'>='
    |'>'
    |'map'
    ;

unaryOp: '-'
    |'fold'
    |'unfold'
    |'map'
    |'tail'
    |'filter'
    ;

name: VAR;

param: (listG | tupleG | VAR) (':' typeG)?;

listG: '[' expr (',' expr)* ']';

tupleG: '(' expr (',' expr)* ')';

params: param ('->' param )*;

typeG: basetypeG
| shape
| 'Tensor' '(' basetypeG  (',' '(' INT (',' INT)* ')' )* ')'
| typeG '->' typeG
| '(' (typeG ('->' typeG)*)? ')'
| '['typeG (',' typeG)? ']'
| 'List' '[' name? ']'
| customType

;

customType:
name;

basetypeG: 'Int' 
    | 'UInt' 
    | 'Float' 
    | 'Bool'
    | 'List'
    | 'Func'
    ;

shape: 
    'Shape' '(' (INT (','INT)*)? ')';

VAR: [a-zA-Z_] ([a-zA-Z_] | INT)*;

INT: ('0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9')+;

SPACESL: ' '+;
FLOAT: INT '.' INT;

args: (SPACESL VAR|INT)+ ;

```

### Glacier 类型推导

### Glacier 内存优化

