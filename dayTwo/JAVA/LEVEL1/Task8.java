import java.util.Scanner;

public class square{

    public static void main(String args[]){

        Scanner userInput = new Scanner(System.in);

    System.out.print("Enter number: ");

    int number = userInput.nextInt();

    int square = number * number;

    System.out.println("The square of a number is " + square);
}
}
