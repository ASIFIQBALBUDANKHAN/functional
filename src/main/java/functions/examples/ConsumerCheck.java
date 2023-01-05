package functions.examples;

import java.util.function.Consumer;

public class ConsumerCheck {

    //In Java 8, Consumer is a functional interface; it takes an argument and returns nothing.
    //@FunctionalInterface
    //public interface Consumer<T> {
    //  void accept(T t);
    //}
    public static void main(String[] args) {
        Consumer<Integer> integerConsumer = i -> System.out.println(i);
        integerConsumer.accept(20);

    }
}
