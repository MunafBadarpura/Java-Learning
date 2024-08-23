class A{
    void show1(){
        System.out.println("Hello from A");
    }
}

class B extends A{
    void show2(){
        System.out.println("Hello from B");
    }
}


public class a16_Upcasting_Downcasting {

    public static void main(String[] args) {
        A a = (A) new B();   // upcasting
        // a.show2(); we can not access

        B b = (B) a;
        b.show2();
    }
}