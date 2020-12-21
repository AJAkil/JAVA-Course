import java.util.Scanner;

public class PROBLEM_1B {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char c = scan.next().charAt(0);

        //'A' = 65 , 'a' = 97  'a' - 'A' = 97 - 65 = 32
        char out = (char)(c + ('a'- 'A'));  //c+32 --> c = 'A'--> c = 65+32 = 97
        System.out.println(out);

        char d = scan.next().charAt(0);
        out =(char) (d - ('a' - 'A'));
        System.out.println(out);

    }

}
