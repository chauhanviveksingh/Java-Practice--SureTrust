package Day_28.Array;

public class MultiDimensionalArrayEx {
    public static void main(String args []) {
        int arr [][]= {
            {23,24,25,26,27},
            {33,34,35,36,37},
            {43,44,45,46,47}
        };
        System.out.println(" 2-D Array Printed by For Loop ");
        for(int i=0; i<3; i++){
            for(int j=0; j<5; j++){
        System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


// Multidimesional Arrays in Java

// Multidimensional Arrays can be defined in simple words as array of arrays. Data in multidimensional arrays are stored in tabular form (in row major order). 
