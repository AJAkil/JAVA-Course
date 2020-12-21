class Animal{
    String color;
    String weight;
    String sound;

    public Animal(String color, String weight, String sound) {
        this.color = color;
        this.weight = weight;
        this.sound = sound;
    }

    public Animal(Animal animal) {
        this.color = animal.color;
        this.weight = animal.weight;
        this.sound = animal.sound;
    }

    public Animal() {
        this.color = "red";
        this.weight = "200kg";
        this.sound = "making sound";
    }
    public void makeSound(){
        System.out.println(this.sound);
    }
}

class Horse extends Animal{
    private String topSpeed;

    public Horse(String color, String weight, String sound, String topSpeed) {
        this.color = color;
        this.weight = weight;
        this.sound = sound;
        this.topSpeed = topSpeed;
    }

    public void showTopSpeed(){
        System.out.println(topSpeed);
    }
}

class Bird extends Animal{
    private String wingSpan;

    public Bird(String color, String weight, String sound, String wingSpan) {
        super(color, weight, sound);
        this.wingSpan = wingSpan;
    }

    public void showWIngSpan(){
        System.out.println(wingSpan);
    }
}


public class Example {
    public static void main(String[] args) {
      Horse horse = new Horse("Brown","300kg","horse sound","100km");
        //System.out.println(horse.sound);
        Animal animal = horse;
        //System.out.println(animal.color);
        Animal sampleAnimal = new Animal("Blue","300kg","weird sound");
        //Horse bojack = sampleAnimal;
        horse.showTopSpeed();

        //-------------------- hierarchical inheritance part-----------------------------
        Bird blueBird = new Bird("Blue","20gm","kichir michir","10cm");
        blueBird.makeSound();
        System.out.println(blueBird.color);

    }
}
