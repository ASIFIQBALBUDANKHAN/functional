package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams_2 {

    public static void main(String[] args) {

        List<String> lowerCaseList = Arrays.asList("ab", "cd", "ef");

        Function<String, String> function = String :: toUpperCase;

        // or Function<String, String> function = (x) -> x.toUpperCase();

       List<String> upperCaseList = mapFunction(lowerCaseList, function);

        System.out.println(upperCaseList);


        List<Integer> integers = Arrays.asList(1, 20, 30, 40);
        Function<Integer, Integer> multiplyBy10 = x -> x * 10;

        List<Integer> integersResult = mapFunction(integers, multiplyBy10);
        System.out.println(integersResult);
    }

    private static <T,R> List<R> mapFunction(List<T> lowerCaseList, Function<T, R> function) {
        return lowerCaseList.stream()
                .map(function)
                .collect(Collectors.toList());
    }
}
