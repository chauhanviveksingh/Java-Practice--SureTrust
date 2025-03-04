package Day_26;

public class inheritance_java {
    public static void main(String args []) {
    B1 b= new B1();
    b.god();
}
}

class A {
    void ghost() {
        System.out.println("Ghost");
    }
}

class B1 extends A {
    void god() {
        System.out.println("God");
    }
}

class B2 extends A {
    void good() {
        System.out.println("Im good");
    }
}

class B3 extends A {
    void run() {
        System.out.println("Running");
    }
}
