package Day_40;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class create_file {

    public static void main(String args []) throws FileNotFoundException{
        File file = new File("mock.txt");
        file.setWritable(true);
        PrintStream out = new PrintStream((file));
    }
    
}
