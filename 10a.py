def swap(a, b):
    a,b = b,a
    return a,b
    
A = int(input("Enter first number: "))
B = int(input("Enter second number: "))
print("Before swapping A :", A)
print("Before swapping B :", B)
A,B = swap(A, B)
print("After swapping A :", A)
print("After swapping B :", B)