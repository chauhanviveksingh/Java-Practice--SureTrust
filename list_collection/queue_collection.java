package list_collection;

import java.util.PriorityQueue;

public class queue_collection {
    public static void main(String args []) {
        PriorityQueue<Integer> queue= new PriorityQueue<>();

        System.out.println(queue.size());

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println(queue.peek());

        System.out.println(queue.poll());

        System.out.println(queue.isEmpty());

        System.out.println(queue.size());



    }
    
}



/*
 The Queue in data structture is an ordered , linear sequence of items.
 It is a FIFO (First In First Out) data structure
 We can insert an item to the rear end of the queue.
 And remove from the front of the queue only.
 A Queue is a sequential data type ,Unlike an array.

 ** A Queue in data structure can be accessed from both of its sides(at the front for the deletion and back for insertion). A 
 A Queue in data structure can be implemented using Arrays, Linked List, or vectors. 
 
 ** Application of Queue
People on an escalator
Cashier line in a store
A car wash Line
One way exits
 
 
 */