package functions.examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class ConvertListToMap {

    //This example accepts Function as an argument, convert a List into a Map.
    public static void main(String[] args) {

        List<String> list = Arrays.asList("ab", "abcbc", "java", "cococo");

        Function<String, Integer> stringLengthCalFunction = x -> x.length();
        Map<String, Integer> stringIntegerMap = convertListToMap(list, stringLengthCalFunction);

        System.out.println(stringIntegerMap);
    }

    private static <T, R> Map<T,R> convertListToMap(List<T> list, Function<T,R> function) {

        Map<T,R> map = new HashMap<>();
        list.forEach(input -> map.put(input, function.apply(input)));

        return map;
    }

}
