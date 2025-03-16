package list_collection;

import java.util.LinkedList;

import javax.sound.sampled.SourceDataLine;

public class linkedList_collection {
    public static void main(String args []) {

        LinkedList<String> llist= new LinkedList<String>();

        llist.add("Java");
        llist.add("Python");
        llist.add("JavaScript");
        llist.add("C#");

        System.out.println(llist.size());

        System.out.println(llist);
// Removing element from the Linked List by passing Object or by index
        llist.remove(0);
        llist.remove("Python");

        System.out.println("After removeable : "+llist);
    }
    
}
