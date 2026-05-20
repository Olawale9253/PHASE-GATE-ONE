import java.util.Scanner;

public class MiniParking{

    public static void main(String args[]){

//    int [] parkingSlot = {20};

    Scanner userInput = new Scanner(System.in);
    
       System.out.println(displayPark());
    
        System.out.println(parkCar());

}

    public static int displayPark(int[] parkingSlot){

        System.out.println("Parking status");

    for(int count = 0; count < parkingSlot.length; count++){

        if (parkingSlot == 0){
    
        System.out.println("slot" + (count) + "is empty");
}

    else {
        
        System.out.println("slot" + (coun)t + "is occupied");

    return parkingSlot;
}

    public static int parkCar(int[] Slot){
    
      for(int count = 1; count < parkingSlot.length; count++){
        
        if(parkingSlot == 1){

        System.out.println("car parked at slot" + count + 1);

    return Slot;
}
}
}
}
