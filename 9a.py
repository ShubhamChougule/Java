def circle(radius):
	area = 3.1415 * radius * radius
	circum = 2 * 3.1415 * radius
	print("area of circle is : ", area)
	print("circumference of circle is : ", circum)
	
radius = float(input("Enter radius of circle : "))
circle(radius)
