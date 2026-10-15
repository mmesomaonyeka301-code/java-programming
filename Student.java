import java.util.*;
public class Student {
    public static void main(String[] args) {
        //creating an ArrayList of String type
        ArrayList<String> studentList = new ArrayList<String>();
        //Adding elements to the ArrayList
        studentList.add("Kamsi");
        studentList.add("Anointedtheweirdo");
        studentList.add("Demilade");
        //print the ArrayList
        System.out.println(studentList);
        //Now inserting an element at the first position
        studentList.add(0, "Mmesoma");
        //print the ArrayList
        System.out.println(studentList);
        //Now insert more elements
        studentList.add(1, "Ayo");
        studentList.add(5, "Oluwaseun");
        //Now print the ArrayList
        System.out.println(studentList);

    }
}
