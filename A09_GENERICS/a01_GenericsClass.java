package Generics;

/*
* 1. What Is Generics  :
* => Generic types allow you to define a class, interface, or method
*    with placeholders (type parameters) for the data types they will work with.
*
* 2. Generics Advantages  :
* => No Type safety
     Manual casting
     No Compile Time checking
*
* 2. Naming Convension
*   T for Type, E for Element, K for Key, V for Value, N for Number
* */


class Box<T>{
    T a;

    Box(T a){
        this.a = a;
    }
}


// Multiple Parametes
class Pair<K, V>{
    K key;
    V value;

    Pair(K key, V value){
        this.key = key;
        this.value = value;
    }
}

public class a01_GenericsClass {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>(10);
        System.out.println(b1.a);

        Box<String> b2 = new Box<>("Munaf");
        System.out.println(b2.a);

        Pair<String, Integer> p1 = new Pair<>("Age", 10);
        System.out.println(p1.key + " = " + p1.value);

    }
}
