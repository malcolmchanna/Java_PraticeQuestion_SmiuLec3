package com.company;
import java.util.Random;

public class Craps {
    private static final Random randomNumbers = new Random();

    //enumeration with constant that repesent the game staues
    private enum Status {CONTINUE, WON, LOST}

      // declare constant for the game stuts

    private static final int SNAKES_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public void play() {
        int myPoint = 0 ;  //point if no win or loss on first roll
        Status gameStatus;
        int sumOfDice = rollDice(); //firstRoll of the dice

        //determine game staus  and piont on first roll
        switch (sumOfDice) {
            case SEVEN:  //win with 7 on firstRoll
            case YO_LEVEN:// win with 11 on firstRoll
                gameStatus = Status.WON;
                break;
            case SNAKES_EYES: //loos with 2 on firstRoll
            case TREY: //loose with 3on firstRoll
            case BOX_CARS: // losss by 12
                gameStatus = Status.LOST;
                break;
            default: //did not win or lose, so remeber piont
                gameStatus = Status.CONTINUE; //game is not over
                myPoint = sumOfDice;//remeber the piont
                System.out.println("piont is" + myPoint);
                break;
        }//end switch
        //game is not complete
        while (gameStatus == Status.CONTINUE) // not WON or Lost
        {
            sumOfDice = rollDice(); //roll dice again

            //determine game status
            if (sumOfDice == myPoint) {
                gameStatus = Status.WON;
            } else if (sumOfDice == SEVEN)//lose by rolling 7 before piont
                gameStatus = Status.LOST;
        }//end whiel

        //display won or lost message
        if (gameStatus == Status.WON) {
            System.out.println("player Win");
        } else {
            System.out.println("player lose");
        }
    }  //end method play

    //roll dice, calcute sum and display results
    public int rollDice() {
        //pick random die values
        int die1 = 1 + randomNumbers.nextInt(6); //first die roll
        int die2 = 1 + randomNumbers.nextInt(6); //second die roll

        int sum = die1 + die2;
        //display result of thids roll
        System.out.printf("player roll %d + %d = %d\n", die1, die2, sum);
        return sum;
    } //end methosd roll


    }
class CrapsTest {
    public static void main(String[] args) {
        Craps game = new Craps();
        game.play();
    }

}
//end class craps
