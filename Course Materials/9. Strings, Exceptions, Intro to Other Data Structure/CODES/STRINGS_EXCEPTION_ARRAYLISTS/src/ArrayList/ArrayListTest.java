package ArrayList;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        //Declarations
        ArrayList<Integer>integerList = new ArrayList<>();
        ArrayList<String>stringList = new ArrayList<>();
        ArrayList<String>itemsList = new ArrayList<>();


        //inserting elements into the arrayList
        integerList.add(1);
        integerList.add(2);

        //System.out.println(integerList);

        //retrieving element of arrayList
        //System.out.println(integerList.get(0));
        //System.out.println(integerList.get(100));

        //size of the array list
        //System.out.println(integerList.size());

        // addAll() method demonstration
        ArrayList<Integer>newList = new ArrayList<>();

        newList.add(10);
        newList.add(20);
        newList.add(30);

        integerList.addAll(newList);
        //System.out.println(integerList);


        //retainAll function demonstration
        stringList.add("toy");
        stringList.add("car");

        itemsList.add("toy");
        itemsList.add("car");
        itemsList.add("pen");
        itemsList.add("pencil");

        //itemsList.retainAll(stringList);
        //System.out.println(itemsList);


        //Sublist
        //System.out.println(integerList);
        //System.out.println(integerList.subList(2, 5));

        //looping through an array list
        /*for (int i = 0; i < itemsList.size(); i++) {
            System.out.println(itemsList.get(i));
        }

        for (String items : itemsList) {
            System.out.println(items);
        }*/


        //removing from the list
        System.out.println(integerList);
        integerList.remove(2);
        System.out.println(integerList);


    }
}
