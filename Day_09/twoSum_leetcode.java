package Day_09;
// Two Sum leetcode
public class twoSum_leetcode {
    public static void main(String args []){
        int arr[]={2,3,4,5,6,7,8};
        int target=11;

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if( arr[i] + arr[j] == target){
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            }
        }
    }
    
}
