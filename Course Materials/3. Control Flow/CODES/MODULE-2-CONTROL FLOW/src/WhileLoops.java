public class WhileLoops {

    public static void main(String[] args) {
        //General syntax structure of while loops
    /*
    while ( some condition ){
     actions and statements to be executed
    }
     */

        int loopCounter = 1; //Loop counter variable

        /*while( loopCounter <= 5){
            System.out.println(loopCounter);  // 1 2 3 4 5
            loopCounter = loopCounter + 1;  // 2 3 4  5 6

        }*/

        //System.out.println("Loop has ended");

        //program to find the sum of 1 ... 100
        int i = 0;  //i, j , k
        int sum = 0;

        while ( i < 10){
            i = i+1;
            System.out.println(i);
            sum = sum + i;
        }

        System.out.println(sum);

    }



}
