// until java 1.7 we can use only public abstract in interface
// after java 1.7 we can use dealut and static methods in interface

// Default Methods
// we can impliment in interface
// override in any other class

// Static Methods
// we can impliment in interface
// we can not override in any other class

interface A{
    default void hello(){
        System.out.println("hello");
    }

    static void hello2(){
        System.out.println("hellStatic");
    }
}

class B implements A{
    // we can also override defalut method
    @Override
    public void hello(){ 
        System.out.println("hello2");
    }

    // it is not overriding this is diffrent hello2
    // @Override <--- this gives error
    public void hello2(){
        System.out.println("hellooo");
    }
}

public class a11_DEFAULTin_Interface {
    public static void main(String[] args) {
        B b = new B();
        b.hello();

        A.hello2(); // we can access static method with this
    }
}
