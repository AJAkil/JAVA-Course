package ProblemSetSolve;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t1,t2,t3,t4,t5;

        t1 = scan.nextInt(); //x1
        t2 = scan.nextInt(); //x2

        t3 = scan.nextInt(); //A
        t4 = scan.nextInt(); //B
        t5 = scan.nextInt(); //C

        Point p = new Point(t1, t2);
        Line l = new Line(t3, t4, t5);

        double absVal = Math.abs(l.getA()*p.getX() + l.getB()*p.getY() + l.getC()); //Ax1 + By1 + C
        double sqrtVal = Math.sqrt(Math.pow(l.getA(), 2) + Math.pow(l.getB(), 2));
        double d = absVal/sqrtVal;

        System.out.printf("The d value is = %.3f", d);


    }
}
