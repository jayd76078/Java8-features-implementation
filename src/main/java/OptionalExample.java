import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");

        // Using Optional to handle null values gracefully
        optional.ifPresent(System.out::println);

        System.out.println(optional.orElse("Default Value"));
    }
}
