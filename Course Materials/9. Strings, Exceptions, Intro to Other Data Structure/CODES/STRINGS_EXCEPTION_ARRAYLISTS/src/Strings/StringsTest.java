package Strings;

public class StringsTest {
    public static void main(String[] args) {

        //--------------------------------------------------
        //--------------STRING CONSTRUCTORS-----------------
        //--------------------------------------------------
        String s = "Hello world.";
        String sobj = new String("kello");
        String holder = "";

        char cArray[] = {'h','a','a','t','t','e','r'};
        String fromCArray = new String(cArray);
        String fromCArray2 = new String(cArray,2,2);

        //System.out.println(fromCArray);
        //System.out.println(fromCArray2);


        //--------------------------------------------------
        //--------------STRING METHODS----------------------
        //--------------------------------------------------

        //length of a string
        //System.out.println(s.length());

        //getting the character at a certain position
        //System.out.println(s.charAt(11));


        //substrings
        //Hello World.
        //System.out.println(s.substring(2));
        //System.out.println(s.substring(2,7));


        //String comparisons
        String a = "boot";
        String b = "foot";
        String c = "boot";


        //Always use .equals() and .equalsIgnoreCase() for comparing strings
        //System.out.println(a.equals("oot"));
        //System.out.println(a.equalsIgnoreCase("BooT"));

        //System.out.println(a.compareTo(b));
        //System.out.println(b.compareTo(a));
        //System.out.println(a.compareTo(c));



        //Checking the start and end of a string
        //System.out.println(s.startsWith("Hello"));
        //System.out.println(s.endsWith("world"));


        //concatenation
        //System.out.println("a"+"b");
        //String newString = a.concat(b);
        //System.out.println(newString);


        //finding the position of characters in the string
        //System.out.println(s.indexOf('H'));
        //System.out.println(s.lastIndexOf('l'));



        //String split
//        String data = "1,2,3,4,a,b,c,d,e";
//        String[] splitted = data.split(",");
//
//        for (String x : splitted ) {
//            System.out.print(x + " ");
//        }


        //uppercase, lowercase, replace
        //System.out.println("JAVA".toLowerCase());
        //System.out.println("aaabbbccc".replace('b','#'));



        //--------------------------------------------------------------------
        //--------------STRING TO OTHER TYPE CONVERSIONS----------------------
        //--------------------------------------------------------------------
        int x = 10;
        double y = 10.59;
        long z = 1121313;
        byte t = 2;
        String numTest = "123";
        String doubleTest = "123.55";
        String byteTest = "12";

        //String to other type conversion
        int temp = Integer.parseInt(numTest);
        double temp2 = Double.parseDouble(doubleTest);
        byte temp3 = Byte.parseByte(byteTest);

        //System.out.print(temp + " " + temp2 + " " + temp3);

        //Other types to string conversions
        String fromInt = String.valueOf(x);
        String fromDouble = String.valueOf(y);
        String fromLong = String.valueOf(z);
        String fromByte = String.valueOf(t);


    }
}
