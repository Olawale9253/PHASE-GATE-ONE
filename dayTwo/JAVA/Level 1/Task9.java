import java.util.Scanner;

public class userAge{

    public static void main(String args[]){

        Scanner userInput = new Scanner(System.in);

    System.out.print("Enter the price number: ");

    int price = userInput.nextInt();

    int tax = price * (10/100);
    System.out.println("The tax is: " + price);
}
}
