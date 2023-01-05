package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyFindFirst {

    //findAny findFirst
    public static void main(String[] args) {

        List<String> list = Arrays.asList("C", "Sc", "ant", "python", "angular");
        Optional<String> any = list.stream()
                .filter(x -> x.contains("a"))
                .findFirst();

        System.out.println(any.get());

        Optional<String> any1 = list.stream()
                .filter(x -> x.length() > 1)
                .findAny();
        System.out.println(any1.get());
    }
}
