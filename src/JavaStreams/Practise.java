package JavaStreams;

import java.time.Instant;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practise {
    public static void main(String[] args) {



        //find word with 3rd highest length

        List<String> words = Arrays.asList("apple", "banana", "kiwi", "cherry");

        Optional<String> first = words.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .skip(2)
                .findFirst();


        // Group words by their length
        Map<Integer, List<String>> collect = words.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(collect);

    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        return s1.chars()
                .mapToObj(ch -> (char) ch).toList()
                .equals(s2.chars().mapToObj(ch -> (char) ch).toList());
    }


}
