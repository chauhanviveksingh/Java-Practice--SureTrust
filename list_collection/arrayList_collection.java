package list_collection;

import java.util.ArrayList;
import java.util.List;

public class arrayList_collection {
    public static void main(String args []){

        List<String> alist= new ArrayList<String>();
        alist.add("Vivek");
        alist.add("Abhishek");
        alist.add("Vinay");
        alist.add("Alok");

        System.out.println("Size of the list :"+alist.size());

        System.out.println(alist);
       // Removing a element from the list
        alist.remove(0);
        // printing with for each loop
        for(String val: alist){
            System.out.println(val);
        }
    }
    
}


// ARRAYLIST
// Thsi class provides a resizable array implementation of the List interface.
// It is similar to an array but can dynamically increase or decrease its size as elements are added or removed.

