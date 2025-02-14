package Day_09;
import java.util.Scanner;
public class sumOfArrayScanner {
    public static void main(String args []){
        Scanner sc= new Scanner(System.in);
        int length;
        System.out.println("Enter the size of Array");
        length=sc.nextInt();

        int arr[]= new int[length];
        System.out.println("Enter Array elements");
       for(int i=0; i<length; i++){
        arr[i]=sc.nextInt();
       }

       int sum=0;
       for(int j=0; j<length; j++){
        sum += arr[j];
       }

       System.out.println("The sum of the array element :" +sum);
    }
    
}
