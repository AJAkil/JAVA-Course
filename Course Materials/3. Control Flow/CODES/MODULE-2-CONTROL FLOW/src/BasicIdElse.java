public class BasicIdElse {
    public static void main(String[] args) {

        /*
        if(conditions){
        actions to be performed
        }
         */

        //"if"
        int myAge = 9;
        if(myAge > 10){
            //System.out.println("My age is greater than 10");
        }else if(myAge < 10 && myAge>5){

            //System.out.println("My age is in between 5 and 10");

        } else{
            //System.out.println("My age is less than 10");
        }

        //||

        int num = -45;

        if( num>=0 || num<0){
           // System.out.println("It is real");
        }

       int x = 10;
        int y = 20;

        //x = 10, y= 20    x = 20, y = 10
        if( (( x == 10) && ( y == 20) ) || ((x == 20 ) && ( y == 10))){
            //System.out.println( "Password is matched!");
        }else{
            //System.out.println("The passwords did not match the real password");
        }

        boolean isFoodtasty = false;

        if( isFoodtasty){
            //System.out.println("Good food");
        }else {
            //System.out.println("Not Good Food :( ");
        }

        char c = 'a';

        if( c == 'a'){
            System.out.println("My ASCII is "+(int)c);
        }else{
            System.out.println("Sorry nothing to see here");
        }




    }

}
