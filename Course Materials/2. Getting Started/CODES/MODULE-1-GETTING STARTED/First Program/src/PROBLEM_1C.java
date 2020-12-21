import java.util.Scanner;

public class PROBLEM_1C {

    public static void main(String[] args) {

        double a, b;
        Scanner scan = new Scanner(System.in);
        a = scan.nextDouble();
        b = scan.nextDouble();

        int x, y;
        x = (int) a;
        y = (int) b;

        //First method --> using a third variable
        int z; //x = 1, y = 2
        //z = x; //z = 1
        //x = y; // x = 2
        //y = z ;// y = 1

        //System.out.println(x);
        //System.out.println(y);

        //Second Method --> Slightly complicated
        //x = 1, y = 2
        x = x + y; // x = 1 + 2 = 3
        y = x - y; // y = 3 - 2 = 1(x)
        x = x - y ;// x = 3 - 1 = 2(y)

        System.out.println(x);
        System.out.println(y);


    }

}
