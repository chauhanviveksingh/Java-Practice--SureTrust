package Day_09;
import java.util.Scanner;
public class sumOfOddEvenNumber {
    public static void main(String args []){
        Scanner sc= new Scanner(System.in);
        
        int size;
        System.out.println("Enter the size of the Array");
        size=sc.nextInt();

        int arr[]= new int [size];
        System.out.println("Enter the array elements");
        for(int i=0; i< size; i++){
            arr[i]=sc.nextInt();
        }

      int  totalOdd=0;
      int totalEven=0;

      for(int i=0; i<size; i++){
        if(arr[i] % 2 == 0){
            totalEven += arr[i];
        } else {
            totalOdd += arr[i];
        }
      }
      System.out.println("Even sum:  "+ totalEven + "  Sum of Odd :" +totalOdd);

    }
    
}

// Output
// Even sum:  12  Sum of Odd :9
