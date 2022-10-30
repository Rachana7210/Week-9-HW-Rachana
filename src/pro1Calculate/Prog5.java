package pro1Calculate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Prog5 {

    public static void main(String[] args) {
        //Declaring and initializing ArrayList
        List<Integer> numbers = Arrays.asList(10,20,30,40,50,60);

        //Iterating ArrayList using Iterator
        Iterator itr = numbers.iterator();

        // Holds true till there is single element
        // remaining in the list
        while (itr.hasNext())

            // Print the elements of ArrayList
            System.out.print(itr.next() + " ");

    }



}
