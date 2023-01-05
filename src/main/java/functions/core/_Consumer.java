package functions.core;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        //Normal java way
        Customer customer = new Customer("Raj", "123456");
        greetCustomer(customer);
        greetCustomerV2(customer, false);

        //Consumer Functional Interface
        customerConsumer.accept(customer);

        //BiConsumer Functional Interface
        customerBiConsumer.accept(customer, false);

    }

    static Consumer<Customer> customerConsumer = customer1 ->
            System.out.println("Hi "
                    + customer1.name + " thanks for registering phone number "
                    + customer1.phoneNumber);

    static void greetCustomer(Customer customer) {
        System.out.println("Hi "
                + customer.name
                + " thanks for registering phone number "
                + customer.phoneNumber);
    }

    static BiConsumer<Customer, Boolean> customerBiConsumer =
            (customer, isShowNumber) ->
                    System.out.println("Hi "
                            + customer.name + " thanks for registering phone number "
                            + (isShowNumber ? customer.phoneNumber : "*****"));

    static void greetCustomerV2(Customer customer, Boolean isShowNumber ) {
        System.out.println("Hi "
                + customer.name + " thanks for registering phone number "
                + (isShowNumber ? customer.phoneNumber : "*****"));
    }
    static class Customer {
        private final String name;
        private final String phoneNumber;

        public Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

    }

}
