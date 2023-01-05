package functions.examples;

import java.util.function.Function;

public class FunctionChain {
    //This example chains the Function with andThen().
    public static void main(String[] args) {

        Function<String, Integer> stringLength = String::length;

        Function<Integer, Integer> multiplyLength = (strLength) -> strLength * 100;

        Integer value = stringLength.andThen(multiplyLength).apply("Bangalore");

        System.out.println("String length is multiplied by 100 is " + value );
    }
}
