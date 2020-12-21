public class Array {
    public static void main(String[] args) {

        //type[] array_name = new type[size]
        int size = 5;
        int[] array = new int[size];
        double[] a = new double[10];
        int[] b = {1,2,3};

        //b[1]
        /*System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);*/

        //
        for (int i = 0; i < array.length ; i++) {
            array[i] = i+1; //i = 0 --> a[0] = i+1/0+1/1 a[1] = i+1 = 1+1 = 2
        }
        int sum = 0;
        for (int i = 0; i < array.length ; i++) {
            System.out.println("Value of sum initially: " + sum);
            sum = sum + array[i];
            System.out.println("Value of sum after adding "+array[i]+" is sum = " +sum );
        }
        System.out.println("Total sum = "+ sum);

        /*int i = 0;
        while (i<b.length){
            System.out.println(b[i]);
            i++;
        }*/



    }
}
