class A implements Runnable{
    public void run(){

        for(int i=0;i<5;i++){
            System.out.println("Hi");

            try{
                Thread.sleep(10);
            }catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}

class B implements Runnable{
    public void run(){

        for(int i=0;i<5;i++){
            System.out.println("Hello");
        }

        try{
            Thread.sleep(10);
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}

public class a03_RunnableTHread {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        // a.start(); it is not posiible in runnable thread

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();
    }
}
