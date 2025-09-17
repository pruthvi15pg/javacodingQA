package JavaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramCheck {
    public static void main(String[] args) {
        String[] s={"pat","tap","pan","nap","team","meat"};
        Map<String, List<String>> collect = Arrays.stream(s)
                .collect(Collectors.groupingBy(word ->
                {
                    char[] ch = word.toCharArray();
                    Arrays.sort(ch);
                    return new String(ch);
                }));
        collect.entrySet().forEach(System.out::println);


        String str1 = "abc";
        String str2 = "cba";



        System.out.println(isAnagram(str1, str2));
    }
    public static boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        return str1.chars()
                .sorted()
                .mapToObj(ch->(char)ch).toList()
                .equals(str2.chars().mapToObj(ch->(char)ch).toList());
    }



}
