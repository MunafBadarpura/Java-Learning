// SET
// it is collection of unique values
// you cant have index value in  set

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class a03_HashSet {
    public static void main(String[] args) {
        Set<Integer> arr = new HashSet<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);

        // System.out.println(arr.get(0)); // set have not get method

        System.out.println("HashSet : ");
        for(int n : arr){
            System.out.print(n + " ");
        }


        // For sorted order use Treeset
        Set<Integer> brr = new TreeSet<Integer>();
        brr.add(10);
        brr.add(40);
        brr.add(30);
        brr.add(20);
        
        System.out.println("\nTreeSet : ");
        for(int n : brr){
            System.out.print(n + " ");
        }
    }
}
