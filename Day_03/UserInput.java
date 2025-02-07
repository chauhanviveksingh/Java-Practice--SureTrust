package Day_03;
import java.util.Scanner;

public class UserInput {

    public static void main(String [] args ){
        Scanner sc= new Scanner(System.in);

        int a;
        System.out.println("Enter the value of a =");
        a=sc.nextInt();
        int b;
        System.out.println("Enter the value of b =");
        b=sc.nextInt();

        int sum= a+b;
        System.out.println("The sum of a and b ="+sum);
    
    }
    
}
