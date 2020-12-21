public class Pickup extends Vehicle {

    private String pickupType;
    private double innerSpace;

    public Pickup(double speed, double acceleration, String color, String company, String model, int yearOfMaking, int registrationID, String pickupType, double innerSpace) {
        super(speed, acceleration, color, company, model, yearOfMaking, registrationID);
        this.pickupType = pickupType;
        this.innerSpace = innerSpace;
    }


    @Override
    public void run(double speed) {
        System.out.println("Running at "+(speed/3));
    }

    @Override
    public void accelerate(double acceleration) {
        System.out.println("Accelerating at "+(acceleration/3));
    }

    public void loadPickup(){
        System.out.println("Loading pickup"+"Filling space "+this.getInnerSpace());
    }

    public void unloadingPickup(){
        System.out.println("Unloading pickup" + "Emptying space " + this.getInnerSpace());
    }

    public String getPickupType() {
        return pickupType;
    }

    public void setPickupType(String pickupType) {
        this.pickupType = pickupType;
    }

    public double getInnerSpace() {
        return innerSpace;
    }

    public void setInnerSpace(double innerSpace) {
        this.innerSpace = innerSpace;
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
                "\nType of Pickup: " + this.getPickupType() +
                "\nInnerSpace: " + this.getInnerSpace();
    }
}
