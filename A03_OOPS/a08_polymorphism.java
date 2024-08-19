
// method overloading - compile time    
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}

// method overriding - run time    
class Animal{
    void eat(){
        System.out.println("eat anything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}
public class a08_polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(10,20));
        System.out.println(calc.sum((float)10.20,(float)20.30));
        System.out.println(calc.sum(10,20,30));

        Animal dog = new Animal();
        Deer deer = new Deer();

        dog.eat();
        deer.eat();
    }
}
