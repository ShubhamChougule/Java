def area_of_rectangle(l,b):
	area = l * b
	return area
	
def arbitory_args(*args):
	print(args[2], " is the third fruit")
	
def keyword_args(f3, f2, f1):
	print("third fruit is ", f3)
	
def arbitory_key_args(**name) :
	print("his last name is : ", name['lname'])
	
	
	
print("Area of rectangle is : ", area_of_rectangle(10, 5))		
	
arbitory_args("banana", "apple", "strawberry")

keyword_args(f1 = "apple", f2 = "banana", f3 = "jackfruit")

arbitory_key_args(fname = "shubham", mname = "sanjay", lname = "chougule")
