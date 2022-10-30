package pro1Calculate;

import java.util.ArrayList;
import java.util.List;

public class Prog10 {

    public static void main(String[] args) {

        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Baker Street ");
        list_Strings.add("Charing Cross ");
        list_Strings.add("Oxford Circus");
        list_Strings.add("Edware Road");
        // Print the list
        System.out.println("Bakoor line Stations for ZONE 1"+list_Strings);

        List<String> listStrings = new ArrayList<String>();
        listStrings.add("Bond Street ");
        listStrings.add("Green Park");
        listStrings.add("Charing Cross");
        listStrings.add("Baker Street");
        // Print the list
        System.out.println("Jubilee  line Stations for ZONE 1"+listStrings);

        List<String> liststrings = new ArrayList<String>();
        liststrings.add("Bank ");
        liststrings.add("Liverpool street");
        liststrings.add("Tottenham Street ");
        liststrings.add("Mile End");
        liststrings.add("Holborn");
        liststrings.add("Chancery Lane");
        liststrings.add("Queens way");
        liststrings.add("Lancery Gate");
        // Print the list
        System.out.println("Central line Stations for ZONE 1"+liststrings);

    }

}
