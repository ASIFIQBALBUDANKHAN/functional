package functions.examples;

import java.util.Scanner;
import java.util.function.Function;

public class Sample {
    /* In Java 8, Function is a functional interface; it takes an argument (object of type T)
    and returns an object (object of type R). The argument and output can be a different type.

Function.java

@FunctionalInterface
public interface Function<T, R> {
      R apply(T t);
}*/
    public static void main(String[] args) {

        System.out.println("Enter the string ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        Function<String, Integer> stringLength = (name) -> name.length();

        //Method reference
        //Function<String, Integer> stringLength = String::length;

        Integer length = stringLength.apply(inputString);

        System.out.println("String length is " + length);

    }
}
