package pro1Calculate;

public class Prog3 {

    public static void main(String[] args) {
        //initialize array
        int[]array={10,20,30,40,50};
        System.out.println("Original array:");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i] + "");
        }

        System.out.println("Array in reverse order:");
        //Loop through the array in reverse order
        for(int i = array.length-1; i>=0; i--){
            System.out.println(array[i] + "");
        }
    }
}
