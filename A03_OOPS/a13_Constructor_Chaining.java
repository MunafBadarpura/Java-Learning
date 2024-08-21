class Example{
    Example(){
        this(5, 10);
        System.out.println("default constructor");
    }
    Example(int x, int y){
        System.out.println("x = "+x + " y = "+ y );
    }
}

public class a13_Constructor_Chaining {
    public static void main(String[] args) {
        Example obj = new Example(); // Will trigger constructor chaining
    }
}
