public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        context.LoadDatabase();

        //context.showDbData();

        UI ui = new UI();

        ui.mainUI(context.getVehicles());
    }
}
