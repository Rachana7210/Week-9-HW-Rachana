package pro1Calculate;

import java.util.ArrayList;

public class Prog4 {
    public static void main(String[] args) {

        ArrayList <String> colour =  new ArrayList();
        colour.add("Red");
        colour.add("Blue");
        colour.add("Orange");
        colour.add("Green");
        colour.add("Purple");
        colour.add("Violet");
        colour.add("White");

        for(String colourName : colour){
            System.out.println(colourName);
        }

    }

}
