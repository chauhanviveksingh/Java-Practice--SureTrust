package Day_11;
// Linear Seacrh without function
public class linearSearchLoop {
    public static void main(String args []){
        int target=9;

        int arr[]= {2,3,4,5,6,9,7,8};

        for(int i=0; i<arr.length; i++){
            if(arr[i]== target){
                System.out.println("Your element is found at :"+ i);
                return;
            }
        }
            System.out.println("Your element is not found");

        }
    }
    

