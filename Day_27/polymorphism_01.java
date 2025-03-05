package Day_27;

public class polymorphism_01 {
    public static void main(String args []) {

        Person p= new Father();

        p.role();
    }

public static class Person {
    void role() {
        System.out.println("Im the Person");
    }
}

public static class Father extends Person {

    @Override
    void role(){
        System.out.println("Im the Father");
    }
}
}
