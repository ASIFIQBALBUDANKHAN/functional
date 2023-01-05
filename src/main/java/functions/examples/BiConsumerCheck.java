package functions.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerCheck {

    public static void main(String[] args) {

        BiConsumer<Integer, Integer> biConsumer = (x1, x2) -> System.out.println(x1 + x2);

     //   biConsumer.accept(25, 30);

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7);
        integers.forEach(x -> biConsumer.accept(x, 10));
    }
}
