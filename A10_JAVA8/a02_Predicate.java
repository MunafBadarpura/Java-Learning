package JAVA8;

// predicate return boolean
// we can use predicates in stream filter mehthod;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class a02_Predicate {
    public static void main(String[] args) {

        List<String> arr = new ArrayList<>();
        arr.add("Munaf");
        arr.add("Hasan");
        arr.add("Afnan");
        arr.add("Hasnain");

        Predicate<String> checkNameStartWithS = (s) -> s.startsWith("H"); // return boolean

        System.out.println(checkNameStartWithS.test("Munaf"));

        arr.stream()
                .filter(checkNameStartWithS) // filter takes predicate
                // filter((s) -> s.startsWith("H"))  // we can also do like this directly
                .forEach(name -> System.out.println(name));
    }
}
