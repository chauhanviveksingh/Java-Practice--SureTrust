package Day_07;
public class DowhileLoop2 {
    public static void main(String args []){
        int a=1;
        while(a<5){
            System.out.println("Hello. Entered into while Loop");
            System.out.println(a);
            a++;
        }
        do{
            System.out.println("Hello, Entered the while loop");
            System.out.println(a);
            a++;
        }
        while (a<5);
    }
    
}


// Output
// Hello. Entered into while Loop
// 1
// Hello. Entered into while Loop
// 2
// Hello. Entered into while Loop
// 3
// Hello. Entered into while Loop
// 4
// Hello, Entered the while loop
// 5