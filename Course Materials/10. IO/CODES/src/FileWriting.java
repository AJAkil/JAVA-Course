import java.io.*;

public class FileWriting {
    public static void main(String[] args) throws IOException {

        //Writing with file writer
        /*FileWriter writer = new FileWriter("D:\\JAVA_FILES\\story.txt");

        String s = "This is the story of how I embarked in a great journey of learning java.\n" +
                "It's a very fun but challenging language to learn.\n"+
                "But I am enjoying it thoroughly.";


        writer.write(s+"\n"+"ok");

        System.out.println("Succesfully writtent to file");

        writer.close();*/

        //writing with buffered writer
        FileReader reader = new FileReader("D:\\JAVA_FILES\\story.txt");
        BufferedReader br = new BufferedReader(reader);

        FileWriter writer = new FileWriter("D:\\JAVA_FILES\\story_copy.txt");
        BufferedWriter bw = new BufferedWriter(writer);

        while (true){
            String data = br.readLine();
            if (data == null ) break;

            bw.write(data+"\n");
            //bw.newLine();
        }

        bw.write("This is something extra to the story");

        // Closing the file streams
        bw.close();
        writer.close();
        br.close();
        reader.close();










    }
}
