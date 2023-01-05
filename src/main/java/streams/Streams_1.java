package streams;

import util.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Streams_1 {

    // Java 8 examples to demonstrate the use of Streams filter(), collect(), findAny() and orElse()

    public static void main(String[] args) {

        List<String> techList = Arrays.asList("java", "C", "C++", "react");

//        Predicate<String> stringPredicate = tech -> tech.startsWith("C");
//
//        List<String> filterResult = filterOutTech(techList, stringPredicate);
//        System.out.println(filterResult);

//        Predicate<String> predicate = tech -> tech.equalsIgnoreCase("Angular") || tech.equalsIgnoreCase("java");
//        String s = findGivenTech(techList, predicate);
//        System.out.println("Given tech found in stack is " + s);

        List<Person> personList = Arrays.asList(
                new Person("Tom", 32),
                new Person("Tim", 30),
                new Person("Tum", 90)
        );

        Function<Person, String> personStringFunction = person -> person.getName();

        List<String> peopleNames = mapNameList(personList, personStringFunction);
        System.out.println(peopleNames);

    }

    //Streams filter() and map()
    private static <T, R> List<R> mapNameList(List<T> personList, Function<T, R> personStringFunction) {
        return personList.stream()
                .map(personStringFunction)
                .collect(Collectors.toList());
    }

    //Streams filter() and collect()
    private static <T> List<T> filterOutTech(List<T> techList, Predicate<T> stringPredicate) {
        return techList.stream()
                .filter(stringPredicate)
                .collect(Collectors.toList());
    }

    // Streams filter(), findAny() and orElse()
    private static <T> T findGivenTech(List<T> techList, Predicate<T> predicate) {

        return techList.stream()
                .filter(predicate)
                .findAny()
                .orElse(null);
    }
}
