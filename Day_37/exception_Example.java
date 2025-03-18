package Day_37;

public class exception_Example {
    public static void main (String args []) {
        int a=10;
        int b=10; // if user enter b=0, then exception will be thrown 
        try {
        System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }  catch (Exception e){
        } catch (Throwable e){
            throw new Exception(e);
        }
        System.out.println("Hello Vivek ");
    }
}

