package ProblemSet;

import java.util.Scanner;

public class Client {

    public static void showMenu(App appObject){
        Scanner scan = new Scanner(System.in);
        String choice = "";
        int id;
        String taskName;

        while (true){
            System.out.println("1. Add Task");
            System.out.println("2. Show All Task");
            System.out.println("3. Press Q to quit");
            System.out.println("[ PRESSING ANY OTHER KEY WOULD REPEAT THE MENU ]");
            choice = scan.nextLine();
            if(choice.equals("1")){
                System.out.print("Enter the ID and NAME of task separated by a space: ");
                id = scan.nextInt();
                taskName = scan.nextLine();
                appObject.addTask(id, taskName);
            }else if(choice.equals("2")){
                appObject.showTodoList();
            }else if(choice.equals("Q")){
                break;
            }
        }
    }

    public static void main(String[] args) {
        App appObject = new App();
        showMenu(appObject);
    }
}
