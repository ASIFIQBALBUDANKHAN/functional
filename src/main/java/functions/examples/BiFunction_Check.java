package functions.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunction_Check {

    //This example takes two Integers and returns an Integer, Double or List
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> functionSum = (x1, x2) -> x1 + x2;
        Integer sum = functionSum.apply(10, 40);

        System.out.println("sum :"+ sum);


        BiFunction<Integer, Integer, Double> functionPow = (x1, x2) -> Math.pow(x1, x2);
        Double pow = functionPow.apply(4, 3);

        System.out.println("4 to the power of 3 is : " + pow);


        BiFunction<String, String, List<String>> functionNameList = (x1 , x2) -> Arrays.asList(x1, x2);
        List<String> cityList = functionNameList.apply("Banglore", "Delhi");

        System.out.println(cityList);

    }
}
