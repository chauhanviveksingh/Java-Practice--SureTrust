package Day_35;

import java.util.PriorityQueue;

public class priorityqueue_collection {
    public static void main (String args[]){
        PriorityQueue<Integer> queue= new PriorityQueue<>();    
        queue.add(3);
        queue.add(1);
        queue.add(6);
        queue.add(9);
        queue.add(5);

        System.out.println(queue);

}
}

// The order you see is based on the internal heap structure, 
// not a sorted list. The smallest element (1) is at the head because PriorityQueue is implemented as a min-heap.