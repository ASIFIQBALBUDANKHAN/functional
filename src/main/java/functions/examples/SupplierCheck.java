package functions.examples;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierCheck {

    public static void main(String[] args) {

        //In Java 8, Supplier is a functional interface; it takes no arguments and returns a result.
        //@FunctionalInterface
        //public interface Supplier<T> {
        //    T get();
        //}
        Supplier<LocalDateTime> local = () -> LocalDateTime.now();

        LocalDateTime localDateTime = local.get();
        System.out.println(localDateTime);
    }
}
