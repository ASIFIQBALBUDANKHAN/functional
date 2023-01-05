package functions.core;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Functions {

    public static void main(String[] args) {

        //Function takes 1 argument and returns a result
//        int increamentByOne = increamentByOne(1);
//        System.out.println(increamentByOne);

        System.out.println("Now by Functions method ");
        Integer increment = incrementByOneFunction.apply(1);
        System.out.println(increment);

        Integer multiply = multiplyBy10ByFunction.apply(increment);
        System.out.println(multiply);

        //andThen - method
        Function<Integer, Integer> incrementBy1andMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10ByFunction);
        System.out.println(incrementBy1andMultiplyBy10.apply(4));

        //BiFunction accepts 2 args and produces 1 result
        int result = incrementByOneAndMultiply(5, 100);
        System.out.println("result by normal method " + result);

        Integer result2 = incrementByOneAndMultiplyBiFunction.apply(5, 100);
        System.out.println("result by Bifunctions method " + result2);

         String ne = test.apply("Adam");
        System.out.println("ne " + ne);

    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    //    static int increamentByOne(int number) {
//        return number + 1;
//    }

    static Function<String, String> test = name -> String.join(name, "1");

    static Function<Integer, Integer> multiplyBy10ByFunction = number -> number * 10;
    //    static int multplyBy10(int number) {
//        return number * 10;
//    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrement, multiplyBy) -> (numberToIncrement + 1) * multiplyBy;

    static int incrementByOneAndMultiply(int numberToIncrement, int multiplyBy) {
        return  (numberToIncrement + 1) * multiplyBy;
    }
}
