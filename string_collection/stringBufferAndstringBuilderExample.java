package string_collection;

public class stringBufferAndstringBuilderExample {
    public static void main (String args []) {
   //  Getting start time of program execution  
    long StartTime= System.currentTimeMillis();
        //    Using String Buffer
       System.out.println("Printed Using StringBuffer");
        StringBuffer bff=new StringBuffer("Vivek ");

        System.out.println(bff.capacity());
        // bff.append("Singh");
        System.out.println(bff);
        for( int i=0; i<10000; i++){
            bff.append("Singh");
        }
        System.out.println("Time taken by StringBuffer : "+ (System.currentTimeMillis()- StartTime));

// Using String Builder
    System.out.println("Printed Using String Builder");
        StringBuilder Sb= new StringBuilder("Vivek ");
        System.out.println(Sb.capacity());
        // Sb.append("Singh");
        System.out.println(Sb);
        for(int i=0; i<10000; i++){
            Sb.append("Singh");
        }

        System.out.println("Time taken By StringBuilder : "+(System.currentTimeMillis()- StartTime));

    }
    
}
