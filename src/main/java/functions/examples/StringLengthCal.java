package functions.examples;




public class StringLengthCal {

    public static void main(String[] args) {
       StringLengthCalculator lengthCalculatorFunction = (input) -> input.length();

        Integer length = lengthCalculatorFunction.calculateLength("adasfasf");
        System.out.println("String length is " + length);
    }
}

