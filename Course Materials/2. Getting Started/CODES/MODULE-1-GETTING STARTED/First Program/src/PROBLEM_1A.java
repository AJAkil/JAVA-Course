import java.util.Scanner;

public class PROBLEM_1A {

    public static void main(String[] args) {
            double x, y;
        Scanner scan = new Scanner(System.in);
        x = scan.nextDouble();
        y = scan.nextDouble();

        double calcResult;
        double calcResult2;

        //Addition
        calcResult = x + y;
        System.out.println((int)calcResult);

        //Subtraction
        calcResult = x - y;
        System.out.println(calcResult);

        //Multiplication
        calcResult = x * y;
        System.out.println(calcResult);

        //Division
        calcResult = x / y;
        System.out.println(calcResult);

        //Mod
        calcResult = x % y;
        System.out.println(calcResult);

        //Square
        calcResult = x * x;
        calcResult2 = y * y;
        System.out.println(calcResult + "  " + calcResult2);

        //Cube
        calcResult = x * x * x;
        calcResult2 = y * y * y;
        System.out.println(calcResult + "  " + calcResult2);

        //Mean or Average
        calcResult = (x + y) / 2;
        System.out.println(calcResult);



    }

}
