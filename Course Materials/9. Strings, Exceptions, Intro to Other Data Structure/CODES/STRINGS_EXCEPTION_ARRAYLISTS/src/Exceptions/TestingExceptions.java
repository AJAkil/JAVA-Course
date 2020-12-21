package Exceptions;

public class TestingExceptions {
    public static void main(String[] args) {

        //Uncaught exception
        String a = null;
        int x = 10;
        int y = 100;
        int z = 0;

        //Null pointer exception
        //System.out.println(a.length());

        //Arithmetic Exception
        //int res = x/z;

        //Array Index Out Of Bound Exception
        //int[] array = {1,2,3};
        //System.out.println(array[3]);

        //Catching Exceptions Using Try Catch Block
        /*try{
            int res = x/10;
        }catch (Exception e){
            System.out.println("The exception is: "+ e );
        }finally {
            System.out.println("Finally will always be executed");
        }*/


        //Catching Exceptions Using Try Catch Block
        try{
            //int res = x/z;
            System.out.println(a.length());
        }catch (ArithmeticException | NullPointerException e){
            e.printStackTrace();
            System.out.println("The exception is: "+ e );
        }



    }
}
