import java.util.Random;

interface Test1{
    void foo();

    //default methods in interface
    default int showNumber() {
        Random rand = new Random();
        return rand.nextInt(100);
    }
}

interface Test2 extends Test1{
    void boo();

    //static methods in interface
    static double getRandomDouble(){
        Random rand = new Random();
        return rand.nextDouble();
    }
}

class TestClass implements Test2{

    @Override
    public void foo() {
        System.out.println("foo foo");
    }

    @Override
    public void boo() {
        System.out.println("boo boo");
    }
}


public class Interface2 {
    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.boo();
        t.foo();
        System.out.println(t.showNumber());
        System.out.println(Test2.getRandomDouble());
    }
}
