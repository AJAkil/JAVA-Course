import java.io.*;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) {

        File f = new File("D:\\JAVA_FILES\\new_file.txt");

        //reading file with the FileReader class
        try{
            FileReader reader = new FileReader(f);
            char[] charArray = new char[(int)f.length()];

            // reading the contents of the file as character and putting them on the array
            reader.read(charArray);

            System.out.println(charArray);

            reader.close();


        }catch (IOException e){
            e.printStackTrace();
        }



        //reading file with the scanner class
        try {

            Scanner scan = new Scanner(f);

            while (scan.hasNextLine()){
                String data = scan.nextLine();
                System.out.println(data);
            }

            scan.close();

        }catch (IOException e){
            e.printStackTrace();
        }



        //reading file with the buffered reader class
        FileReader fr = null;

        try{
            fr = new FileReader("D:\\JAVA_FILES\\new_file.txt");
            BufferedReader br = new BufferedReader(fr);

            // Reading file using the while loop
            while (true){
                String data = br.readLine();
                if ( data == null ) break;
                System.out.println(data);
            }

        }catch (IOException e){
            e.printStackTrace();
        }



    }
}
