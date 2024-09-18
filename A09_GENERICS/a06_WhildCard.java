package Generics;

/*
* 1. Wildcards in Generics
* => wildcards (?) are a special kind of type argument
*    that can be used in method arguments or class definitions to represent an unknown type.
*
* => Wildcards are useful when you don’t know the exact type at the time of defining a class or method.
* => we can use it only for read only(like printing etc) not for operation(like addition, return a value, update value etc)
*
*
* 2.Basic syntax
* => List<?> list;
* => Here, (?) represents an unknown type. It means the list can contain elements of any type
* => but you cannot perform type-specific operations on the elements.\
*
*
* 3. Types :
*   1. Unbounded Wildcard (?)
*   2. Upper-Bounded Wildcard (? extends Type)
*   3. Lower-Bounded Wildcard (? super Type)
*
*   => Summery :
*       <?>               : Any type (unbounded wildcard).
        <? extends Type>  : A type that is a subclass of Type (upper-bounded wildcard).
        <? super Type>    : A type that is a superclass of Type (lower-bounded wildcard).

 *
* */


import java.util.ArrayList;

public class a06_WhildCard {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);

        hello(arr);
        System.out.println();
        System.out.println(sum(arr));
    }

    // ====> Normal Generics
//    public static <T> void hello(ArrayList<T> arr){
//        for(T n : arr){
//            System.out.print(n + " ");
//        }
//    }

    // ====> 1. Unbounded Wildcard (?)
    public static void hello(ArrayList<?> arr){
        for(Object n : arr){
            System.out.print(n + " ");
        }
    }

    // ====> Upper-Bounded Wildcard (? extends Type)
    public static int sum(ArrayList<? extends Number> arr){ // number ke niche
        int sum = 0;
        for(Number n : arr){
            sum += n.intValue();
        }
        return sum;
    }

    // ====> Lower-Bounded Wildcard (? super Type)
    public static void print(ArrayList<? super Integer> arr){ // integer ke upar
        for(Object n : arr){
            System.out.print(n + " ");
        }
    }


}
