public class Operators {
    public static void main(String[] args) {

        //Arithmetic Operators

       // int a = 1, b = 2, c = 3, d = 4;

        //System.out.println(a+b);
        //System.out.println(2+b);

       // System.out.println(c-b);
        //System.out.println(3*7*a);

        //System.out.println(d/b);

        //int y = d/b;

        //System.out.println(y);

        //System.out.println(4%2); //4 mod 2
       // int remainder = c % b;  // remainder = 1
        //System.out.println(remainder);

        //Unary Operators
        int  x = 100, y = 200, z = 0, p = 200, q = 400, r = 300;
        boolean state = true;

        //Increment operator
        // ++
        //pre increment ++a a++ --> post increment
        //x = x+1 then z = x
        // post -- > z = 100/x --> x = x+1
        z = x++;
        //System.out.println(x);

        //Decrement operator
        // pre decrement q = q-1 --> z = q
        //post decrement z = q --> q = q-1
        z = q--;
        //System.out.println(q);

        //logical not operator
        //System.out.println(!state);

        //logical operators
        boolean a = false, b = true;
        //System.out.println(true && true);
        //System.out.println(true && false);
        //System.out.println(false && false);
        //System.out.println(a && b);

        //System.out.println(true || true);
        //System.out.println(true || false);
        //System.out.println(false || false);
        //System.out.println(a || b);

        //Relational Operators
        int a1 = 1000, b1 = 2000;
        boolean state1 = false;

        //System.out.println("a1 == b1"+(a1 == b1));
        //System.out.println("a1 != b1"+(a1 != b1));
        //System.out.println("a1 < b1"+(a1 < b1));
        //System.out.println("a1 <= b1"+(a1 <= b1));
        //System.out.println("a1 > b1"+(a1 > b1));
        //System.out.println("a1 >= b1"+(a1 >= b1));
        //System.out.println(state1 !=  true);
        //System.out.println(1 != 2);
        //Assignment operator
        int a2 = 230, y2 = 110, z2 = 9, w2 = 8, p2 = 99;

        //simple assignment
        int zero = z2;
        //System.out.println(zero);
        //previously learned system of assignment
        a2 = a2 + 1;
        y2 = y2 - 1;
        z2 = z2 * 2;
        w2 = w2 / 2;
        p2 = p2 % 3;

        System.out.println(" a2 = "+a2+" y2 = "+y2+" z2 = "+z2+" w2 = "+w2 + " p2 = "+p2);

        a2 = 230;
        y2 = 110;
        z2 = 9;
        w2 = 8;
        p2 = 99;

        a2 += 1;
        y2 -= 1;
        z2 *= 2;
        w2 /= 2;
        p2 %= 3;

        System.out.println(" a2 = "+a2+" y2 = "+y2+" z2 = "+z2+" w2 = "+w2 + " p2 = "+p2);



    }
}
