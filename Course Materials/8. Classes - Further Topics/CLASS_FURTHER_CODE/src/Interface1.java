//Interfaces are pure abstract class with no concrete methods
interface Robot{
    //BY DEFAULT INTERFACE METHODS ARE IMPLICITLY PUBLIC AND ABSTRACT
    void walk();
    void talk(String keyWord);

    //BY DEFAULT INTERFACE VARIABLES ARE STATIC, PUBLIC, FINAL
    int arms = 2;
    int legs = 2;

}

class BuilderRobot implements Robot{

    @Override
    public void walk() {
        System.out.println("Builder Robot Walking");
    }

    @Override
    public void talk(String keyWord) {
        System.out.println("I am saying "+keyWord);
    }

    public void showArmsAndLegs(){
        System.out.println("Legs = " + legs + " " + "Arms = " + arms);
    }
}

class FightingRobot implements Robot{
    @Override
    public void walk() {
        System.out.println("Fighting Robot Walking");
    }

    @Override
    public void talk(String keyWord) {
        System.out.println("I am saying "+keyWord);
    }
}


public class Interface1 {
    public static void main(String[] args) {
        //can't call like this
        //Robot r  = new Robot();
        BuilderRobot bob = new BuilderRobot();
        bob.showArmsAndLegs();
        //bob.walk();
        //bob.talk("hello");
        //System.out.println(Robot.arms);
        Robot r = new FightingRobot();
        //r.walk();

    }
}
