// Stream
// you can perform operations on stream and it will not effact original values
// you can use stream only one time
// strem have functions like : filter, map, reduce
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class a06_StreamApi {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(4,2,5,8,4,5,5,8);

        Stream<Integer> s1 =  arr.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2==0); // s1 used here so we created s2
        s2.forEach(n -> System.out.print(n + " "));
        
        System.out.println();
        
        Stream<Integer> s3 = arr.stream();
        Stream<Integer> s4 = s3.map(n -> n*2);
        s4.forEach(n -> System.out.print(n + " "));


        // s1.forEach(n -> System.out.print(n + " "));
        // s1.forEach(n -> System.out.print(n + " ")); it gives run time error - use only ones


        // multiple
        int result = arr.stream()
                    .filter(n -> n%2==0)
                    .map(n -> n*2)
                    .reduce(0, (c,e) -> c+e);
        System.out.println("\n" + result);

    }
}
