def myfunction(a):
    return lambda b : b * a

fun1 = myfunction(5)
print("multiplication of 5 and 6 :", fun1(6))