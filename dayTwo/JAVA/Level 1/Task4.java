import java.util.Scanner;

public class Product{

    public static void main(String args[]){

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter first number: ");
    
        int firstNumber = userInput.nextInt();

       System.out.print("Enter second number: ");
    
      int secondNumber = userInput.nextInt();

      int result = firstNumber * secondNumber;

     System.out.println("The product of two number is: " + result);
}
}
