package list_collection;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueueUsingStack {

    public static void reverse(Queue<Integer> q) {
        Stack<Integer> stk= new Stack<Integer>();
        while(!q.isEmpty()){
            stk.push(q.remove());
        }
        while(!stk.isEmpty()){
            q.add(stk.pop());
        }
    }
    public static void main(String args []) {

        Queue<Integer> q= new ArrayDeque<Integer>();
        q.add(20);
        q.add(40);
        q.add(35);
        q.add(50);
        q.add(70);

        System.out.println("Original : "+ q);
        reverse(q);
        System.out.println("Reversed : "+q );

    }
    
}