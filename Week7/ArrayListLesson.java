package Week7;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListLesson{

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        // add items
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Honda");
        // print the arraylist
        System.out.println(cars);
        // access items at specific index
        cars.get(0);
        // change an item
        cars.set(0,"Volvo");
        // remove an item
        cars.remove(0);
        // remove all items in arraylist
        // cars.clear();
        // get the current size of the arraylist
        cars.size();

        // loop through an arraylist
        for (String i : cars) {
            System.out.println(i);
            
        }

        // Sort an array list
        Collections.sort(cars);

        for (String i : cars) {
            System.out.println(i);
        }

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();

        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);

        int addValue = 0;

        for (Integer i : myNumbers) {
            addValue = addValue + i;
        }
        System.out.println(addValue);
        //https://www.geeksforgeeks.org/arraylist-in-java/
        //https://www.geeksforgeeks.org/wrapper-classes-java/
    }
}
