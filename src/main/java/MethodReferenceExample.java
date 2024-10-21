import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Max");

        // Using method reference to iterate over the list
        names.forEach(System.out::println);
    }
}
