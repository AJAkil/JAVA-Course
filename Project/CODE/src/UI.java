import java.util.ArrayList;
import java.util.Scanner;

public class UI {

    public void searchComponent(ArrayList<Vehicle>vehicles){
        while (true){
            System.out.println("(1)By Registration ID");
            System.out.println("(2)By Company");
            System.out.println("(3)Back to main Menu");
            Scanner scan = new Scanner(System.in);
            String choice = scan.nextLine();

            if (choice.equals("3"))break;

            switch (choice){
                case "1": {
                    searchByRegistration(vehicles);
                    System.out.println();
                    break;
                }

                case "2": {
                    searchByCompany(vehicles);
                    System.out.println();
                }
            }


        }
    }

    public void showAll(ArrayList<Vehicle>vehicles){

        for (int i = 0; i < vehicles.size(); i++) {
            

                if (vehicles.get(i) instanceof Car){

                    Car c = (Car) vehicles.get(i);
                    System.out.println(c);
                    System.out.println();

                }else if (vehicles.get(i) instanceof Pickup){

                    Pickup p = (Pickup) vehicles.get(i);
                    System.out.println(p);
                    System.out.println();
                }

        }

    }

    public void addComponent(ArrayList<Vehicle>vehicles){

        String type = modifyChoice();

        if(type.equalsIgnoreCase("car")){

            System.out.println("Enter Registration ID please:");
            Scanner scan = new Scanner(System.in);
            String regID = scan.nextLine();

            if(!checkExistence(vehicles, regID)){

                System.out.println("Enter Year of making Please:");
                String year = scan.nextLine();
                System.out.println("Enter Model Please:");
                String model = scan.nextLine();
                System.out.println("Enter Company please:");
                String company = scan.nextLine();
                System.out.println("Enter Color Please:");
                String color = scan.nextLine();
                System.out.println("Enter Speed Please:");
                String speed = scan.nextLine();
                System.out.println("Enter Acceleration Please:");
                String acceleration = scan.nextLine();
                System.out.println("Enter Number Of Seats Please:");
                String seats = scan.nextLine();
                System.out.println("Does It Have Nitro? (answer in yes/no)");
                String nitro = scan.nextLine();

                boolean hasNitro = false;

                if (nitro.equalsIgnoreCase("yes")) hasNitro = true;

                vehicles.add( new Car(
                        Double.parseDouble(speed),
                        Double.parseDouble(acceleration),
                        color,
                        company,
                        model,
                        Integer.parseInt(year),
                        Integer.parseInt(regID),
                        Integer.parseInt(seats),
                        hasNitro
                ));

            }else{
                System.out.println("ERROR! VEHICLE WITH SUCH REGISTRATION ID ALREADY EXISTS");
            }


        }else if (type.equalsIgnoreCase("pickup")){

            System.out.println("Enter Registration ID please:");
            Scanner scan = new Scanner(System.in);
            String regID = scan.nextLine();

            if(!checkExistence(vehicles, regID)){

                System.out.println("Enter Year of making Please:");
                String year = scan.nextLine();
                System.out.println("Enter Model Please:");
                String model = scan.nextLine();
                System.out.println("Enter Company please:");
                String company = scan.nextLine();
                System.out.println("Enter Color Please:");
                String color = scan.nextLine();
                System.out.println("Enter Speed Please:");
                String speed = scan.nextLine();
                System.out.println("Enter Acceleration Please:");
                String acceleration = scan.nextLine();
                System.out.println("Enter Pickup Type Please:");
                String pickupType = scan.nextLine();
                System.out.println("Enter Inner-space:");
                String innerSpace = scan.nextLine();

                vehicles.add( new Pickup(
                        Double.parseDouble(speed),
                        Double.parseDouble(acceleration),
                        color,
                        company,
                        model,
                        Integer.parseInt(year),
                        Integer.parseInt(regID),
                        pickupType,
                        Double.parseDouble(innerSpace)
                ));

            }else{
                System.out.println("ERROR! VEHICLE WITH SUCH REGISTRATION ID ALREADY EXISTS");
            }

        }else{
            System.out.println("Wrong choice!");
        }

    }

    public void deleteComponent(ArrayList<Vehicle>vehicles){

        System.out.println("Enter Registration ID please:");
        Scanner scan = new Scanner(System.in);
        String regID = scan.nextLine();

        int index = checkExistanceIndex(vehicles, regID);

        if (index != -1) {
            vehicles.remove(index);
            System.out.println("All information regarding vehicle with regID " + regID + " has been deleted!");
        }else{
            System.out.println("ERROR! VEHICLE WITH SUCH REGISTRATION ID ALREADY EXISTS");
        }
    }

    public String modifyChoice() {
        System.out.println("What kind of vehicle you want to add to the database?");
        System.out.println("(1)Car");
        System.out.println("(2)Pickup");
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        if (choice.equalsIgnoreCase("1")) return "car";
        else if (choice.equalsIgnoreCase("2")) return "pickup";
        return null;
    }

    public boolean checkExistence(ArrayList<Vehicle>vehicles, String regID){


        for (int i = 0; i < vehicles.size() ; i++) {
            if (vehicles.get(i).getRegistrationID() == Integer.parseInt(regID)){
                return true;
            }
        }

        return false;

    }

    public int checkExistanceIndex(ArrayList<Vehicle>vehicles, String regID){

        int index = -1;

        for (int i = 0; i < vehicles.size() ; i++) {
            if (vehicles.get(i).getRegistrationID() == Integer.parseInt(regID)){
                index = i;
                break;
            }
        }

        return index;

    }

    public void searchByRegistration(ArrayList<Vehicle>vehicles){
        System.out.println("Enter Registration ID please:");
        Scanner scan2 = new Scanner(System.in);
        String regID = scan2.nextLine();

        int index = checkExistanceIndex(vehicles, regID);

        if (index != -1){

            if (vehicles.get(index) instanceof Car){

                Car c = (Car) vehicles.get(index);
                System.out.println(c);
                System.out.println();

            }else if (vehicles.get(index) instanceof Pickup){

                Pickup p = (Pickup) vehicles.get(index);
                System.out.println(p);
                System.out.println();
            }

        }else{
            System.out.println("ERROR! VEHICLE WITH SUCH REGISTRATION ID DOES NOT EXISTS");
        }
    }

    public void searchAndSimulate(ArrayList<Vehicle>vehicles){
        System.out.println("Enter Registration ID please:");
        Scanner scan2 = new Scanner(System.in);
        String regID = scan2.nextLine();

        int index = checkExistanceIndex(vehicles, regID);

        if (index != -1){

            if (vehicles.get(index) instanceof Car){

                Car c = (Car) vehicles.get(index);

                while (true){
                    System.out.println("What do you want to simulate for the car?");
                    System.out.println("(1)Run");
                    System.out.println("(2)Accelerate");
                    System.out.println("(3)Use Nitro-booster");
                    System.out.println("(4)Quit");
                    Scanner scan = new Scanner(System.in);
                    String choice = scan.nextLine();

                    if (choice.equals("4"))break;

                    switch (choice){
                        case "1": {
                            c.run(c.getSpeed());
                            System.out.println();
                            break;
                        }

                        case "2": {
                            c.accelerate(c.getAcceleration());
                            System.out.println();
                            break;
                        }

                        case "3": {
                            c.useNitro();
                            System.out.println();
                            break;
                        }


                    }


                }


            }else if (vehicles.get(index) instanceof Pickup){

                Pickup p = (Pickup) vehicles.get(index);

                while (true){
                    System.out.println("What do you want to simulate for the pickup?");
                    System.out.println("(1)Run");
                    System.out.println("(2)Accelerate");
                    System.out.println("(3)Load");
                    System.out.println("(4)Unload");
                    System.out.println("(5)Quit");
                    Scanner scan = new Scanner(System.in);
                    String choice = scan.nextLine();

                    if (choice.equals("5"))break;

                    switch (choice){
                        case "1": {
                            p.run(p.getSpeed());
                            System.out.println();
                            break;
                        }

                        case "2": {
                            p.accelerate(p.getAcceleration());
                            System.out.println();
                            break;
                        }

                        case "3": {
                            p.loadPickup();
                            System.out.println();
                            break;
                        }

                        case "4": {
                            p.unloadingPickup();
                            System.out.println();
                            break;
                        }


                    }


                }


            }

        }else{
            System.out.println("ERROR! VEHICLE WITH SUCH REGISTRATION ID DOES NOT EXISTS");
        }
    }

    private void searchByCompany(ArrayList<Vehicle> vehicles) {
        System.out.println("Enter Company please:");
        Scanner scan2 = new Scanner(System.in);
        String company = scan2.nextLine();

        boolean flag = false;

        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getCompany().equalsIgnoreCase(company)){

                flag =true;

                if (vehicles.get(i) instanceof Car){

                    Car c = (Car) vehicles.get(i);
                    System.out.println(c);
                    System.out.println();

                }else if (vehicles.get(i) instanceof Pickup){

                    Pickup p = (Pickup) vehicles.get(i);
                    System.out.println(p);
                    System.out.println();
                }
            }
        }

        if (!flag){
            System.out.println("ERROR! NO VEHICLE WITH SUCH COMPANY NAME EXISTS IN THE DATABASE");
        }
    }

    public void simulate(ArrayList<Vehicle> vehicles) {
        while (true){
            System.out.println("(1)By Registration ID");
            System.out.println("(2)Back to main Menu");
            Scanner scan = new Scanner(System.in);
            String choice = scan.nextLine();

            if (choice.equals("2"))break;

            if (choice.equals("1")) {
                searchAndSimulate(vehicles);
            }


        }
    }

    public void mainUI(ArrayList<Vehicle>vehicles){

        while (true){
            System.out.println("OPTIONS");
            System.out.println("(1) Search Vehicle");
            System.out.println("(2) Add Vehicle");
            System.out.println("(3) Delete Vehicle");
            System.out.println("(4) Show All Vehicle");
            System.out.println("(5) Simulate");
            System.out.println("(6) Exit");
            Scanner scan = new Scanner(System.in);
            String choice = scan.nextLine();

            if (choice.equalsIgnoreCase("6")) {

                FileHandler handler = new FileHandler();
                handler.writeFile(vehicles);
                break;
            }

            switch (choice){

                case "1": {
                    searchComponent(vehicles); break;
                }

                case "2": {
                    addComponent(vehicles); break;
                }

                case "3": {
                    deleteComponent(vehicles); break;
                }

                case "4": {
                    showAll(vehicles); break;
                }
                
                case "5":{
                    simulate(vehicles); break;
                }

            }
        }

    }



}
