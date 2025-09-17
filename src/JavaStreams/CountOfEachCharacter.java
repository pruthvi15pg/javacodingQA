package JavaStreams;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfEachCharacter {
    public static void main(String[] args) {
        //count of each character in string

        String str="prut thvii";


        Map<String, Long> collect = Arrays.stream(str.split(""))
                .filter(s ->!s.isBlank())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        collect.forEach((Character,v)-> {
                    System.out.println(Character+" Character----" + v+" times");

                });
        //or

        Map<Character, Long> collect1 = str.chars()
                .mapToObj(c -> (char) c)                   // convert int to char
                .filter(c -> c != ' ')
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect1.forEach((Char,v)-> {
            System.out.println(Char+" Char----" + v+" times");

        });

    }
}
