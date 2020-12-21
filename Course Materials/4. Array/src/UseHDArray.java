import java.util.Scanner;

public class UseHDArray {
    public double calculateArea(int base, int height){
        double result;
        result = 0.5 * base * height;
        return result;
    }

    public  int[] convertToBinary(int num){
        int[] result = new int[1000];

        for (int i = 0; i < 1000; i++) {
            result[i] = -1;
        }

        int i = 0;
        while (num != 0) {
            result[i] = num % 2;
            num = num / 2;
            i++;
        }
        return result;


    }

    public static void main(String[] args) {
        /*//Generating a multiplication Table  by the user
        *//*Scanner scan = new Scanner(System.in);
        int[][] multTable = new int[scan.nextInt()][scan.nextInt()];

        for (int i = 0; i < multTable.length ; i++) {
            for (int j = 0; j < multTable[i].length; j++) {
                multTable[i][j] = (i+1) * (j+1);
            }
        }

        //printing the table
        for (int i = 0; i < multTable.length ; i++) {
            for (int j = 0; j < multTable[i].length ; j++) {
                System.out.print(multTable[i][j]+" ");
            }
            System.out.println();
        }*//*

        //Student Grading system
        double[][] studentGrade = new double[5][3];

        //Taking marks as input
        Scanner scan = new Scanner(System.in);

        //Using loop to take input of marks
        for (int i = 0; i < studentGrade.length ; i++) {
            for (int j = 0; j < studentGrade[i].length; j++) {
                studentGrade[i][j] = scan.nextDouble();
            }
        }

        //Showing the average GPA of the students along with their roll
        //formula = ((avg of marks)/100)*5
        double avg = 0, sum, GPA = 0;
        int rollNo;
        for (int i = 0; i <studentGrade.length ; i++) {
            sum = 0;
            for (int j = 0; j < studentGrade[i].length; j++) {
                //summing up the marks of individual students
                sum = sum + studentGrade[i][j];
            }
            //Once we obtain the sum we find the average value of the students
            avg = (sum)/3;
            GPA = (avg/100)*5;
            rollNo = i+1; // i = 0 roll = 0+1 = 1
            System.out.println("Roll: "+ rollNo + " GPA: " + GPA);
        }

        //Highest marks of each subject of the mark-sheet of students
        double max = -1.0;

        for (int col = 0; col < 3; col++) {

            for (int row = 0; row < 5; row++) {

                if(studentGrade[col][row] > max){
                    max = studentGrade[col][row];
                }
                System.out.println("The highest mark is " + max);
            }
        }
*/
        UseHDArray uhd = new UseHDArray();
        int[] intToBinary = uhd.convertToBinary(6);

        int i = 0;
        while (intToBinary[i] != -1){
            i++;
        }

        i--;

        while (i>=0){
            System.out.println(intToBinary[i]);
            i--;
        }
    }
}
