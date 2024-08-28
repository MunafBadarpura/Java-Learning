class MyClass extends Thread{
    String name;
    MyClass(String name) {
        this.name = name;
    }

    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(name + " is running: iteration " + i);
        }

        try {
            Thread.sleep(1000);  // Sleep for 1 second
        } catch (InterruptedException e) {
            System.out.println(name + " was interrupted.");
        }

        System.out.println(name + " has completed.");
    }
}

public class a02_SleepThred {
    public static void main(String[] args) {
        MyClass class1 = new MyClass("Class1");
        MyClass class2 = new MyClass("Class2");

        class1.start();
        class2.start();
    }
}
