import torch
import torch.nn as nn
import torch.nn.functional as F
from predefine import *

def Linear(Weight, Bias, Input):
    Output = Weight @ Input + Bias
    return Output
    
def Linear2(Weight, Bias, Input):
    Output = Weight @ Input + Bias
    return Output
    
def Relu(Weight, Bias, State, Input):
    x = gpartial(Linear, Input, Weight[0], Bias[0])
    s = gpartial(Linear, State, Weight[1], Bias[1])
    Output = (s, F.relu((x + s)))
    return Output
    
def trained_cell(Weight, Bias):
    def fn(State, Input):
        return gpartial(Relu, Weight, Bias, State, Input)
        
    return fn
    
def Encode(Cell, Input, Initial, FinalState):
    return foldl(lambda State, In: gpartial(Cell, State, In)[0], Initial, Input)
    
state = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
x = [[1, 2, 3]]
