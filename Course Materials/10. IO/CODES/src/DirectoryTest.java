import java.io.File;

public class DirectoryTest {
    public static void main(String[] args) {

        String dirname = "D:\\JAVA_FILES\\Test";
        File f1 = new File(dirname);

        if (f1.isDirectory()){
            System.out.println("Directory: " + dirname);
            String[] fileList = f1.list();

            for (int i = 0; i < fileList.length; i++) {
                File f = new File(dirname+"\\"+fileList[i]);

                if(f.isDirectory()){
                    System.out.println(fileList[i] + " is a directory");
                }else{
                    System.out.println(fileList[i] + " is a file");
                }
            }

        }else{
            System.out.println(dirname + " is not a directory!");
        }



    }
}
