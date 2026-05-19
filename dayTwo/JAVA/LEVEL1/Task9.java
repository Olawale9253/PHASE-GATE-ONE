import java.util.Scanner;

public class userAge{

    public static void main(String args[]){

        Scanner userInput = new Scanner(System.in);

    System.out.print("Enter the price number: ");

    int price = userInput.nextInt();

    double tax = price * 0.1;

    System.out.println("The tax is: " + tax);
}
}
