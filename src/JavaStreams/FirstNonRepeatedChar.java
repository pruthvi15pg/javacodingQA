package JavaStreams;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String str="swiss";

        str.chars()
                .mapToObj(ch->(char)ch)
                .collect(Collectors.groupingBy(ch->ch,LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream().filter(e -> e.getValue()==1)
                .map(entry->entry.getKey())
                .findFirst()
                .ifPresent(System.out::println);

           }

}
