import java.util.Scanner;

public class MoreConditionals {
    public static void main(String[] args) {

        // program to find the largest number among three numbers
        /*
        int a = 10;
        int b = 1000;
        int c = 1000;

        if( a >= b && a >= c){
            System.out.println(a+" is the largest number");
        }else if ( b >= a && b >= c){
            System.out.println(b+" b  is the largest number");
        }else{
            System.out.println(c+" is the largest number");
        }
        */

        //program to check a number is positive or negative, if positive then check if the number is odd or even
        //and check to see if the number is zero or not
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        //check if the number is positive or negative
        if( number > 0){

            // if 4 is completely divisible by 2 %
            // 4 / 2 = 2 and 4 % 2  = 0  6 / 2 = 3, 6 % 2 = 0, 188/2 = 94, 188 % 2 = 0

            //checking if the number is even
            if( number % 2 == 0){
                System.out.println("The number  "+ number + " is both positive and even");
            }else { //for odd
                System.out.println("The number  "+number + "is both positive and odd");
            }

        } else if (number < 0) {
            System.out.println("The number is negative and it is = "+number);
        }else{
            System.out.println("The number is equal to zero");
        }





    }
}
