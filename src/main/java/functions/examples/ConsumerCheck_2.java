package functions.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerCheck_2 {

    public static void main(String[] args) {

        List<String> asList = Arrays.asList("ab", "c", "efsdf", "ghjkjk");

        Consumer<String> stringConsumer = x -> {
            System.out.println("String " + x + " length " +x.length());
        };

        //asList.forEach(stringConsumer);
        someGenericMethod(asList, stringConsumer);


        List<Integer> integers = Arrays.asList(1, 3, 5, 6, 6, 7, 7, 8);

        Consumer<Integer> integerConsumer = x -> System.out.println("Integer " +x);
        someGenericMethod(integers, integerConsumer);


    }

    static <T> void someGenericMethod(List<T> list, Consumer<T> consumer) {

        list.forEach(consumer);

        // or you can execute like this too
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
