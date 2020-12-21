class Animal2{
    String color;
    String weight;
    String sound;

    public Animal2(String color, String weight, String sound) {
        System.out.println("Calling Animal2 constructor no : 1");
        this.color = color;
        this.weight = weight;
        this.sound = sound;
    }

    public Animal2(Animal2 animal){
        System.out.println("Calling Animal2 constructor no : 2");
        this.color = animal.color;
        this.weight = animal.weight;
        this.sound = animal.sound;
    }

    public Animal2(){
        System.out.println("Calling Animal2 constructor no : 3");
        this.color = "red";
        this.weight = "200kg";
        this.sound = "making sound!";
    }

    public void makeSound(){
        System.out.println(this.sound);
    }
}

class Horse2 extends Animal2{
    private String topSpeed;

    public Horse2(String color, String weight, String sound, String topSpeed) {
        //super --> superclass --> super()
        super(color, weight, sound);
        this.topSpeed = topSpeed;
    }

    public Horse2(Horse2 horsie){
        super(horsie);
        this.topSpeed = horsie.topSpeed;
    }

    public Horse2(){
        super();
        this.topSpeed = "123kmh";
    }

    public void showTopSpeed(){
        System.out.println(topSpeed);
    }

    @Override
    public String toString() {
        return "Horse2{" +
                "color='" + color + '\'' +
                ", weight='" + weight + '\'' +
                ", sound='" + sound + '\'' +
                ", topSpeed='" + topSpeed + '\'' +
                '}';
    }
}

public class ExampleSuper {
    public static void main(String[] args) {
        Horse2 h1 = new Horse2("black","500kg","blo blo","225kmh");
        Horse2 h2 = new Horse2();
        Horse2 h3 = new Horse2(h1);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
    }
}
