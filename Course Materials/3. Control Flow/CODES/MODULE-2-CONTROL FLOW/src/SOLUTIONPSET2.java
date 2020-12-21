import java.util.Scanner;

public class SOLUTIONPSET2 {
    public static void main(String[] args) {
        //---------------------------problem 1 Prime numbers within a range------------------------
        Scanner scan = new Scanner(System.in);
       /* int start = scan.nextInt();
        int end = scan.nextInt();
        boolean flag = false;

        while (start < end){

            for (int i = 2; i < start; i++) {
                if( start % i == 0 ){
                    flag = true;
                    break;
                }
            }

            if( flag == false){
                if( start != 1)
                    System.out.print(start+" ");
            }
            flag = false;
            start++;
        }*/



        //---------------------------problem 2 Palindromic Number------------------------
      /*  System.out.println("Please Enter a number: ");
        int n = scan.nextInt();
        int temp = n;
        int rem, s = 0;*/

        //123 --> 12 --> 1 --> 0
        //123 = 120 + 3 = 12*10 +3 = (1*10 + 2)*10 + 3 =
        /* 123
        s = 0
        rem = 3
        temp = 12
        s = 0 * 10 + 3 = 3
        ----------------------
        rem = 12 % 10 = 2
        temp = 12/10 = 1
        s = 3 * 10 + 2= 30+2 = 32
        -------------------------
        rem = 1 % 10 = 1
        temp = 1 /10 = 0
        s = 32 * 10 + 1 = 320 + 1 = 321
        ------------------------------
         */
       /* while (temp != 0){
            rem = temp % 10;
            temp = temp / 10;
            s = s*10 + rem;
        }

        if( s == n ) System.out.println("Yes, the number "+n+" is palindromic");
        else System.out.println("No, the number "+n+" is not palindromic");*/



        //---------------------------problem 3 Cipher ------------------------
        System.out.print("Please Enter the message: ");
        String message = scan.next();
        String hiddenMsg = "";
        char temp;

        for (int i = 0; i < message.length(); i++) {
            //HELPUZ
            //H --> temp = 'H' --> hiddenMsg += 'H'-->J --> hiddenMsg = J
            //E --> temp = 'e' --> hiddenMsg += 'e' -->'g' --> hiddenMsg = Jg

            if( i % 2 != 0){
                int t = (int)message.charAt(i)+('a'-'A');
                temp = (char)t;
             }else temp = message.charAt(i);

            if( temp == 'Y' ) hiddenMsg += Character.toString('A');
            else if( temp == 'y' ) hiddenMsg += Character.toString('a');
            else if( temp == 'Z' ) hiddenMsg += Character.toString('B');
            else if( temp == 'z' ) hiddenMsg += Character.toString('b');
            else hiddenMsg += Character.toString(temp+(char)2);

        }

        System.out.println(hiddenMsg);


    }
}
