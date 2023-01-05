package util;

import java.util.Scanner;

public class Fibonanci {

    //Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    static int firstNum = 0, secondNum = 1, nextNum = 0;

    static void printFib(int n) {
        if (n > 0) {
            nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;

            System.out.println("," + nextNum);
            printFib(n - 1);
        }
    }

    public static void main(String args[]) {
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if (n < 0) throw new IllegalArgumentException("Number cant be negative");
        System.out.println(firstNum + "," + secondNum);
        printFib(n - 2);
    }

}
