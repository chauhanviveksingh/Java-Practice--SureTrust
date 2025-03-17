package list_collection;

import java.util.Stack;

public class stack_collection {
    public static void main(String args []){
        Stack<Integer> stk= new Stack<>();
        stk.push(2);
        stk.push(4);
        stk.push(5);
        stk.push(6);
        stk.push(7);

        System.out.println(stk);

        System.out.println(stk.size());

        System.out.println(stk.pop());

        System.out.println(stk.peek());

        System.out.println(stk.size());

        System.out.println(stk);
    }
    
}


/*
 * Stack is a linear data structure in which insertion and deletion of elements can be done only at one end called the top. 
 * It has a pointer to ites element and works in LastIn first Out(LIFO) maner.
 * Stack is a class that extends Vector class.
 * It also implements interfaces List,Collection,iterable,Cloneable,Serializable.
 * Before using the stack class, we must import java.util package.
  
 * Applications of Stcak 
 1. Expression Evaluation
 2. Tree Traversal
 3.Recursion
 4.Editors
 5.Parsing
 6.Browsers

 We can perform push , pop, peek, and search operation on the Stack.

 * You will get to know the status of the stack.
  The stack is Empty. (-1)
  There is only one element in the stack (0)
  The Stack is Full (N-1)
  The Stack gets overflowed (N)
 */
