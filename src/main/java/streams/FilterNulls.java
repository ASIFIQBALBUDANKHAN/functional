package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterNulls {

    //FilterNull
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("java", "c", null, "python", null);
        List<String> list = stream.filter(x -> x != null).collect(Collectors.toList());

        //List<String> list1 = stream.filter(Objects::nonNull).collect(Collectors.toList());

        System.out.println(list);
    }
}
