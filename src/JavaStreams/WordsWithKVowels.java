package JavaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordsWithKVowels {

    public static void main(String[] args) {
        //find the words with k vowels in a given string.
       String sentence="I  have an orange and apple on the table";
        Map<Long, List<String>> collect = Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(WordsWithKVowels::countVowels));

     collect.entrySet().forEach(System.out::println);

        collect.forEach((vowelCount, words) ->
                System.out.println(vowelCount + " vowels -> " + words));
    }
public static long countVowels(String word){
        return word.chars()
                .filter(ch->"aeiouAEIOU".indexOf(ch)!=-1)
                .count();
}

}
