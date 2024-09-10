interface chessPlayer{
    int age = 50;        // by default all variables in interface are final & static
    void moves();   // by default all methods in interface are public abstract
}

class Queen implements chessPlayer {
    public void moves(){
        System.out.println("up, down, left, right, diognal");
    }
}
class Rook implements chessPlayer {
    public void moves(){
        System.out.println("up, down, left, right");
    }
}
class King implements chessPlayer {
    public void moves(){
        System.out.println("up, down, left, right, diognal(by 1 step)");
    }
}

// Multiple Inheretance 
interface Animal{
    void eat();
}

interface Human{
    void breath();
}

class Dog implements Animal, Human{
    public void eat(){
        System.out.println("dog eats");
    }
    public void breath(){
        System.out.println("dog breath");
    }
}


public class a10_Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        System.out.println(Queen.age);
    }
}
