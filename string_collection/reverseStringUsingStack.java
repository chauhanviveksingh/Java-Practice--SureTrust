package string_collection;

import java.util.Stack;

class stringReverser{

public String reversal( String input ){
    Stack<Character> stack= new Stack<>();
    for(char ch : input.toCharArray())
            stack.push(ch);
            String reversed="";
        while(!stack.empty())
            reversed += stack.pop();

       return reversed;

}

}
public class reverseStringUsingStack {
    public static void main(String args []) {
        String str= "abcd";
        stringReverser reverser= new stringReverser();
        String result= reverser.reversal(str);

        System.out.println("Original String : "+str);
        System.out.println("Revered String : "+result);

}    
}

