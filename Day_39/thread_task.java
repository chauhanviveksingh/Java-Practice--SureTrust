package Day_39;

public class thread_task {
    public static void main(String args []){
       
        Task1 task1= new Task1();
        task1.start();
        Task1 task2= new Task1();
        task2.start();
    }
    
    static class Task1 extends Thread {
            public void run(){
                for(int i=0; i<10; i++){
                    System.out.println(i);
                    try{
                        Thread.sleep(1000);
                    } catch(InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
    }

}
