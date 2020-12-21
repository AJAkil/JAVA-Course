import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {

        File fileObj = new File("D:\\JAVA_FILES\\new_file_1.txt");

        //creating a file
        try {
            if(fileObj.createNewFile()){
                System.out.println("File created!");
            }else{
                System.out.println("File cannot be created!");
            }

            //General File Information
            if(fileObj.exists()){

                System.out.println("Name: "+fileObj.getName());
                System.out.println("Absolute Path: "+fileObj.getAbsolutePath());
                System.out.println("Path: "+fileObj.getPath());
                System.out.println("Readable? : "+fileObj.canRead());
                System.out.println("Writable?: "+fileObj.canWrite());
                System.out.println("Parent: "+fileObj.getParent());
                System.out.println("Size in bytes: "+fileObj.length());


            }else{
                System.out.println("The file does not exist!");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}