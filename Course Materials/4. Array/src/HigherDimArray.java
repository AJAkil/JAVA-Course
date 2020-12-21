import java.util.Scanner;
public class HigherDimArray {
    public static void main(String[] args) {
        //creating 2D array
        int[][] a  = new int[2][3]; // 2 x 2 2D array is created
        String[][][] b = new String[2][2][2]; //2x2x2 3D array is created

        a[0][0] = 1;
        a[0][1] = 2;
        a[1][0] = 3;
        a[1][1] = 4;

        //System.out.println(a[0][0]);

        b[0][0][0] = "A";
        b[0][0][1] = "B";
        b[0][1][0] = "C";
        b[0][1][1] = "D";
        b[1][0][0] = "E";
        b[1][0][1] = "F";
        b[1][1][0] = "G";
        b[1][1][1] = "H";

        //System.out.println(a.length);
        //System.out.println(a[0].length);

        /*for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }*/

        for (int i = 0; i < b.length ; i++) {
            for (int j = 0; j < b[i].length; j++) {
                for (int k = 0; k <b[i][j].length ; k++) {
                    System.out.print(b[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }


    }
}
