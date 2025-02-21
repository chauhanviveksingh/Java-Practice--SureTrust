package Day_14;

public class bubbleSort {
    public static void main(String args []){
        int arr[]= {34,43,56,12,22,62};
         
        int n=arr.length;
        boolean IsSwap=false;

        for(int i=0; i<n; i++){
            
            for(int j=0; j<n-1; j++){
            
                if(arr[j]> arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                    IsSwap=true;
                }
            }
            if(! IsSwap){
                return;
            }
        }
        for(int num : arr){
            System.out.print(num + " ");

        }
        }
    }
    

