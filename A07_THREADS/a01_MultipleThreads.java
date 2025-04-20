/*
 * #  Cocepts:
 * 1. Thread class
 * 2. run and start methods
 * 3. Priority
 * 4. Thread.sleep();
 * 5. Runnable interface
 * 6. Synchronized
 */


class A extends Thread{
    public void run(){

        for(int i=0;i<50;i++){
            System.out.println("Hi");
            // try{
            //     Thread.sleep(10);
            // }catch(Exception e) {
            //     System.out.println(e);
            // }
        }
    }
}

class B extends Thread{
    public void run(){

        for(int i=0;i<50;i++){
            System.out.println("Hello");
        }

        // try{
        //     Thread.sleep(10);
        // }catch(Exception e) {
        //     System.out.println(e);
        // }
    }
}

public class a01_MultipleThreads {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        // Priority it just for suggestion to thread it dosent mean high periority thred exucute first
        // a.setPriority(8); // we can set proprity between 1-10; and default is 5
        // a.setPriority(Thread.MAX_PRIORITY); Thread.MAX_PRIORITY, MIN_PRIORITY, NORM_PRIORITY



        a.start();
        b.start();
    }
}
