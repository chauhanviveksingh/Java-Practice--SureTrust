package Day_11;
// Linear Search with for each loop
public class linearSearchforEach {
    public static void main (String args []){
        int target=7;
        int arr[]= {3,4,5,6,7,8,9};
        for(int x : arr){
            if (x == target ){
                System.out.println("Your Element is found");
                return;
            }
        }
        System.out.println("Your element is not found");
    }
}
