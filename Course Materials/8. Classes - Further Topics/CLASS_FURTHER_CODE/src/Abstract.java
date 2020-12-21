abstract class Cake{
    String cakeFlavor;
    //abstract method of the class Cake declared here
    abstract void addFlavor(String cakeFlavor);

    //concrete method of abstract class
    void bakeCake(){
        System.out.println("Baking "+this.cakeFlavor+" flavored cake");
    }
}

class ChocolateCake extends Cake{
    @Override
    void addFlavor(String cakeFlavor) {
        System.out.println("Implementing abstract class method as a concrete method");
        this.cakeFlavor = cakeFlavor;
    }
}

class VanillaCake extends Cake{
    @Override
    void addFlavor(String cakeFlavor) {
        System.out.println("Implementing abstract class method as a concrete method");
        this.cakeFlavor = cakeFlavor;
    }
}

public class Abstract {
    public static void main(String[] args) {
        /*ChocolateCake chocoPie = new ChocolateCake();
        chocoPie.addFlavor("chocolate caramel");
        chocoPie.bakeCake();

        VanillaCake vanillaIceCreamCake = new VanillaCake();
        vanillaIceCreamCake.addFlavor("vanilla with nuts");
        vanillaIceCreamCake.bakeCake();

        Cake cake = new Cake() {
            @Override
            void addFlavor(String cakeFlavor) {
                System.out.println("Overriden abstract method");
                this.cakeFlavor = cakeFlavor;
            }
        };

        cake.addFlavor("Hazelnut");
        cake.bakeCake();*/
        double a = 1234.0;
        byte b = (byte)a;
        System.out.println(b);



    }
}
