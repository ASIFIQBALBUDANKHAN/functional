package streams;

import util.Gender;
import util.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupBy {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 20, Gender.FEMALE),
                new Person("Bob", 30, Gender.MALE),
                new Person("Charlie", 40, Gender.MALE),
                new Person("Diana", 50, Gender.FEMALE)
        );

        people.stream()
                .collect(Collectors.groupingBy(Person::getGender))
                .forEach((x,y) -> System.out.println(x + "" + y));
    }
}
