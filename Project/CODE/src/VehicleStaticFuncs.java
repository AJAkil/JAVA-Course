public interface VehicleStaticFuncs {
    default void startVehicle(){
        System.out.println("Starting vehicle in 3...2...1...");
        System.out.println("Vehicle Started");
    }

    default void stopVehicle(){
        System.out.println("Stopping vehicle in 3...2...1...");
        System.out.println("Vehicle Stopped");
    }
}
