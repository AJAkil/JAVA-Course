import java.util.Scanner;

public class PSET1SOLVE {

    public static void main(String[] args) {

        //-----------------------------------Problem 1 Solution ---------------------------------------
        /*Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();

        int[] a = new int[size];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        int firstMin, firstMax, secondMin, secondMax = -1;

        //finding the second maximum number
        firstMax = a[0];
        secondMax = a[1];

        // 1 3 4 2

        for (int i = 2; i < a.length; i++) {

            if( a[i] > firstMax ){

                secondMax = firstMax;
                firstMax = a[i];

            }else if( a[i] > secondMax ){
                secondMax = a[i];
            }

        }

        //finding the second maximum number
        firstMin = a[0];
        secondMin = a[1];

        // 1 3 4 2

        for (int i = 2; i < a.length; i++) {

            if( a[i] < firstMin ){

                secondMin = firstMin;
                firstMin = a[i];

            }else if( a[i] < secondMin ){
                secondMin = a[i];
            }

        }

        System.out.println("The second maximum is "+secondMax+" and second minimum is "+secondMin);*/




        //-----------------------------------Problem 2 Solution ---------------------------------------
        /*Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();

        int[][] a = new int[size][size];

        //taking input
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size ; j++) {
                a[i][j] = scan.nextInt();
            }
        }

        //printing the 2D array
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size ; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        //simple way to transpose
        *//*int[][] result = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size ; j++) {
               result[j][i] = a[i][j];
            }
        }*//*

        //second way
        int temp= -1;
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size ; j++) {
                temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }

        }


        //printing the 2D array
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size ; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }*/





        //-----------------------------------Problem 3 Solution ---------------------------------------
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size ; i++) {
            array[i] = scan.nextInt();
        }


        int max, min, secondMin;

        int arrLen = array.length;

        max = array[0];

        //finding the max
        for (int i = 1; i < arrLen; i++) {
            if (array[i] >max) {

                max= array[i];

            }
        }

        min = array[0];
        secondMin = array[1];
        for (int i = 2; i < arrLen; i++) {
            if (array[i] < min) {

                secondMin = min;
                min = array[i];

            } else if (array[i] < secondMin) {
                secondMin = array[i];
            }
        }

        System.out.println("Maximum difference pair: ("+max+","+min+")");
        System.out.println("Minimum difference pair: ("+min+","+secondMin+")");





    }
}

