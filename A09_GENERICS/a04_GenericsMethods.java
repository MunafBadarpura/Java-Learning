package Generics;

/*
* Syntax :
*   public <T> void methodName(T parameter) {
        // method body
    }
*
* */


public class a04_GenericsMethods {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        printArray(arr);
        System.out.println();

        String[] str = {"Munaf", "Afnan", "Hasan"};
        printArray(str);
    }



    public static <T> void printArray(T[] arr){
        for(T n : arr){
            System.out.print(n + " ");
        }
    }

    //Generic Methods and Method Overloading - if Integer type then this code will run
    public static <T> void printArray(Integer[] arr){
        for(Integer n : arr){
            System.out.print(n + " ");
        }
    }
}
