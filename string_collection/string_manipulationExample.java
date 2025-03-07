package string_collection;

public class string_manipulationExample {
    public static void main(String args []) {

        System.out.println("Printing string using Literal");

        String str1= "Vivek";
        System.out.println(str1);

        System.out.println("Printing string using Object Creation and It is store in Heap Memory");
        String str2= new String("Singh");
        System.out.println(str2);

        System.out.println("Concatenating the both String srt1 and str2");

        String str3= str1+" "+str2;
        System.out.println(str3);


    // String Methods
    System.out.println("Length of String = "+ str3.length());
    System.out.println("Index of Char in String = "+ str3.charAt(3));
    System.out.println("Concate two String = "+str1.concat(str2));
    System.out.println("Substring from a String = "+ str3.substring(0,5));
    System.out.println("Check the two Strings are equal = "+ str1.equals(str2));
    System.out.println("Checking word is present in a String = "+ str3.contains("Vivek"));
    System.out.println("Convert to Lower Case = "+ str3.toLowerCase());
    System.out.println("Convert to Upper Case = "+ str3.toUpperCase());
    System.out.println("Remove whitespace from string = "+ str3.trim());

    }
}
