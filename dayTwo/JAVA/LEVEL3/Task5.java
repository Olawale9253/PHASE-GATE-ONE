import java.util.Scanner;

public class Factorial{

    public static void main(String args[]){

    Scanner userInput = new Scanner(System.in); 

    System.out.print("Enter number: ");

    int number = userInput.nextInt();
    
        int factorial = 1;
        
    for (int count = 1; count <= number; count++){

    factorial *= count;

        System.out.println("The factorial is: " + factorial);
}
}
}

