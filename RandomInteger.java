package com.company;
import java.util.Random;           //progrma use class rendam

public class RandomInteger {
    public static void main(String[] args) {
      Random randomNumbers = new Random();
      int face ; //store each random integer generted

     for (int counter = 1 ; counter <=20 ; counter++){
         //pick random interger from 1 to 6

         face = 1 +  randomNumbers.nextInt(6);

         System.out.printf(" %d " ,face);  // display generated value

         if (counter % 5 == 0){
             System.out.println("end");
         }// end for
     }//end main

    }//end class radominterger

}
