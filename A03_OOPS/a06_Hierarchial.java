// Hierarchial Inheretance
// here, dog and cat have all animal properties

// Hybrid Inheretanec : 
// mixing of multi-level and hierarchial


class Animal{
    int weight;
    
    void eat(){
        System.out.println("eats");
    }

    void sleep(){
        System.out.println("Sleep");
    }
}

class Cat extends Animal{
    String skinColour;

    void walk(){
        System.out.println("Walk");
    }
}

class Dog extends Animal{  
    String bread;
}


public class a06_Hierarchial {
    public static void main(String[] args) {
        
    }
}
