from inspect import signature
from functools import partial

def gpartial(func, *args, **kargs):
    sig = signature(func)
    num_args = len(sig.parameters)
    if len(args) + len(kargs) == num_args:
        return func(*args, **kargs)
    else:
        return partial(func, *args, **kargs)

def foldl(func, init, seq):
    if len(seq) > 0:
        return foldl(func, func(init, seq[0]), seq[1:])
    else:
        return init

def foldr(func, init, seq):
    if len(seq) > 0:
        return foldl(func, func(init, seq[-1]), seq[:-1])
    else:
        return init


def replicate(x, num):
    return [x] * num

def unfoldr(func, state):
    gen = []
    while True:
        res = func(state)
        if res in None:
            break
        output, state = res
        gen.append(output)
    return gen


if __name__ == "__main__":
    def add(a, b, c):
        return a+b+c
    print(gpartial(add,1,2,3))
    print(gpartial(gpartial(add,1),2))
    print(gpartial(gpartial(gpartial(add,1),2),3))