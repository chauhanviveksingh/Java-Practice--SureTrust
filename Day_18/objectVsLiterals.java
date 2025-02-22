package Day_18;

public class objectVsLiterals {
    public static void main(String args []){
        String str1="Vivek";  
        // Literals
        String str2=new String("Singh");
        // Object
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
    }
    
}


