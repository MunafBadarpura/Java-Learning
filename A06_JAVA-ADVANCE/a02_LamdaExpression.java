// how to make function to lambda expression
// 1. remove modifire, return type and method name 
// 2. place arrow

// lambda expression work with only FunctionalInterface

@FunctionalInterface  // it means interface have only one method
interface A{
    void show(int i);
}

@FunctionalInterface  // it means interface have only one method
interface B{
    int add(int i, int j);
}

public class a02_LamdaExpression {
    public static void main(String[] args) {

        // A obj = new A(){
        //     public void show(){
        //         System.out.println("In A Show");
        //     }
        // };

        // lambda expression
        A obj = (int i) -> 
            {
                System.out.println("In A Show " + i);
            };

        // if only one expression
        A obj2 = (int i) ->  System.out.println("In A Show " + i);

        // if only one variable 
        A obj3 = i ->  System.out.println("In A Show " + i);

        obj3.show(5);


        // lambda expression with return 
        // B obj4 = new B(){
        //     public int add(int i, int j){
        //         return i+j;
        //     }
        // };

        B obj4 =(i, j) ->  i+j; // you not write return if it is single line
           

        int result = obj4.add(10, 10);
        System.out.println(result);


    }
}


/*
 * package Static_Keyword;

@FunctionalInterface
interface Car{
    void show(int i);
}

@FunctionalInterface
interface Car2{
    int add(int i, int j);
}

public class a05 {
    public static void main(String[] args) {
        Car c = new Car() { 
            public void show(int i) {
                System.out.println("Hello");
            }
        };


        Car c2 = (int i) -> {
            System.out.println("fd");
        };


        Car c3 = (int i) -> System.out.println("fd");

        Car c4 = i -> System.out.println("fd");


        // WITH RETURN TYPE

        Car2 c5 = new Car2() {
            public int add(int i, int j){
                return i+j;
            }
        };

        Car2 c6 =  (int i, int j) -> {
            return i+j;
        };

        Car2 c7 =  (i, j) ->  i+j;
    }
}

 */