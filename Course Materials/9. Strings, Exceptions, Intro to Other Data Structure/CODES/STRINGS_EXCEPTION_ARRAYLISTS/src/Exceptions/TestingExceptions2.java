package Exceptions;

//Writing our own exception
class MyCustomException extends Exception{
    private String input;

    public MyCustomException(String input){
        System.out.println("In the MyCustomException Constructor");
        this.input = input;
    }

    @Override
    public String toString() {
        return "MyCustomException{" +
                "input='" + input + '\'' +
                '}';
    }
}


public class TestingExceptions2 {

    static void f() throws Exception {
        System.out.println(10/0);
    }

    static void printAString(String input) throws MyCustomException{
        if( input == null ){
            System.out.println("In the null check");
            throw new MyCustomException(input);
        }else System.out.println("The string is = "+input);
    }



    public static void main(String[] args) {

        //-----------------------THROWING EXCEPTIONS------------------------
        /*try {
            f();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        //-------------------------CUSTOM EXCEPTIONS-------------------------
        try {
            printAString(null);
        } catch (MyCustomException e) {
            e.printStackTrace();
        }


    }
}
