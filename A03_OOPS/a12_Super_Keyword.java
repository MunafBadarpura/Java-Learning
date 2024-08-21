class Animal{
    String colour;
    Animal(){
        System.out.println("Animal construcot called");
    }
}

class Horse extends Animal{
    
    Horse(){
        super();
        super.colour = "brown";
        System.out.println("Horrse constructor called");
    }
}

public class a12_Super_Keyword {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        System.out.println(h1.colour);
    }
}
