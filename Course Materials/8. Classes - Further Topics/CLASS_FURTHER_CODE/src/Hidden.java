class foo{
    String s;
    String y;
}

class bar extends foo{
    private String s;

    bar(String x, String y){
        this.s = x;
        super.s = y;
    }

    public void showAll(){
        System.out.println(this.s);
        System.out.println(super.s);
    }

}

public class Hidden {
    public static void main(String[] args) {
        bar b = new bar("sub class", "super class");
        b.showAll();
    }
}
