package streams;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIterate_1 {

    public static void main(String[] args) {
        //iterate 10 numbers
//        Stream.iterate("a", a -> a.toUpperCase())
//                        .limit(4)
//                                .forEach(System.out::println);
        Stream.iterate(0, n -> n + 1 )
                .filter(n -> n % 2 != 0)
                .limit(10)
                .collect(Collectors.toList())
                .forEach(System.out::println);


        //fibonanci
        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(5)
                .map(n -> n[0])
                .forEach(System.out :: println);

        //IntStream
        IntStream.iterate(0, n -> n+1 )
                .limit(10)
                .forEach(System.out::println);
    }

}
