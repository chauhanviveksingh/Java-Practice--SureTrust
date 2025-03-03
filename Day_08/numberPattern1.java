package Day_08;
import java.util.Scanner;

public class numberPattern1 {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number upper limit");
        n=sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=5; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}

// Output

// 54321
// 54321
// 54321
// 54321
// 54321
