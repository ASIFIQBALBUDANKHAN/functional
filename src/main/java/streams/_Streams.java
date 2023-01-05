package streams;

import java.util.Arrays;
import java.util.List;

import static streams._Streams.Gender.FEMALE;
import static streams._Streams.Gender.MALE;

public class _Streams {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Adam", MALE),
                new Person("Nancy", FEMALE),
                new Person("Abu", MALE),
                new Person("Mike", MALE),
                new Person("Alina", FEMALE)
        );


        //Collect genders and print
//        List<Gender> genders = people.stream()
//                .map(person -> person.gender)
//                .collect(Collectors.toList());
//        System.out.println(genders);

        //can be written little more beautiful
//        people.stream()
//                .map(person -> person.gender)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);
//
//
//        people.stream()
//                .map(person -> person.name)
//                .mapToInt(String::length)
//                .forEach(System.out::println);

        boolean anyMatch = people.stream().anyMatch(person -> MALE.equals(person.gender));
        System.out.println("anyMatch " + anyMatch);
//
        boolean allMatch = people.stream().allMatch(person -> MALE.equals(person.gender));
        System.out.println("allMatch " + allMatch);
//
        boolean noneMatch = people.stream().noneMatch(person -> MALE.equals(person.gender));
        System.out.println("noneMatch "+ noneMatch);

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
