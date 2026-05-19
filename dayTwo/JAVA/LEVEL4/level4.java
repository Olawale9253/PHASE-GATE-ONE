
public class level4{

    public static void main(String args[]){
    
    System.out.println(additionOfTwoNumbers(2, 5));
    
    System.out.println(CheckEvenNumber());

    System.out.println(SquareOfANumber());

    System.out.println(convertCelsiusToFarenheit());

    System.out.println(primeNumber());

    System.out.println(largestNumbers(3, 5, 7));

    System.out.println(areaOfARectangle(12, 10));

}

    public static int additionOfTwoNumbers(int firstNumber, int secondNumber){

        return firstNumber + secondNumber;
}

    public static int CheckEvenNumber(){

        int number = 2;

        if(number % 2 == 0){
    
        System.out.println("even");
}
    return number;
}

    public static int SquareOfANumber(){

        int number = 3;

        int square = number * number;

       return square;
}

    public static int convertCelsiusToFarenheit(){

        int celsius = 10;

        int Farenheit = (celsius * 9/5) + 32;

     return Farenheit; 
}

    public static int primeNumber(int number){
    
        boolean prime = false;

    for(int count = 2; count <= number/2; count++){

        if(number % count != 0){

    return true;    
}
   
}

    return false;
}

    public static int largestNumbers(int firstNumber, int secondNumber, int thirdNumber){

       int largest = firstNumber;
    
        largest = secondNumber;

        largest = thirdNumber;

    if(secondNumber > largest){

        largest = secondNumber;
}
    else if(thirdNumber > largest){

        largest = thirdNumber;
}
    return largest;
}

    public static double simpleInterest(){
    
        int principal = 250;

        int rate = 6;

        int time = 20;
    
    double interest = (principal * rate * time) / 100;

    return interest;
}

    public static int areaOfARectangle(int length, int width){

        return length * width;
}

}



