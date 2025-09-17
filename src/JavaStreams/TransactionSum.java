package JavaStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Trans {
    private String date;
    private double amount;

    public Trans(String date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Trans [date=" + date + ", amount=" + amount + "]";
    }
}
public class TransactionSum{
    public static void main(String[] args) {
        List<Trans> list = new ArrayList<>();

        list.add(new Trans("2025-04-20", 100.50));
        list.add(new Trans("2025-04-20", 200.0));
        list.add(new Trans("2025-04-21", 300.0));
        list.add(new Trans("2025-04-21", 400.0));
        list.add(new Trans("2025-04-22", 500.0));
        list.add(new Trans("2025-04-22", 600.0));

        Map<String, Double> collect = list.stream()
                .collect(Collectors.groupingBy(trans -> trans.getDate(),
                        Collectors.summingDouble(trans -> trans.getAmount())));
    collect.forEach((date,amount)-> System.out.println("date is:"+date+"amount is:"+amount));
    }
}
