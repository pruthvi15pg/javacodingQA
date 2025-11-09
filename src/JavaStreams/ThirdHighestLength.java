package JavaStreams;

import java.util.*;
import java.util.stream.Collectors;

public class ThirdHighestLength {
    public static void main(String[] args) {
        //find word with 3rd highest length

        List<String> words = Arrays.asList("apple", "banana", "kiwi", "cherry");




        words.stream().sorted((w1,w2)->Integer.compare(w1.length(),w2.length()))
                        .skip(2)
                                .findFirst()
                                        .ifPresent(System.out::println);


        System.out.println("----------------------------------------");
        words.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .skip(2)
                .findFirst()
                .ifPresent(System.out::println);


        System.out.println("----------------------------------------");
        // Group words by their length
        Map<Integer, List<String>> lengthToWordsMap = words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("lengthToWordsMap:"+lengthToWordsMap);
        lengthToWordsMap.forEach((count,str)-> System.out.println(count+"---->"+str));



        System.out.println("---------------hhhh-------------------------");



        lengthToWordsMap.entrySet().stream()
                .sorted(Map.Entry.<Integer, List<String>>comparingByKey(Comparator.reverseOrder())) // sort desc by key
                .skip(2)   // skip first 2 (highest and 2nd highest)
                .limit(1)  // take only 1 (the 3rd highest)
                .forEach(entry -> System.out.println(entry.getKey() + " ----> " + entry.getValue()));



        System.out.println("---------------uuuuu-------------------------");



        // Get sorted lengths in descending order
        lengthToWordsMap.keySet().stream()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst()
                .ifPresent(System.out::println);


    }

    }


