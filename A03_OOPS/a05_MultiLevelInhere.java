// Multi-Level Inheretance
// here, dog have Aimal all properties as well as Cat all properties.


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

class Dog extends Cat{  // Multi-Level Inhere
    String bread;
}


public class a05_MultiLevelInhere {
    public static void main(String[] args) {
        
    }   
}
