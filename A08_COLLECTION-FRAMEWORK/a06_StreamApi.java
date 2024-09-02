// Stream
// you can perform operations on stream and it will not effact original values
// you can use stream only one time

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class a06_StreamApi {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(4,2,5,8,4,5,5,8);

        Stream<Integer> s1 =  arr.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2==0);

        // s1.forEach(n -> System.out.print(n + " "));
        // s1.forEach(n -> System.out.print(n + " ")); it gives run time error - use only ones

        s2.forEach(n -> System.out.print(n + " "));


    }
}
