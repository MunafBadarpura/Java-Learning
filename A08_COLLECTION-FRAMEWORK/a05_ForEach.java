import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class a05_ForEach {
    public static void main(String[] args) {
        
        List<Integer> arr = Arrays.asList(4,2,5,8,4,5,5,8);

        // Consumer<Integer> con = new Consumer<Integer>() {

        //     public void accept(Integer n){
        //         System.out.print(n + " ");
        //     }
        // };

        // with lambda expression
        Consumer<Integer> con = (Integer n) -> {
            System.out.print(n + " ");
        };


        arr.forEach(con);
        arr.forEach(n -> System.out.print(n + " "));
        

    }
}
