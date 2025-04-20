import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class a06_OptionalClass {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Munaf", "Hasan", "Afnan", "Sahad");

        Optional<String> name = names.stream()
                .filter(n-> n.contains("x"))
                .findFirst();

        System.out.println(name.orElse("Not Found name that contain letter x"));

        // or we can do like this
        String name1 = names.stream()
                .filter(n -> n.contains("x"))
                .findFirst()
                .orElse("Not Found name that contain letter x");

        System.out.println(name1);
    }
}
