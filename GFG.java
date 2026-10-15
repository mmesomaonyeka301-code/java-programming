    import java.util.Arrays;
    import java.util.ArrayList;
    import java.util.Arrays;
    //or simply add all generic java libraries
    import java.util.*;
    public class GFG {
        //Main driver method
        public static void main(String[] args) {
            //Creating an ArrayList of String type
                List<String> list = new ArrayList<String>();
            //Adding elements to the ArrayList
            list.add("Lets");
            list.add("start");
            list.add("power");
            list.add("programming");
            list.add("with");
            list.add("Java");
            //converting ArrayList to Array
            String[] array = list.toArray(new String[0]);
            //iterating through the Array and printing the elements
            for(int i = 0; i < array.length; i++) {
            String data = array[i];
            //printing the elements of Array
            System.out.print(data);
            }
        }
    }
    