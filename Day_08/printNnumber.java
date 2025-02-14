package Day_08;
import java.util.Scanner;

public class printNnumber {
    public static void main(String [] args ){
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter the your Number ");
        n=sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println(i);

        }
    }
    
}


// Output

// 1
// 2
// 3
// 4
// 5