static class AS{
    
}

class Animal{
    int weight;
    
    void eat(){
        System.out.println("eats");
    }

    void sleep(){
        System.out.println("Sleep");
    }
}

class Fish extends Animal{
    int finds;

    void swim(){
        System.out.println("Swim");
    }
}

public class a04_Inheretance {
    public static void main(String[] args) {
        Fish shark = new Fish();

        shark.eat();
        shark.swim();

        Animal a = new Animal();
        // a.swim(); // not allowed
    }
}
