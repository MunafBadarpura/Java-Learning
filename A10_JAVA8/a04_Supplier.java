package JAVA8;

// supplier doesn't take any input arguments but produces a result

import java.util.function.Supplier;

public class a04_Supplier {
    public static void main(String[] args) {
        Supplier supplier = () -> (int) (Math.random() * 100);

        for(int i=0;i<5;i++){
            System.out.println(supplier.get());
        }


    }
}
