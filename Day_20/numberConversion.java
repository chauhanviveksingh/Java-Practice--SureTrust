package Day_20;

public class numberConversion {
    public static void main(String args []){
            int a = 5;         // Decimal (Base 10)
            int b = 0b1010;    // Binary (Base 2) -> 10 in decimal
            int c = 0144;      // Octal (Base 8) -> 144 in octal = 1×64 + 4×8 + 4×1 = 100 in decimal
            int d = 0xFFFF;    // Hexadecimal (Base 16) -> FFFF in hex = 65535 in decimal
    
            // Printing values
            System.out.println("Decimal (a)   : " + a);
            System.out.println("Binary (b)    : " + b);
            System.out.println("Octal (c)     : " + c);
            System.out.println("Hexadecimal (d): " + d);
        }
    }