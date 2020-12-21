public class OutputFormatting {
    public static void main(String[] args) {
        int x = 1000;
        double a = 4.566667;
        float f = 5.6774566f;
        String s = "Hello There!";
        char c = 'a';

        //integer outputting
        //System.out.printf("A single integer = %d and another integer = %d",x,56);

        //double and float formatted output
        //System.out.printf("with precision = %.3f and float = %.4f",a,f);
        //System.out.printf(" %5.2f",a);

        //Strings and characters
        System.out.printf("The string is = %s and the character is = %c",s,c);


    }
}
