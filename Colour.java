import java.util.*;
public class Colour{
    //Main method
    public static void main(String[] args) {
        //creating an ArrayList of String type
        ArrayList<String> colour = new ArrayList<String>();
        //Adding elements to the ArrayList
        colour.add("Red");
        colour.add("Green");
        colour.add("orange");
        colour.add("white");
        
        //iterating through the ArrayList and printing the elements
        for(int i = 0; i < colour.size(); i++) {
            System.out.println(colour.get(i));
        }
    }
}