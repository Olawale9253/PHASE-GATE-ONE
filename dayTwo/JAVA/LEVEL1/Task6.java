import java.util.Scanner;

public class sum{

    public static void main(String args[]){

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter length number: ");
    
        int length = userInput.nextInt();

       System.out.print("Enter width number: ");
    
      int width = userInput.nextInt();

      int area = length * width;

     System.out.println("The area of length and width is: " + area);
}
}
