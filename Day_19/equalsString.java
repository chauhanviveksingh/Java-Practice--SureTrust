package Day_19;

public class equalsString {
    public static void main(String args []) {
        String s1= new String("VIVEK");

        String s2= s1.intern();


        System.out.println(s1 == s2);
    }
    
}


