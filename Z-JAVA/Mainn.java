abstract class A {

    private int i = 10;

    abstract void m1();
    void m2() {
        System.out.println("A.m2()");
    }
} 

interface AA {

    int i = 10;

    void m1();
    default void m2() {
        System.out.println("A.m2()");
    }
    
}

class B extends A {

    @Override
    void m1() {
       System.out.println("B.m1()");
    }
      
}

class Bb extends A {
    @Override
    void m1() {
        System.out.println("B.m1()");
    }
}


abstract class Calculate  
{  
    abstract int multiply(int a, int b);  
}  


class Calculate2 extends Calculate  
{  
    @Override  
    int multiply(int a, int b) {  
        return a*b;  
    }  

}
  


class Mainn{
    public static void main(String[] args) {
        
        int result = new Calculate()  
        {      
            @Override  
            int multiply(int a, int b) {  
                return a*b;  
            }  
        }
        .multiply(12,32);  
        
        int result2 = new Calculate2().multiply(12,32);

        int result3 = new Calculate2(){
            @Override  
            int multiply(int a, int b) {  
                return a*b;  
            }  
        }.multiply(result, result2);
        
        
        System.out.println("result = "+result);  
        System.out.println("result2 = "+result2);  
      
    }
}