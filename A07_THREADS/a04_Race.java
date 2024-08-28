class Counter{
    int count;

    synchronized void inc(){
        count++;
    }
}
// class A implements Runnable{ 
//     public void run(Counter c){
//         for(int i=0;i<5;i++){
//             c.counter++;
//         }
//     }
// }

// class B implements Runnable{
//     public void run(Counter c){
//         for(int i=0;i<5;i++){
//             c.counter++;
//         }
//     }
// }


public class a04_Race {
    public static void main(String[] args) {
        Counter c = new Counter();

        Runnable a = () -> {
            for(int i=0;i<20000;i++){
                c.inc();
            }
        };
        Runnable b = () -> {
            for(int i=0;i<20000;i++){
                c.inc();
            }
        };

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();

        try {
            t1.join();  // Wait for thread t1 to finish
            t2.join();  // Wait for thread t2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(c.count);
    }
}
