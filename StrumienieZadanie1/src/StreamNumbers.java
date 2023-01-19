import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamNumbers {
    public static void main(String[] args) {
        IntStream numbers = IntStream.iterate(0, n -> n + 1);
        IntStream filteredNumbers = numbers.filter(n -> n > 100 &&  n < 1000 && n % 5 == 0);
        filteredNumbers.limit(10)
                .map(n -> n * 3)
                .forEach(System.out::println);

    }
}
