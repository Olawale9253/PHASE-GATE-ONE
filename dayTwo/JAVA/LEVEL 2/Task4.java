import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in);

    System.out.print("Enter first number: ");

    int firstNumber = userInput.nextInt();

    System.out.print("Enter second number: ");

    int secondNumber = userInput.nextInt();

    int largest = firstNumber;

    if (secondNumber > largest) 

    largest = secondNumber;

    System.out.println("Largest number is: " + largest);

}
}
