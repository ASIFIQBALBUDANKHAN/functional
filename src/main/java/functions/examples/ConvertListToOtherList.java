package functions.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ConvertListToOtherList {

    //convert a List to another type of List
    public static void main(String[] args) {

        List<String> list = Arrays.asList("ab", "abcbc", "java", "cococo");
        Function<String, String> function = x -> x.concat("xxxxxxxxxxxxxxxx");

        List<String> modifiedList = addExtraString(list, function);
        System.out.println(modifiedList);
    }

    private static List<String> addExtraString(List<String> list, Function<String, String> function) {

        List<String> newList = new ArrayList<>();
        list.forEach(input -> newList.add(function.apply(input)));
        return newList;
    }
}
