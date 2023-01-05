package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {
    //sort
    public static void main(String[] args) {

//        List<Integer> integers = Arrays.asList(2, 0, 6, 9);
//        List<Integer> sortedInts = integers.stream()
//                .sorted()
//                .collect(Collectors.toList());
//        System.out.println(sortedInts);
//
//        //reverse order
//        List<Integer> reverseSort = integers.stream()
//                .sorted(Comparator.reverseOrder())
//                .collect(Collectors.toList());
//        reverseSort.forEach(System.out::println);

        //sort by age natural order
        List<User> users = Arrays.asList(
                new User("As", 12),
                new User("Be", 78),
                new User("AAp", 40),
                new User("zp",4)
        );

        //Comparator
//        Comparator<User> userComparator = (o1, o2) -> o1.getAge() - o2.getAge(); //Comparator.comparing(User::getAge)
//        users.sort(userComparator);
//        users.forEach(System.out::println);

//        List<User> usersSortByAge = users.stream()
//                .sorted(Comparator.comparing(User::getAge))
//                .collect(Collectors.toList());
//        usersSortByAge.forEach(System.out::println);

//        List<User> usersSortByAgeReverseOrder = users.stream()
//                .sorted(Comparator.comparingInt(User::getAge)
//                        .reversed())
//                .collect(Collectors.toList());
//        usersSortByAgeReverseOrder.forEach(System.out::println);

        //sort by name
        List<User> sortByName = users.stream()
                .sorted(Comparator.comparing(User::getName))
                .collect(Collectors.toList());
        sortByName.forEach(System.out::println);
    }

    static class User {
        String name;
        int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
