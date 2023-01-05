package functions.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateCheck {

    //In Java 8, Predicate is a functional interface, which accepts an argument and returns a boolean.
    // Usually, it used to apply in a filter for a collection of objects.
    /* @FunctionalInterface
        public interface Predicate<T> {
            boolean test(T t);
        }*/

    //filter() accepts predicate as argument.
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> predicate = x -> x > 3;

        List<Integer> collect = integerList.stream()
                .filter(predicate)
                .collect(Collectors.toList()
                );
        System.out.println(collect);

        //and operation
        andFilter(integerList);

        //or operation
        orFilter();

        //negateFilter
        negateFilter();

        //chaining
        chaining();


    }

    static void andFilter(List<Integer> integerList) {

        Predicate<Integer> predicate1 = x -> x > 3;
        Predicate<Integer> predicate2 = x -> x < 6;

        List<Integer> result1 = integerList.stream()
                .filter(x -> x > 3 && x < 6)
                .collect(Collectors.toList());
        System.out.println("Without .and method  " +result1);

        List<Integer> result2 = integerList.stream()
                .filter(predicate1.and(predicate2))
                .collect(Collectors.toList());
        System.out.println("Using .and() method " + result2);

    }

    static void orFilter() {

        List<String> dummyStrings = Arrays.asList("Ab", "EFg", "dK", "a", "z", "adfkdk");

        Predicate<String> predicate1 = s -> s.length() > 2;

        Predicate<String> predicate2 = s -> s.startsWith("d");

        List<String> list = dummyStrings.stream()
                .filter(predicate1.or(predicate2))
                .collect(Collectors.toList());

        System.out.println(list);
    }

    static void negateFilter() {
        List<String> dummyStrings = Arrays.asList("Ab", "EFg", "dK", "a", "z", "adfkdk");

        Predicate<String> predicate = x -> x.startsWith("A");

        List<String> collect = dummyStrings.stream()
                .filter(predicate.negate())
                .collect(Collectors.toList());

        System.out.println(collect);

    }

    private static void chaining() {
        Predicate<String> startWithA = x -> x.startsWith("a");

        // start with "a" or "m"
        boolean result = startWithA.or(x -> x.startsWith("b")).test("bbb");
        System.out.println(result);     // true

        // !(start with "a" and length is 3)
        boolean result2 = startWithA.and(x -> x.length() == 3).negate().test("abc");
        System.out.println(result2);    // false
    }

}
