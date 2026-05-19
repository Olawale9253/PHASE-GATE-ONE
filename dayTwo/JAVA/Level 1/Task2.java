import java.util.Scanner;

public class userAge{

    public static void main(String args[]){

        Scanner userInput = new Scanner(System.in);

    System.out.print("Enter your age: ");

    int age = userInput.nextInt();

    int yearsOld = age + 5;

    System.out.println("In the next 5 years you will be " + yearsOld + " years old");
}
}
