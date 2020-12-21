public class MultiMethods {

    //check for negative index of the array
    public boolean checkIndex(int[] index){

        System.out.println("checkIndex Method is called");
        boolean flag = false;
        for (int i = 0; i < index.length ; i++) {
            if(index[i] < 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    //checking the consistency between two array
    public boolean checkArrayConsistency(int[] index, int[] array){
        System.out.println("checkArrayConsistency Method is called");
        boolean flag = true;

        //checking the length among the array
        if(index.length > array.length){
            flag = false;
        }
        //check for invalid entry in the index array
        for (int i = 0; i < index.length ; i++) {
            if(index[i] > array.length-1){
                flag = false;
                break;
            }
        }
        return flag;
    }

    //calculating the even sum of the array
    public int evenSum(int[] array){
        System.out.println("evenSum Method is called");
        int sum = 0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i] % 2 == 0){
                sum = sum + array[i];
            }
        }
        return sum;
    }

    //Working method
    public int indexSum(int[] index, int[] array){
        System.out.println("indexSum Method is called");
        boolean checker = false;
        int sum = 0;
        //checking the index
        checker = checkIndex(index);    // method called

        if(checker){
            System.out.println("The index array has negative index");
        }else{
            //proceed
            boolean checker2  = false;
            checker2 = checkArrayConsistency(index, array);  //method called
            if(checker2){
                //everything is okay
                int[] temp = new int[index.length];

                for (int i = 0; i < temp.length ; i++) {
                    temp[i] = array[index[i]];
                }

                //calculate the sum
                sum = evenSum(temp); //method called here
            }else{
                //inconsistency
                System.out.println("The arrays are inconsistent");
            }
        }
        return sum;
    }


    public static void main(String[] args) {
            MultiMethods obj = new MultiMethods();
            int[] index = {0,1,2,3,5,6,7};
            int[] array = {2,3,4,6};

            int result = obj.indexSum(index, array);
           System.out.println(result);
    }
}
