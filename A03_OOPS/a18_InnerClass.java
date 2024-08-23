class A{
    int age;
    
    void show(){
        System.out.println("In A");
    }

    class B{
        int age2;
        void show2(){
            System.out.println("In B");
        }
    }
}

public class a18_InnerClass {

    public static void main(String[] args) {
        // B b = new B(); // we can not create directly 
        A obj1 = new A();
        obj1.show();

        A.B obj2 = obj1.new B();
        obj2.show2();

    }
}