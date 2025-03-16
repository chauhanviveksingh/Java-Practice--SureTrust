package list_collection;

import java.util.Vector;

public class vector_collection {
    public static void main(String args []) {
        Vector<String> vector= new Vector<String>();

        System.out.println(vector.size());

        vector.add("Programming");
        vector.add("Networking");
        vector.add("Database");
        vector.add("Deployment");
        vector.add("Cloud Services");

        System.out.println(vector.size());

        vector.remove(0);

        System.out.println(vector.size());

        vector.clear();

        System.out.println(vector.size());
    }
    
}

/*  
Vector is like the dynamic Array which can groe or shrink its size.
 Unlike Array, we can store n-number of elements in it as there is no size limit.
 It is found in the java.util package and implements the List interface.So we can use all the methods of List interface here.
 The elements of the vector object can be accessed via an index into the vector.

 It is similar to th ArrayList ,But mainly with two Differences
  1. Vector is Synchronized.
 2.Vector contains many legacy methods that are not part of the collections framework.

 Advantages of Vector
* Dynamic Size  * Legacy Support  * Synchronization   
 
It grows double its size when its capacity is reached
Vector uses Enumerator and Iterator for traversing.
Vector is thread-safe.

*/