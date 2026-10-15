import java.util.*;
public class Colour3 {
    public static void main(String[] args){
        //creating an ArrayList of String type
        ArrayList<String> colourList = new ArrayList<String>();
        //Adding elements to the ArrayList
        colourList.add("Red");
        colourList.add("Green");
        colourList.add("Orange");
        colourList.add("White");
        colourList.add("Black");
        //print the ArrayList
        System.out.println(colourList);
        //Now inserting an element at the first position
        colourList.add(0, "Pink");
        //print the ArrayList
        System.out.println(colourList);
        //Now insert more elements
        colourList.add(0, "Kamsi");
        colourList.add(1, "Anointedtheweirdo");
        colourList.add(5, "Demilade");
        //Now print the ArrayList
        System.out.println(colourList);

    }
    
}
