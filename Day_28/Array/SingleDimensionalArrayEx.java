package Day_28.Array;

public class SingleDimensionalArrayEx {
    public static void main(String args []) {

        int marks []= new int [5];
        marks[0]=100;
        marks[1]= 98;
        marks[2]=88;
        marks[3]=79;
        marks[4]=99;

        System.out.println("Array printed by for loop");
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

System.out.println("Array Printed by For Each loop");


        for(int num : marks){
            System.out.println(num);
        }
    }
    
}


// One Dimensional Array in Java

// A one-dimensional array in Java is a collection of similar types of elements stored at contiguous memory locations. The data is stored in a continuous manner, which makes operations like search, delete, insert etc., much easier.


// Array Utilities in Java

// The Arrays class in java.util package is a part of the Java Collection Framework. This class provides static methods to dynamically create and access Java arrays. It consists of only static methods and the methods of Object class. The methods of this class can be used by the class name itself.
