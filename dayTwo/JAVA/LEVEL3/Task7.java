import java.util.Scanner;

public class sum{

    public static void main(String args[]){

    Scanner userInput = new Scanner(System.in);

    int sum = 0;
        
    for (int count = 1; count <= 5; count++){
    
        System.out.print("Enter number: ");    
    
         int number = userInput.nextInt();

    sum += number;

    System.out.println("The sum is: " + sum);
    

       
}
}
}

