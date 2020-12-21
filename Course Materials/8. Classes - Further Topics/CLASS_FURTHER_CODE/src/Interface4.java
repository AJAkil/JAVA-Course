interface IF1{
    default void func(){
        System.out.println("calling function of IF1");
    }
}

interface IF2 extends IF1{
    default void func(){
        IF1.super.func();
        System.out.println("calling function of IF2");
    }
}

class T implements IF2{
    public void func(){
        IF2.super.func();
        System.out.println("calling function of T");
    }
}


public class Interface4 {
    public static void main(String[] args) {
        T tobj = new T();
        tobj.func();
    }
}
