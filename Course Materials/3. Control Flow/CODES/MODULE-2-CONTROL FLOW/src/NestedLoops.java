import java.util.Scanner;

public class NestedLoops {

    public static void main(String[] args) {
        //--------------------- Basic demonstration of nested loops------------------------
        /*for (int i = 0; i < 3; i++) {
            System.out.print("Outer loop value: ");
            System.out.println(i);
            for (int j = 0; j <3 ; j++) {
                System.out.print("Inner loop value: ");
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            System.out.print("Outer loop value: ");
            System.out.println(i);
            for (int j = 0; j <= i ; j++) {
                System.out.print("Inner loop value: ");
                System.out.print(j + " ");
            }
            System.out.println();
        }*/

        //--------------------- Basic Number Pyramid ------------------------
        Scanner scan = new Scanner(System.in);
        /*
            1
            1  2
            1   2   3
            1   2    3   4

                              1
                         1   2
                    1    2   3
         */
        /*int row = scan.nextInt();
        for (int i = 1; i < row+1 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }*/

        /*int row = scan.nextInt();
        row = row + 1;
        for (int i = 1; i < row; i++) {

            //loop for printing space/ stars
            for (int j = 1; j < (row-i); j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }*/

        //-------------------------Series Sum with nested loops--------------------
        //  Sum up the given series: 1 + (1 + 2 ) + (1 + 2 + 3)
        System.out.println("Enter the value of n: ");
        int n = scan.nextInt();
        int sum = 0;
        int innerSum = 0;
        for (int i = 1; i <= n ; i++) {
            System.out.println("Going to inner loop: ");
            innerSum = 0;
            for (int j = 1; j <= i ; j++) {
                System.out.println("adding : "+j);
                innerSum += j;
            }
            System.out.println("Inner Series Sum = "+innerSum);
            sum += innerSum;
        }

        System.out.println("Sum = "+sum);




    }
}
