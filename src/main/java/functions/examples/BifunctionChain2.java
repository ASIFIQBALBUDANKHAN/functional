package functions.examples;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BifunctionChain2 {

    //Generic
    //This example converts the above program into a method that accepts BiFunction and Function as arguments and chains it together.
    public static void main(String[] args) {

          String result =  applyArguments(2, 4,
                (a, b) -> Math.pow(a,b),
         (r) -> String.valueOf(r));

        System.out.println("result : " + result);
    }

    private static <A,B,C,R> R applyArguments(A a,  B b, BiFunction<A, B, C> o,
                                         Function<C, R> o1) {

        return o.andThen(o1).apply(a, b);
    }
}
