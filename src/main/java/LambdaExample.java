import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aditya", "Satish", "Prashant");

        // Using lambda expression to iterate over the list
        names.forEach(name -> System.out.println(name));
    }
}

