import java.util.Scanner;

public class sum{

    public static void main(String args[]){

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter number: ");
    
        int number = userInput.nextInt();

       if(number >= 0){

        System.out.println("Positive");
}
    else if (number < 0){

        System.out.println("Negative");
}
}
}
