public class MultipleArray {
    public static void main(String[] args) {
        /*
        1. Summing up two arrays , one in normal way and another in reverse way to create a new one
        a[3] = { 1, 2, 3}
        b[3] = {4, 8, 7}
        result = {8, 10, 7}
         */
        /*int[] a = {1, 3, 4};
        int[] b = {4, 5, 6};
        int[] result = new int[a.length];
        //a[i]---> b[j]
        for (int i = 0, j = b.length-1; i < a.length ; i++, j--) {
            result[i] = a[i] + b[j];
        }

        for (int elem : result) {
            System.out.print(elem+ " ");
        }*/

        /*
        Finding the common elements between two array and printing them
        a[3] = {1,2,3}
        b[4] = {2,3,6,9}
        we print [2,3]
         */
        /*int[] a = {1,2,3};
        int[] b = {2,3,6,9};

        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < b.length ; j++) {
                if(a[i] == b[j]){
                    System.out.println("common value = "+ a[i]);
                    break;
                }
            }
        }*/


        /*
        Merging two sorted array into one array
         */
        int[] a = {1,2,4};
        int[] b = {3,5}; //result = {1,2,3,4,5}
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while ( i < a.length && j < b.length){
            //check if the current element of the first array is larger or smaller than the second array
            if( a[i] < b[j]){
                result[k] =  a[i];
                i++;
                k++;
            }else{
                result[k] = b[j];
                j++;
                k++;
            }
        }

        while (i < a.length ){
            result[k] = a[i];
            k++;
            i++;
        }

        while (j < b.length ){
            result[k] = b[j];
            k++;
            j++;
        }

        for ( int element:
             result) {
            System.out.println(element);
        }







    }
}
