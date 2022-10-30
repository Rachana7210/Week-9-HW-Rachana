package pro1Calculate;

import java.util.ArrayList;
import java.util.List;

public class Prog7 {

    public static void main(String[] args) {
        // Create a list and add some underground tube in list
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Bakerloo");
        list_Strings.add("Central");
        list_Strings.add("District");
        list_Strings.add("Jubilee");
        list_Strings.add("Piccadilly");
        list_Strings.add("Metropolitan");

        System.out.println("Original array list: " + list_Strings);
        System.out.println("Checking the above array list is empty or not! "+list_Strings.isEmpty());
        list_Strings.removeAll(list_Strings);
        System.out.println("Array list after remove all elements "+list_Strings);
        System.out.println("Checking the above array list is empty or not! "+list_Strings.isEmpty());
    }
}
