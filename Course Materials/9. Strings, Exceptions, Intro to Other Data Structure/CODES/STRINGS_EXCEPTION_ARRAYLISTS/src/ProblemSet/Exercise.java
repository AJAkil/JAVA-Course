package ProblemSet;

import java.util.ArrayList;

public class Exercise {

    public static void main(String[] args) {
        ArrayList<String>authors = new ArrayList<>();
        ArrayList<String>authorsMod = new ArrayList<>();
        String[] splitted = null;
        String firstName = "";
        String lastName = "";
        String dob = "";
        int index = -1;


        authors.add("jK,rowling,1965");
        authors.add("eLif,shafak,1971");
        authors.add("mario,puzo,1920");
        authors.add("charles,dickens,1812");
        authors.add("fedor,dostoyevski,1821");

        for (String element : authors) {
            splitted = element.split(",");
            firstName = splitted[0];
            lastName = splitted[1];
            dob = splitted[2];

            authorsMod.add(firstName.substring(0,1).toUpperCase()+lastName.substring(0,1).toUpperCase()+","+dob);

        }

        System.out.println(authorsMod);

        int max = Integer.parseInt(authorsMod.get(0).split(",")[1]);

        for (int i = 1; i < authorsMod.size(); i++) {
            int temp = Integer.parseInt(authorsMod.get(i).split(",")[1]);

            if(temp > max){
                max = temp;
                index = i;
            }
        }

        System.out.println(authorsMod.get(index));





    }
}
