package pro1Calculate;

import java.util.ArrayList;
import java.util.List;

public class Prog6 {

    public static void main(String[] args) {
      //Create a list and add some objects to the list
        List<String> object = new ArrayList<String>();
        object.add("Lunch Box");
        object.add("Water Bottle");
        object.add("Pencil Case");
        object.add("School Bag");
        object.add("PE Kit");
        object.add("Sketchpen Set");

        //print the list
        System.out.println(object);
        //Retrive the first and third element
        String element = object.get(0);
        System.out.println("First element: "+element);
        element = object.get(2);
        System.out.println("Third element:" +element);
    }

}

