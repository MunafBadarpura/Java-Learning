package JAVA8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class a01_Comparator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(40);
        list.add(34);
        list.add(20);

        //Collections.sort(list); // in ascending order
        Collections.sort(list, (a,b) -> b-a); // in descending order
        System.out.println(list);


    }
}
