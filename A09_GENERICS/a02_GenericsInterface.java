package Generics;

/*
*  1. Generic Interface
*  => A generic interface in Java allows you to define an interface with type parameters.
*
*  2. Two Types Of Implimentation
*  => Implementing with a specific type
*  => Implementing a generic interface generically
*
* */

interface Boxs<T>{
    void setA(T a);
    T getA();
}


// Implementing with a specific type
class BoxClass implements Boxs<Integer>{
    private Integer a;

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getA(){
        return a;
    }

}


// Implementing a generic interface generically
class BoxClass2<T> implements Boxs<T>{
    private T a;

    public void setA(T a) {
        this.a = a;
    }

    public T getA(){
        return a;
    }

}

//Bounded Types
class BoxClass3<N extends Number>{
    private N a;

    public void setA(N a) {
        this.a = a;
    }

    public N getA(){
        return a;
    }

}

public class a02_GenericsInterface {
    public static void main(String[] args) {
        // Implementing with a specific type
        BoxClass b1 = new BoxClass();
        b1.setA(10);
        System.out.println( b1.getA());

        // Implementing a generic interface generically
        BoxClass2<String> b2 = new BoxClass2<>();
        b2.setA("Munaf");
        System.out.println( b2.getA());

        //Bounded Types
        BoxClass3<Integer> b3 = new BoxClass3<>();
        b3.setA(20); // we can specify only number type like int float double etc not string
        System.out.println( b3.getA());
    }

}
