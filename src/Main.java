import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "ddd", "cdd");
        //list.stream().sorted().forEach(System.out::println);

        Stream<String> str = Arrays.stream(new String[] {"a","b","d","c"});

        //str.sorted().forEach(System.out::print);

        //str.map(s->s.concat("!!")).sorted().forEach(System.out::println);

        str.map(String::toUpperCase).forEach(System.out::println);
    }
}
