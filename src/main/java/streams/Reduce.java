package streams;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Reduce {

    //reduce
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer result = integers.stream()
                .reduce(0, Integer::sum);
        System.out.println(result);

        List<Invoice> invoices = Arrays.asList(
                new Invoice("A1", BigDecimal.valueOf(2), BigDecimal.valueOf(100.4)),
                new Invoice("A2", BigDecimal.valueOf(4), BigDecimal.valueOf(56.25)),
                new Invoice("A3", BigDecimal.valueOf(12), BigDecimal.valueOf(89.02))
        );

        BigDecimal reduce = invoices.stream()
                .map(x -> x.getPrice().multiply(x.qty))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println(reduce);

    }

    static class Invoice {
        String invoiceId;
        BigDecimal qty;
        BigDecimal price;

        public Invoice(String invoiceId, BigDecimal qty, BigDecimal price) {
            this.invoiceId = invoiceId;
            this.qty = qty;
            this.price = price;
        }

        public String getInvoiceId() {
            return invoiceId;
        }

        public BigDecimal getQty() {
            return qty;
        }

        public BigDecimal getPrice() {
            return price;
        }
    }
}