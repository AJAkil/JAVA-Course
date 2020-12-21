class X{
     int a = 10, b= 20, c =30;
     private int secretVar = 45;

     public void showData(){
        System.out.println(a + " " + b + " " + c);
    }
}

class Child1 extends X{
    int myOwn = 100;

    public void showMyOwn(){
        System.out.println(myOwn);
    }

    public void calculation(){
        System.out.println(c+b-a);
    }

    public void showABC(){
        showData();
    }

}

public class SingleInheritance {
    public static void main(String[] args) {
        X superObject = new X();
        Child1 subObject = new Child1();
        superObject.showData();
        subObject.showData();
        subObject.showABC();
        subObject.showMyOwn();

        System.out.println(subObject.b);

        subObject.calculation();


    }
}
