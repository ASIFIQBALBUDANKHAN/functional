package functions.core;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println("Normal Java Way ");
        System.out.println(isPhoneNumberValid("9900000012"));
        System.out.println(isPhoneNumberValid("8900000000"));
        System.out.println(isPhoneNumberValid("9900012"));

        System.out.println("Predicate Functional interface Way ");
        System.out.println(phoneNumberValidPredicate.test("9900000012"));
        System.out.println(phoneNumberValidPredicate.test("8900000000"));
        System.out.println(phoneNumberValidPredicate.test("9900012"));

        //AND OR methods are also available for Predicate.
    }

    static Predicate<String> phoneNumberValidPredicate =
           phoneNumber -> phoneNumber.startsWith("99") && phoneNumber.length() == 10;

    static boolean isPhoneNumberValid(String phoneNumber) {
       return phoneNumber.startsWith("99") && phoneNumber.length() == 10;
    }
}
