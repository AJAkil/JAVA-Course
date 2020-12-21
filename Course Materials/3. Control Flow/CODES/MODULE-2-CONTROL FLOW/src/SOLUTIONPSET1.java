import java.util.Scanner;

public class SOLUTIONPSET1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //--------------------------Problem 1 solution: Leap year-----------------------------
        //System.out.print("Enter the year:  ");
        /*int year = scan.nextInt();

        if( year % 4 == 0 && year != 100 || year % 400 == 0 ){
            System.out.println("The year "+ year + " is a leap year!");
        }else{
            System.out.println("The year "+ year + " is not a leap year!");
        }*/


        //--------------------------Problem 2 solution: Triangle-----------------------------
       /* int a,b,c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        if( a == b && b == c )
            System.out.println("The triangle is Equilateral in nature");
        else if( a == b || b == c || c == a )
            System.out.println("The triangle is Isosceles in nature");
        else
            System.out.println("The triangle is Scalene in nature");*/


        //--------------------------Problem 3 solution: tea party-----------------------------
        int tea = scan.nextInt();
        int candy = scan.nextInt();

        if ( tea < 5 || candy < 5) System.out.println("The party is bad(0)");
        else if ( tea/ candy >= 2 || candy/tea >= 2 ) System.out.println("The party is great(2)");
        else if (tea + candy >= 5) System.out.println("The party is good(1)");


    }

}
