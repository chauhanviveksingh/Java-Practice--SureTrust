package Day_10;

public class incrementByNnumber {
    
    public static void main(String args []){
        int arr[]= {3,4,5,6,7,8};
        int n=5;
        for(int i=0; i<arr.length; i++){
            arr[i] += n;
        }
        for( int x : arr){
            System.out.print(x+ " ");

        }
    }


}
