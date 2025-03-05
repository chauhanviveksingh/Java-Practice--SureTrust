package Day_27;

public class polymorphism_02 {
    public static void main (String args []) {
        polymorphism_02 outer = new polymorphism_02();
        King k = outer.new Son();
        
        k.kingdom();
    }


    public class King {
        void kingdom(){
            System.out.println("Im the Royal King");
        }
    }

    public class Son extends King {
        @Override
        void kingdom(){
            System.out.println("Im the Growing King");
        }
    }
    
}
