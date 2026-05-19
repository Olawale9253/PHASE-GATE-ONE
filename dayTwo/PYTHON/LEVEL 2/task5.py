first_number = int(input("Enter first integer: "))

second_number = int(input("Enter second integer: "))

third_number = int(input("Enter third integer: "))

largest = first_number

if second_number > largest: 

    largest = second_number

if third_number > largest: 

    largest = third_number


print(f"Largest: {largest}")

