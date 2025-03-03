package Day_25;

public class interface_java {
    public static void main(String args []){
        CookingMachine machine = new CookingMachineImpl();
        machine.cookChickenBiryani();
    }
}

class CookingMachineImpl implements CookingMachine {
    public void cookChickenBiryani(){
        System.out.println("add rice");
    }
}

interface CookingMachine{
    void cookChickenBiryani();
}
