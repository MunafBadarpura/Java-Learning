class A extends Thread{
    public void run(){

        for(int i=0;i<10;i++){
            System.out.println("Hi");
        }
    }
}

class B extends Thread{
    public void run(){

        for(int i=0;i<10;i++){
            System.out.println("Hello");
        }
    }
}

public class a01_MultipleThreads {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.run();
        b.run();
    }
}
