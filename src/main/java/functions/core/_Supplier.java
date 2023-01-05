package functions.core;

import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {

        //Normal Java way
        System.out.println(greet());

        //Supplier Functional interface
        System.out.println(stringSupplier.get());

    }
    static  Supplier<String> stringSupplier = () -> "Hello Good Morning .!";

    static String greet() {
        return "Hello Good Morning .!";
    }
}
