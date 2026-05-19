import java.util.Scanner;

public class sum{

    public static void main(String args[]){

    Scanner userInput = new Scanner(System.in); 

    System.out.print("Enter number: ");

    int number = userInput.nextInt();

    int sum = number;
        
    for (int count = 1; count <= number; count++){

    sum += number;

        System.out.println("Table of: " + sum);
}
}
}

