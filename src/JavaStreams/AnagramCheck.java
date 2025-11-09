package JavaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramCheck {
    public static void main(String[] args) {
        String[] s = {"pat", "tap", "pan", "nap", "team", "meat"};
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
        //System.out.println(isAnagram1(str1, str2));
        System.out.println(isAnagram(str1, str2));
    }

    public static boolean isAnagram1(String str1, String str2) {
        return str1.chars()
                .sorted()
                .mapToObj(ch -> (char) ch).toList()
                .equals(str2.chars().mapToObj(ch -> (char) ch).toList());

    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String sorted1 = str1.chars()
                .sorted()
                .mapToObj(ch -> (char) ch)
                .map(String::valueOf)
                .collect(Collectors.joining());
        String sorted2 = str2.chars()
                .sorted()
                .mapToObj(ch -> (char) ch)
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(sorted1);
        System.out.println(sorted2);
        return sorted1.equals(sorted2);
    }


}
