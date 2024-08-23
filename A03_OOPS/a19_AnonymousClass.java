// Anonymouse class are used to override methods and that is used once 

class A{
    void show(){
        System.out.println("In A");
    }
}

// abstract with anonymous

abstract class Car{
    abstract void drive();
}

public class a19_AnonymousClass {
    public static void main(String[] args) {
        A obj = new A(){
            void show(){
                System.out.println("In Anonymous");
            }
        };

        obj.show();

        Car bmw = new Car(){
            void drive(){
                System.out.println("Driving in Anonymous");
            }
        };

        bmw.drive();
    }
}
