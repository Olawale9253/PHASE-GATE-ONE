import java.util.Scanner;

public class HorizontalLoop{

    public static void main(String args[]){

    Scanner userInput = new Scanner(System.in); 

    System.out.print("Enter number: ");

    int number = userInput.nextInt();
        
    for (int count = 1; count <= 12; count++){

        System.out.println("Table of: " + count * number);
}
}
}

