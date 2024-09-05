public class a05_ extends Thread{

    @Override
    public void run(){

    }

    public static void main(String[] args) throws InterruptedException {
        a05_ a = new a05_();
        System.out.println(a.getState());

        a.start();
        System.out.println(a.getState());
        System.out.println(Thread.currentThread().getState());
        Thread.sleep(100);
        System.out.println(Thread.currentThread().getState());

        a.join();
        System.out.println(a.getState());

       
    }
}
