package JavaStreams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countOfEachWord {
    public static void main(String[] args) {
        List<String> List = Arrays.asList("apple", "banana", "strawberry","grapefruit", "orange", "banana");
       // Arrays.asList("apple5", "banana6", "strawberry10","grapefruit10", "orange6", "banana6");

        Map<String, Long> collect =
                List.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.entrySet().forEach(System.out::println);


        collect.forEach((str,count)->{
        System.out.println(str+" occured---"+count+"times");

            });
        System.out.println("sssssssssssssssssssssssssssssss");

        //longest length

        Optional<String> max = List.stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println(max.get());

    }
}
