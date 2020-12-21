public class WritingMethods {

    public void printSum(){
        int a = 0, b = 9;
        int result = a + b;
        System.out.println(result);
    }

    //formula = 0.5 * base * height
    public double calculateArea(double base, double height){
        double result;
        result = 0.5 * base * height;
        return result;
    }

    //Converting an integer to binary
    public int[] convertToBinary(int num){

        int[] result = new int[1000];
        for (int i = 0; i < 1000 ; i++) {
            result[i] = -1;
        }

        int i = 0;
        while (num != 0){
            result[i] = num % 2;   // num % 2 => 6 %2 = 0--> result[i] = 0
            num = num / 2; // num = 6/2 = 3
            i++;
        }

        return result;
    }

    public static void main(String[] args) {

        WritingMethods obj = new WritingMethods();
        //obj.printSum();

        //double area = obj.calculateArea(10,20);
        //System.out.println(area);

        //int[] convertedValue = obj.convertToBinary(6); // 110

        //int numberSize = 0;

        //This loop is used for calculating the size of the binary number + 1
        //while (convertedValue[numberSize]!= -1){
            //numberSize++;
        //}
        //numberSize--;  //calculating the exact size of the number

        //printing the array backwards from the exact index
        //while (numberSize>=0){
            //System.out.print(convertedValue[numberSize]);
            //numberSize--;
        //}


    }
}
