// every construcot first statement is super();
// we can change parent class variable using super keyword ex = super.colour = "brown";
// evry class in java by default extends Object class : see line no 23 
// this(); execute own constructor


// class Animal{
//     String colour;
//     Animal(){
//         System.out.println("Animal construcot called");
//     }
// }

// class Horse extends Animal{
    
//     Horse(){
//         super();
//         super.colour = "brown";
//         System.out.println("Horrse constructor called");
//     }
// }

class A extends Object{
    A(){
        System.out.println("in A");
    }
    A(int n){
        System.out.println("in A INT");
    }
}
class B extends A{
    B(){
        // super(); by default every construcot have this statement
        System.out.println("in B");
    }
    B(int n){
        this();
        System.out.println("in B INT");
    }
}

public class a12_Super_Keyword {
    public static void main(String[] args) {
        // Horse h1 = new Horse();
        // System.out.println(h1.colour);

        B b = new B(10);
    }
}
