package functions.examples;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class SupplierCheck_2 {

    private static final DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
//        Supplier<LocalDateTime> ld = () -> LocalDateTime.now();
//        LocalDateTime localDateTime = ld.get();
//
//        System.out.println(localDateTime);

        Supplier<String> ld2 = () -> df.format(LocalDateTime.now());
        System.out.println(ld2.get());

    }
}
