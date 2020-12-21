public class ForLoops {
    public static void main(String[] args) {
        //the things about loops
        /*
        1. the loop counter
        2. The loop stopping condition / continue condition
        3. The loop body

        for(variable initialization ; checking/ stopping condition ; increment/ decrement){

        actions to be executed

        }

         */

        int sum = 0;
        /*for(int i = 1 ; i<= 10 ; i++){
            System.out.println("The loop counter value is "+i);
            sum = sum + i; //0+1+2
            System.out.println("Current sum is "+sum);
        }*/
        // 1 - 20 even 2+4+6+8+10+12
        // 1 + 3 + 5 + ... + 19
        for(int i = 1 ; i <= 19 ; i += 2 ){

            System.out.println("The loop counter value is "+i);
            sum += i;
            System.out.println("Current sum is "+sum);

        }


        System.out.println(sum);

    }

}
