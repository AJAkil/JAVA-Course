public class TypeConversion {
    public static void main(String[] args) {

        //auto type conversion demonstration
        //byte - > short - > char - > int -> long -> float -> double
        int iVal = 1000;
        double dVal = iVal;
        //System.out.println(iVal);
        //System.out.println(dVal);

        //Explicit conversion
        double val = 1000.0;
        int intVal = (int) val;
        System.out.println(intVal);

    }
}
