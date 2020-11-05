package com.company;

import java.util.Random;

public class SixDie {

    public static void main(String[] args) {
        Random rollDie = new Random();  // random number genertor
        int fre1 = 0;    // maintain count 1s rolled
        int fre2 = 0;    // count of 2s rolled
        int fre3 = 0;   // count of 3s rolled
        int fre4 = 0;   // count of 4s rolled
        int fre5 = 0;  // count of 5s rolled
        int fre6 = 0;  // count of 6s rolled

        int face; // store radmon value

        //tally count for 6000 rolls of a die
        for (int roll = 1; roll <= 6000; roll++) {
            face = 1 + rollDie.nextInt(6);
              //end switch
            switch (face) {
                case 1:   ++fre1;  // incecemt the 1s rolled
                    break;
                case 2:   ++fre2; // incecemt the 2s rolled
                    break;
                case 3:   ++fre3; // incecemt the 3s rolled
                    break;
                case 4:   ++fre4; // incecemt the 4s rolled
                    break;
                case 5:   ++fre5; // incecemt the 5s rolled
                    break;
                case 6:   ++fre6;   ///incecemt the 6s rolled
                    break;
            }
        } //end for
        System.out.println("face/tFrequency");
        System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d" , fre1 ,fre2 ,fre3 ,fre4 ,fre5 ,fre6);
    }
}

