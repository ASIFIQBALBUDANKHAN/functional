package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMaps {

    //In this example, flatMap() is used to flatten a List of Lists into a single List of integers.
    public static void main(String[] args) {
//        List<Integer> ls1 = Arrays.asList(1, 2, 3);
//        List<Integer> ls2 = Arrays.asList(4, 5, 6);
//        List<Integer> ls3 = Arrays.asList(7, 8, 9);
//
//        List<List<Integer>> lists = Arrays.asList(ls1, ls2, ls3);
//        List<Integer> flatList = getIntegers(lists);
//
//        System.out.println(flatList);

        String[][] strings = new String[][]{{"a","b"},{"c,d"}};

        List<String> filteredFlatMap = Stream.of(strings)
                .flatMap(x -> Arrays.stream(x))
                .filter(x -> !x.equalsIgnoreCase("a"))
                .collect(Collectors.toList());
        System.out.println(filteredFlatMap);
    }

    private static List<Integer> getIntegers(List<List<Integer>> lists) {
        List<Integer> flatList = lists.stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());
        return flatList;
    }
}
