package Day_08;
import java.util.Scanner;

public class numberPattern2 {
    public static void main(String args []){
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter your number");
        n=sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

// Output
// 12345
// 2345
// 345
// 45
// 5
