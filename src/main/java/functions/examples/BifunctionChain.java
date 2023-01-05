package functions.examples;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BifunctionChain {
    //This BiFunction takes two Integer and returns a Double, and uses andThen() to chain it with a Function to convert the Double into a String.
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Double> biFunction = (x1, x2) -> Math.pow(x1, x2);

        Function<Double, String> function = x -> String.valueOf(x);

        String result = biFunction.andThen(function).apply(2, 4);

        System.out.println(result);
    }
}
