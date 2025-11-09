package JavaStreams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class AggregateFunctions {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 9, 1, 7);
        IntSummaryStatistics intSummaryStatistics = list.stream().mapToInt(n -> n)
                .summaryStatistics();
        System.out.println("Sum of numbers: " + intSummaryStatistics.getSum());
        System.out.println("Average of numbers: " + intSummaryStatistics.getAverage());
        System.out.println("Min of numbers: " + intSummaryStatistics.getMin());
        System.out.println("Max of numbers: " + intSummaryStatistics.getMax());
        System.out.println("count of numbers:"+intSummaryStatistics.getCount());


        System.out.println(list.stream()
                .mapToInt(n->n)
                .sum());

        System.out.println(list.stream()
                .mapToInt(n->n)
                .average());

        System.out.println(list.stream()
                .mapToInt(n->n)
                .count());
    }
}
