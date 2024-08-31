import java.util.Arrays;
import java.util.List;

public class a05_ForEach {
    public static void main(String[] args) {
        
        List<Integer> arr = Arrays.asList(4,2,5,8,4,5,5,8);

        arr.forEach(n -> System.out.print(n + " "));

    }
}
