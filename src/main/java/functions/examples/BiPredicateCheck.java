package functions.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class BiPredicateCheck {

    public static void main(String[] args) {

        BiPredicate<String, Integer> biPredicate = (name, charLength) -> name.length() == charLength;

        List<String> list = Arrays.asList("Adamasda","adv", "abcd");

        List<String> stringList = list.stream()
                .filter(l -> biPredicate.test(l, 4))
                .collect(Collectors.toList());

        System.out.println(stringList);

    }
}
