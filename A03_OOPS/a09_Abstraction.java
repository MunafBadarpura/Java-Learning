// we can not create objeact of abbstract class
// we can define abstract method only in abstract class
// we can not impliment abstarct mehod in base class 
// it is compulsary to use abstract method in derived class

abstract class Animal{
    String colour;

    Animal(){  // Constructor
        colour = "brown"; 
    }

    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("walks on 4 legs");
    }
    void changeColour(){
        colour = "dark brown";
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("walks on two legs");
    }
    void changeColour(){
        colour = "white";
    }    
}
public class a09_Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        System.out.println(c.colour);
        c.changeColour();
        System.out.println(c.colour);
    }
}
