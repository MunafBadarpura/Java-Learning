import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class a07_Timing {
    public static void main(String[] args) {
        int size = 10_000;
        List <Integer> arr = new ArrayList<>(size);

        Random ran = new Random();
        for(int i=0;i<size;i++){
            arr.add(ran.nextInt(100));
        }

        long startStream = System.currentTimeMillis();
        int sum = arr.stream()
                .map(i -> i*2)
                .mapToInt(i -> i)
                .sum();
        long endStream = System.currentTimeMillis();

        long startparallelStream = System.currentTimeMillis();
        int sum2 = arr.parallelStream()
                .map(i -> i*2)
                .mapToInt(i -> i)
                .sum();
        long endparallelStream = System.currentTimeMillis();

        System.out.println(sum + " " + sum2);
        System.out.println("Stream Time " + (endStream - startStream) );
        System.out.println("ParallelStream Time " + (endparallelStream - startparallelStream) );
    }
}
