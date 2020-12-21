public class Car extends Vehicle {

    private int numberOfSeats;
    private boolean hasNitroBooster;

    public Car(double speed, double acceleration, String color, String company, String model, int yearOfMaking, int registrationID, int numberOfSeats,boolean hasNitroBooster) {
        super(speed, acceleration, color, company, model, yearOfMaking, registrationID);
        this.numberOfSeats = numberOfSeats;
        this.hasNitroBooster = hasNitroBooster;
    }


    @Override
    public void run(double speed) {
        System.out.println("Running at "+speed);
    }

    @Override
    public void accelerate(double acceleration) {
        System.out.println("Accelarating at "+acceleration);
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public boolean isHasNitroBooster() {
        return hasNitroBooster;
    }

    public void setHasNitroBooster(boolean hasNitroBooster) {
        this.hasNitroBooster = hasNitroBooster;
    }

    public void useNitro(){
        if(hasNitroBooster){
            System.out.println("Using nitro!");
            System.out.println("Speed increased by 2 folds!");
            System.out.println("Speed is now: "+(this.speed*2));
        }else{
            System.out.println("Add some nitro first!");
        }

    }

    @Override
    public String toString() {

        return "Registration ID: " + this.getRegistrationID() +
                "\nYear of making : " + this.getYearOfMaking() +
        "\nModel: " + this.getModel() +
        "\nCompany: " + this.getCompany() +
        "\nColor: " + this.getColor() +
        "\nSpeed: " + this.getSpeed() +
        "\nAcceleration: " + this.getAcceleration() +
        "\nNumber Of Seats: " + this.getNumberOfSeats() +
        "\nNitro?: " + this.isHasNitroBooster();

    }
}
