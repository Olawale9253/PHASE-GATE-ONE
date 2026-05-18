import java.util.Scanner;

import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in);

        int number = 0;

        Random random = new Random();

    for(int count = 1; count <= 5; count++){

        System.out.print("Guess the number: ");

        number = random.nextInt(100);

        int guessNumber = userInput.nextInt();

    if(guessNumber != number.Int ){
    
          System.out.println("That's not a number'");

    continue;
}

   else if(guessNumber > number){

        System.out.println("Your guess is higher");
}

    else if(guessNumber < number){

            System.out.println("Your guess is lower");
}

    else if(guessNumber == number){
        
            System.out.println("You guess right");

    break;
}
  

}
            

    
       

 


    
}
}

















