import java.util.Scanner;

public class SingleArray {
    public static void main(String[] args) {

        /*
         * 1. To check whether an array has a specific number or not
         */
        /*Scanner size = new  Scanner(System.in);
        int n = size.nextInt();
        int[] a = new int[n];
        int valueToBeChecked;
        Scanner value = new Scanner(System.in);
        valueToBeChecked = value.nextInt();

        //initializing array with numbers
        for (int i = 0; i <n ; i++) {
            a[i] = i+1;//1,2,3-->5
        }

        //checking for a certain value in an array
        for (int i = 0; i < n ; i++) {
            if(a[i] == valueToBeChecked){
                System.out.println("The value is found");
                break;
            }
        }*/










        /*
        2. To reverse print and also reverse the elements of an array
         */
        /*Scanner size = new  Scanner(System.in);
        int n = size.nextInt();
        int[] a = new int[n];

        //initializing array with numbers
        for (int i = 0; i <n ; i++) {
            a[i] = i+1;
        }

        int lastIndex = n-1;// 5-> lastIndex = 5-1 = 4
        for (int i = 0; i < n  ; i++) {
            System.out.print(a[i]+ " ");
        }*/
        /*System.out.println();
        for (int i = lastIndex; i >= 0 ; i--) {
            System.out.print(a[i]+ " ");
        }*/

        /*int temp;
        for (int i = 0; i <n/2 ; i++) {
            //swapping
            temp = a[i];
            a[i] = a[n-i-1];
            a[n-i-1] = temp;
        }

        System.out.println();
        for (int i = 0; i < n  ; i++) {
            System.out.print(a[i]+ " ");
        }*/
        
        











        /*
        3. To find the maximum and minimum value of an array
         */
        Scanner size = new  Scanner(System.in);
        int n = size.nextInt();
        int[] a = new int[n];

        //initializing array with numbers
        for (int i = 0; i <n ; i++) {
            a[i] = i+1;
        }

        int min,max = -1;
        min = a[0];
        //minimum finding
        for (int i = 0; i <n ; i++) {
            if(a[i] < min) min = a[i];
        }

        max = a[0];
        //minimum finding
        for (int i = 0; i <n ; i++) {
            if(a[i] > max) max = a[i];
        }

        System.out.println();
        for (int i = 0; i < n  ; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println(min);
        System.out.println(max);








    }
}
