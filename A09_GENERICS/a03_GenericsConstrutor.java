package Generics;

class Hello{
    <T> Hello (T Val){
        T a = Val;
        System.out.println(a);
    }
}

public class a03_GenericsConstrutor {
    public static void main(String[] args) {
        Hello h1 = new Hello(10);
        Hello h2 = new Hello("Munaf");

    }
}
