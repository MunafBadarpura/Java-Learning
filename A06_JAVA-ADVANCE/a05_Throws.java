class A{
    void show() throws ClassNotFoundException{
        Class.forName("helli");
    }
}

public class a05_Throws {
    public static void main(String[] args) {
        A a = new A();
        try{
            a.show();
        }
        catch(Exception e){
            System.out.println("Class Not Found" + e);
        }
    }
}
