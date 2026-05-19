import java.util.Scanner;

public class sum{

    public static void main(String args[]){

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter number: ");
    
        int number = userInput.nextInt();

       if(number % 2 == 0){

        System.out.println("Even Number");
}
    else if (number % 2 == 1){

        System.out.println("Odd Number");
}
}
}
