import java.util.Random;

interface A{
    default void showA(){
        System.out.println("Showing A");
    }

    int getInt();
}

interface B{
    default void showB(){
        System.out.println("Showing B");
    }

    double getDouble();
}

class MultiInheritance implements A, B{

    @Override
    public int getInt() {
        return new Random().nextInt();
    }

    @Override
    public double getDouble() {
        return new Random().nextDouble();
    }
}


public class Interface3 {
    public static void main(String[] args) {
        MultiInheritance m = new MultiInheritance();
        System.out.println(m.getDouble());
        m.showB();
    }
}
