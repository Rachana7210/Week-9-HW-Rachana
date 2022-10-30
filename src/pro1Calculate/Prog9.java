package pro1Calculate;

import java.util.HashMap;
import java.util.Map;

public class Prog9 {

    public static void main(String[] args) {
//create a HashMap object called people
        Map<String, Integer> people = new HashMap();

        people.put("Harshil", 15);
        people.put("Aruna", 32);
        people.put("Rahul", 40);

//Iterating over HashMap entries
        for (Map.Entry<String, Integer> entry : people.entrySet())
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());








    }

}
