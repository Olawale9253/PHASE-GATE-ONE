import random

number = random.randint(1, 100) + 1 

attempt_number = 0

print("Enter a number between 1 and 100")

while attempt_number < 5:

    guess_number = input("Guess Number: ")
    
    if not guess_number.isdigit():

        print("That's not a number! ")

        continue
    
    guess_number = int(guess_number)
    
    if guess_number < 1 or guess_number > 100:

        print("Between 1 and 100 only!")

        continue
    
    attempt_number = attempt_number + 1
    
    if guess_number == number:

        print("You guess right")

        break

    elif guess_number < number:

        print("your guess is low")

    else:

        print("Your guess is high")


print("The number was", number)

print("You used", attempt_number, "attempts")
