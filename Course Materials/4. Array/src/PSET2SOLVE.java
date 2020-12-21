import java.util.Scanner;

public class PSET2SOLVE {
    public static void main(String[] args) {

        //-----------------------------------Problem 1 Solution ---------------------------------------


        int row1, col1, row2, col2;
        Scanner scan = new Scanner(System.in);

        row1 = scan.nextInt();
        col1 = scan.nextInt();

        row2 = scan.nextInt();
        col2 = scan.nextInt();

        int[][] matrix1 = new int[row1][col1];
        int[][] matrix2 = new int[row2][col2];

        //taking input of the first matrix
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                matrix1[i][j] = scan.nextInt();
            }
        }

        //taking input of the second matrix
        for (int i = 0; i < row2 ; i++) {
            for (int j = 0; j < col2; j++) {
                matrix2[i][j] = scan.nextInt();
            }
        }

        //check the condition of matrix multiplication
        if( col1 != row2){
            System.out.println("Error! The matrices can not be multiplied!");
        }else{
            
            int[][] r = new int[row1][col2];
            int sum = 0;

            for (int i = 0; i <row1 ; i++) {
                for (int j = 0; j < col1 ; j++) {
                    for (int k = 0; k < col1; k++) {
                        sum += matrix1[i][k] * matrix2[k][j];
                    }

                    r[i][j]= sum;
                    sum = 0;
                }
            }

            for (int i = 0; i < row2 ; i++) {
                for (int j = 0; j < col2; j++) {
                    System.out.print(r[i][j]+" ");
                }
                System.out.println();
            }


            
        }
        

    }
}
