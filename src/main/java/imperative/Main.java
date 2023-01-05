package imperative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static imperative.Main.Gender.FEMALE;
import static imperative.Main.Gender.MALE;

public class Main {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Adam", MALE),
                new Person("Nancy", FEMALE),
                new Person("Abu", MALE),
                new Person("Mike", MALE),
                new Person("Alina", FEMALE)
        );

        System.out.println("//Imperative approach");
        List<Person> female = new ArrayList<>();
        for (Person person : people) {
            if (FEMALE.equals(person.gender)) {
                female.add(person);
            }
        }

        for (Person person : female) {
            System.out.println(person);
        }

        System.out.println("//Declarative approach");
        List<Person> females2 = people.stream()
                .filter(person -> FEMALE.equals(person.gender)) // filter takes Predicate  // this logic can be written like line no 43.
                .collect(Collectors.toList());

        females2.forEach(System.out::println);

        System.out.println("Predicate function");
        Predicate<Person> personPredicate = person -> MALE.equals(person.gender);
        List<Person> males = people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());
        males.forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender {
        MALE, FEMALE
    }
}
