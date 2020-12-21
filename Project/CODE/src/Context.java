import java.util.ArrayList;

public class Context {

    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    public void LoadDatabase(){
        FileHandler handler = new FileHandler();

        ArrayList<String[]> vehicleData = handler.readFile();

        for (int i = 0; i < vehicleData.size(); i++) {

            String type = vehicleData.get(i)[0];

            if(type.equalsIgnoreCase("car")){

                vehicles.add(new Car(
                      Double.parseDouble(vehicleData.get(i)[1]),
                      Double.parseDouble(vehicleData.get(i)[2]),
                      vehicleData.get(i)[3],
                      vehicleData.get(i)[4],
                        vehicleData.get(i)[5],
                        Integer.parseInt(vehicleData.get(i)[6]),
                        Integer.parseInt(vehicleData.get(i)[7]),
                        Integer.parseInt(vehicleData.get(i)[8]),
                        Boolean.parseBoolean(vehicleData.get(i)[9])

                ));

            } else if (type.equalsIgnoreCase("pickup")) {
                vehicles.add(new Pickup(
                        Double.parseDouble(vehicleData.get(i)[1]),
                        Double.parseDouble(vehicleData.get(i)[2]),
                        vehicleData.get(i)[3],
                        vehicleData.get(i)[4],
                        vehicleData.get(i)[5],
                        Integer.parseInt(vehicleData.get(i)[6]),
                        Integer.parseInt(vehicleData.get(i)[7]),
                        vehicleData.get(i)[8],
                        Double.parseDouble(vehicleData.get(i)[9])

                ));
            }

        }

    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void showDbData(){
        System.out.println("*****************************************************************");
        System.out.println("*****************************************************************");
        System.out.println();
        for (Vehicle v: vehicles) {
            System.out.print("REGID = " + v.getRegistrationID()+" ");
            System.out.print("COMPANY = " + v.getCompany()+" ");
            System.out.print("MODEL = " + v.getModel()+" ");
            System.out.print("COLOR = " + v.getColor()+" ");
            System.out.print("YEAR = "  + v.getYearOfMaking()+" ");
            System.out.print("SPEED = " + v.getSpeed()+" ");
            System.out.print("ACCELERATION = " + v.getAcceleration()+" ");

            if (v instanceof Car){

                System.out.print( "Seats = " + ((Car) v).getNumberOfSeats() + " ");
                System.out.println( "Nitro? = " + ((Car) v).isHasNitroBooster());

            }else if ( v instanceof Pickup){

                System.out.print("PickupType = " + ((Pickup) v).getPickupType() + " ");
                System.out.println("InnerSpace = " + ((Pickup) v).getInnerSpace());

            }
        }

        System.out.println();
        System.out.println("*****************************************************************");
        System.out.println("*****************************************************************");
    }

    public void writeToDB(){

    }
}
