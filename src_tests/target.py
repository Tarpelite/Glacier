import torch
import torch.nn as nn
import torch.nn.functional as F
from predefine import *


def Linear(Weight, Bias, Input):
    Output = Weight @ input + Bias
    return Output

def Linear2(Weight, Bias, Input):
    Output = Weight @ Input + Bias
    return Output

def Relu(Weight, Bias, State, Input):
    x = Linear(Input, Weight[0], Bias[0])
    s = Linear(State, Weight[1], Bias[1])
    res = (s, F.relu(x + s))
    return res

def tained_cell(Weight, Bias):
    def fn(State, Input):
        res = Relu(Weight, Bias, State, Input)
        return res
    return fn

def Encode(Cell, Input, Initial, FinalState):
    res = foldl(lambda State, In: Cell(State, In)[0], Initial, Input)
    return res

