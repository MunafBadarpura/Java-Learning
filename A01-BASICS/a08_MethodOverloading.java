public class a08_MethodOverloading {
    
    static int sumOfTwo(int a,int b){ 
        return a+b;
    }

    static double sumOfTwo(double a,double b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sumOfTwo(20, 20));

        System.out.println(sumOfTwo(20.20, 20.20));


        // function scope
        {
            int a = 20;
            System.out.println(a);
        }
    }
}
