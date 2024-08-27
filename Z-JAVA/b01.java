interface Computer{
    void code();
}

class Desktop implements Computer{
    public void code(){
        System.out.println("code, compile, run with DESKTOP");
    }
}

class Laptop implements Computer{
    public void code(){
        System.out.println("code, compile, run with LAPTOP");
    }
}

class Developer{
    public void code(Computer comp){
        comp.code();
    }
}

public class b01 {
    public static void main(String[] args) {
        Developer munaf = new Developer();
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        munaf.code(desk);
    }
}
