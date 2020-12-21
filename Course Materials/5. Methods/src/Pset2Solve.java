import java.util.Scanner;

public class Pset2Solve {
    //----------------------------------Problem 1 Solution---------------------------------
    public void nFibSeq(int n){
        if( n == 1){
            System.out.println(0);
        }else if( n == 2){
            System.out.print(0+" "+1);
        }else if( n > 2 ){
            int[] fib = new int[n];
            fib[0] = 0;
            fib[1] = 1;
            for (int i = 2; i < fib.length; i++) {
                fib[i] = fib[ i - 1 ] + fib[ i - 2 ];
            }

            for (int i = 0; i < fib.length; i++) {
                System.out.print(fib[i]+" ");
            }
        }
    }

    //----------------------------------Problem 2 Solution---------------------------------
    public void findLeaders(int[] experience){
        // 5 1 3 2 4
        for (int i = 0; i < experience.length-1 ; i++) {
            int j;
            for ( j = i+1 ; j < experience.length; j++) {
                if( experience [i] < experience[j] ) break;
            }

            // if we complete the inner loop without breaking, then we  found a leader
            if( j == experience.length)
                System.out.println("The person with experience " + experience[i] + " is a leader ");
        }
    }

    //----------------------------------Problem 3 Solution---------------------------------
    public void findArea(int a, int b , int c){
        //Check the sides for triangle validity
        //if sum of any two sides of a triangle is greater than the third side, it is a valid triangle
        if( a + b < c || a + c < b || b + c < a){
            System.out.println(" The measurements do not represent a valid triangle.");
        }else{

            double x  = (double) a;
            double y = (double) b;
            double z = (double) c;
            double p = (x + y + z);
            double s = p/2;
            double area = Math.sqrt(s*(s-x)*(s-y)*(s-z));

            System.out.printf("The area = %.2f",area);

        }
    }

    public static void main(String[] args) {
        Pset2Solve obj  = new Pset2Solve();
        Scanner scan = new Scanner(System.in);
        //obj.nFibSeq(scan.nextInt());
        /*int [] exp = {5,1,3,2,1};
        obj.findLeaders(exp);*/
        obj.findArea(1,1,3);
    }
}
