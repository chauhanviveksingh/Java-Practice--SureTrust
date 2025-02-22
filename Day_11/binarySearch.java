package Day_11;
import java.util.Arrays;
public class binarySearch {
    public static void main (String args []){
        int arr[]={3,5,6,8,9,11,44,21};
        int target=44;
        Arrays.sort(arr);
    }
    

    static int Bsearch(int []arr, int target){
        int start=0;
        int end= arr.length-1;
        int mid= start+(end-start)/2;

        while(start <= end) {
            mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                return mid;
            } else if(arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // target not found
    }
    
}
