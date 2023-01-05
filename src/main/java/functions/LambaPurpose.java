package functions;

import java.util.Comparator;

public class LambaPurpose {

    // Lambda is replacement for anonymous inner class
    public static void main(String[] args) {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        int compare = comparator.compare("ab", "ab");
        System.out.println(compare);

        //in java 8
        Comparator<String> lambaComparator = (a, b) -> a.compareTo(b);
        System.out.println(lambaComparator.compare("ab", "bc"));
    }

}
