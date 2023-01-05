package util;

public class Test {

    public static void main(String[] args) {
//        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 56, 7);
//        IntSummaryStatistics stats = integers.stream().mapToInt((x) -> x).summaryStatistics();
//        System.out.println("Lowest number in List : " + stats.getMax());

//        Map<String, Number> personMap = new HashMap<>();
//        personMap.put("Adam", 10);
//        personMap.put("Mike", 5);
//
//        personMap.forEach((k,v) -> System.out.println("key " + k + " value " + v) );
//
//       // Map<String, Number> temp = new HashMap<>(personMap);
//        Map<String, Number> temp = new HashMap<>();
//        personMap.forEach((k,v) -> temp.put(k, v));
//        temp.forEach((k,v) ->  System.out.println(" temp key " + k + " value " + v));


        String a="stack";
        System.out.println(a);//prints stack
        a.concat("12");
        System.out.println(a);//if mutable it would print overflow
    }
}
