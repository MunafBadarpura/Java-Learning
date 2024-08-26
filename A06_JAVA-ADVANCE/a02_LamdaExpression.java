// lambda expression work with only FunctionalInterface

@FunctionalInterface  // it means interface have only one method
interface A{
    void show(int i);
    // void show2();  it is not allowed
}

@FunctionalInterface  // it means interface have only one method
interface B{
    int add(int i, int j);
}

public class a02_LamdaExpression {
    public static void main(String[] args) {

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
        // A obj = new A(){
        //     public void show(){
        //         System.out.println("In A Show");
        //     }
        // };


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
