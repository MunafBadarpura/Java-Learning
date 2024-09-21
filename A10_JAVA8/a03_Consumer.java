package JAVA8;

//  Consumer is a functional interface that
//  represents an operation that takes a single input argument and returns no result.
// it is used to perform actions on objects without producing a return value.

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class a03_Consumer {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(85);
        arr.add(76);
        arr.add(98);

        // it takes one arg and return nothing
        Consumer<Integer> checkNumGreater70 = (num) -> {
            if(num > 70){
                System.out.println(num);
            }
        };

        arr.forEach(checkNumGreater70);
    }
}
