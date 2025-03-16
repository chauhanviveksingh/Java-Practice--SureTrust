package Array_Problems;

public class maxProduct {
    public static void main (String args []){

    int[] arr={2,3,5,6,7};
    int max1= Integer.MIN_VALUE;
    int max2= Integer.MIN_VALUE;
    for(int num : arr){
        if(num > max1){
            max2= max1;
            max1= num;
        } else if ( num > max2){
            max2= num;
        }
    }
System.out.println(max1*max2);

    }  
}
