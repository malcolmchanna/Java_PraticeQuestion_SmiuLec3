
import java.util.Scanner;
public class MaxFinder {


    public void deterMine() {
        Scanner input = new Scanner(System.in);
        double num1, num2, num3;
        System.out.println("Enter Three value");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();

        double result = maximun(num1, num2, num3);

        System.out.println("the Max value is: "+result);
    }

    public double maximun(double x, double y, double z) {
        double maxValue = x;          //suppose X is maximunm Value
        if (y > maxValue) {
            maxValue = y;
        }
        if (z > maxValue) {
            maxValue = z;
        }
        return maxValue;
    }

    public static void main(String[] args) {
        MaxFinder maxFinder = new MaxFinder();
        maxFinder.deterMine();
    }


}
        //    public void determineMax(){
//        Scanner input = new Scanner(System.in);
//
//        double number1 , number2 , number3 ;
//        System.out.println("enter three floating vlaues separated by space");
//        number1 = input.nextDouble();
//        number2  = input.nextDouble();
//        number3  = input.nextDouble();
//
//        double result = maximum(number1 , number2  ,number3);
//        System.out.println("MAximum number is:" + result);
//    }
//
//    public double maximum(double x , double y , double z) {
//        double maximumValue = x;
//        if (y > maximumValue) {
//            maximumValue = y;
//        }
//        if (z > maximumValue) {
//            maximumValue = z;
//        }
//return  maximumValue;
//    }
//
//    public static void main(String[] args) {
//        MaxFinder maxFinder = new MaxFinder();
//        maxFinder.determineMax();
//    }
//    }
9