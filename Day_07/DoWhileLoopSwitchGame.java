package Day_07;
import java.util.Scanner;

public class DoWhileLoopSwitchGame {
    public static void main(String [] args ) {
Scanner sc= new Scanner(System.in);
int option;
do{
    System.out.println("1. Start");
    System.out.println("2. Play");
    System.out.println("3. Pause");
    System.out.println("4. Exit");

    option= sc.nextInt();
    switch(option){
    case 1:
    System.out.println("game started");
    case 2:
    System.out.println("Playing");
    case 3:
    System.out.println("Pause the Game");
    case 4:
    System.out.println("Exit");
    }

} while(option !=4);
sc.close();

    }
}
