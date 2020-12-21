public class StaticFinal {
    static int a = 10, b = 200;
    int x;
    final String fileName = "log.txt";


    //Using static variables in non static method;
    public int func(){
        return a*100+b;
    }

    //using static variables and non-static variables in a static method
    static void staticf(int arg){
        System.out.println(arg);
        System.out.println("Static a = "+a);
        System.out.println("Static b = "+b);
        System.out.println("Static a modified to = "+(arg+a));
        //System.out.println("Non static variable x = "+x);
    }

    static void f2(){
        System.out.println("I am a static function!!");
    }

    //Static block
    static {
        int y = 100;
        System.out.println(y);
        a = b+90;
        //System.out.println(x);
    }

    public void testf(){
        //System.out.println(y);
    }

    public static void main(String[] args) {
        StaticFinal obj = new StaticFinal();
       // System.out.println(StaticFinal.a);
        //int result = obj.func();
        //System.out.println(result);
        StaticFinal.staticf(50);
        staticf(10);
    }

    //Static variables are more powerful,


}
