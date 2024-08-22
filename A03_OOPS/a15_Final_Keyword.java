// final = variale, method, class
// variable value can not change
// we can not inheret class

class A{
    final void show(){
        System.out.println("Hello from A");
    }
}

class B extends A{
    // after final we can not change function
    // void show(){
    //     System.out.println("Hello from B");
    // }
}

public class a15_Final_Keyword {
        public static void main(String[] args) {
        final int num = 10;
        // num = 20;   // error: cannot assign a value to final variable num 
        
        B b = new B();
        b.show();
    }
}
