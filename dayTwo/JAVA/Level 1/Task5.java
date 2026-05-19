import java.util.Scanner;

public class sum{

    public static void main(String args[]){

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter temperature number: ");
    
        int Celsius = userInput.nextInt();
    
      double Farenheit = (Celsius * 9/5) + 32;

     System.out.println("The result is: " + Farenheit);
}
}
