package Day_11;

public class LinearsearchWithFunction {
// Linear search with function
    public static void main(String args []){
        int target=7;
        int arr[]= {2,3,4,5,6,7,8,9};
        LinearSearchFun(arr, target);
    }


    static void LinearSearchFun(int arr[], int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]== target){
                System.out.println("Your element is found at :"+ i);
                return;

            }
        }
            System.out.println("Your element is not found");

    }
    }
    
