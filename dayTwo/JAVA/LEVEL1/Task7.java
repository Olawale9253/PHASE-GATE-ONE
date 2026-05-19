import java.util.Scanner;

public class radius{

    public static void main(String args[]){

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter radius number: ");
    
        int Radius = userInput.nextInt();
    
      double circumference = (2 * 22/7) * Radius;

     System.out.println("The result is: " + circumference);
}
}
