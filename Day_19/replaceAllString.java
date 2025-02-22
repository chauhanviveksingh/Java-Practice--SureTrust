package Day_19;

public class replaceAllString {
    public static void main(String args []){
        String str= "I love cats. Dog are lovely ";
String str2="(?i)cat";
System.out.println(str.replaceAll(str2,"dog"));
    }
    
}
