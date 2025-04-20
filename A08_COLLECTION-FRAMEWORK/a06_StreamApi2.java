import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// filter() = return stream
// sorted() = return stream
// map() = return stream
// reduce() = return optional => performs a reduction operation on the elements of the stream
// skip() = return stream => numbers.skip(2) => skip first 2 numbers
// count() = return long => returns number of elements
// collect() = return collection which you store  => collects the elements of the stream into a collection
// forEach() = return void
// findFirst() = return optional class

public class a06_StreamApi2 {
    public static void main(String[] args) {

        Comparator<String> comparator = (o1,o2) -> (o1.length() > o2.length()) ? 1 : -1;

        List<Integer> list = Arrays.asList(4,2,1,5);

//        list.stream()
//                .filter(n -> n%2==0)
//                .map(n -> n*2)
//                .sorted()
//                .forEach(n -> System.out.println(n));


        List<String> list1 = Arrays.asList("munaf", "hasaan", "mustaq", "mushahid");

        List<String> filterdList = list1.stream()
                .filter(n -> n.startsWith("m"))
                .map(n -> n.toUpperCase())
                .sorted((o1,o2) -> (o1.length() > o2.length()) ? 1 : -1)
                .skip(1)
                .collect(Collectors.toList());


        System.out.println(filterdList);




    }
}
