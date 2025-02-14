package Day_11;
//swapping of 3 numbers without using extra variables
public class swap3Numbers {
    public static void main(String args []){
        int a=5; 
        int b=7;
        int c=8;

        a=a+b+c;

        b=a-(b+c);
        c=a-(b+c);
        a=a-(b+c);

        System.out.println("number after Swapping : "+a +" "+b +" "+c);


    }
    
}
