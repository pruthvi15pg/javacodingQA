package JavaStreams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streams {

    public static void main(String[] args) {


        String word = "apple";


        int firstIndex = 0;                  // always 0
        int lastIndex = word.length() - 1;   // depends on string length

        System.out.println("String: " + word);
        System.out.println("Length: " + word.length());

        System.out.println("First index: " + firstIndex);
        System.out.println("Last index : " + lastIndex);

        System.out.println("First char : " + word.charAt(firstIndex));
        System.out.println("Last char  : " + word.charAt(lastIndex));


        int[] arrays = {10, 20, 30, 40, 50};

        int firstArrayIndex = 0;                    // always 0
        int lastArrayIndex = arrays.length - 1;     // depends on array length

        System.out.println("Array: " + Arrays.toString(arrays));
        System.out.println("Length: " + arrays.length);

        // Values at first and last index
        System.out.println("First index value: " + arrays[firstArrayIndex]);
        System.out.println("Last index value: " + arrays[lastArrayIndex]);

        // Index positions
        System.out.println("First index position: " + firstArrayIndex);
        System.out.println("Last index position: " + lastArrayIndex);

        //join two streams
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);

        Stream<Integer> joinStreams = Stream.concat(list1.stream(), list2.stream());
        joinStreams.forEach(System.out::println);
        //output:1 2 3 4 5 6


        //Merge two sorted lists into a single sorted list using java streams

        List<Integer> listt1 = Arrays.asList(1, 2, 3);
        List<Integer> listt2 = Arrays.asList(4, 5, 6);

        Stream.concat(listt1.stream(), listt2.stream())
                .sorted()
                .forEach(System.out::println);
        //output: 1 2 3 4 5 6


        //Find all the numbers starting with 1

        List<Integer> numbers = Arrays.asList(10, 21, 13, 41, 15, 2, 1, 100, 23);
        numbers.stream().filter(n -> String.valueOf(n).startsWith("1"))
                .forEach(System.out::println);
        //output:10 13 15 1 100


        List<Integer> asList = Arrays.asList(1, 3, 2, 2, 2, 4);

        // Count frequency of each number
        Map<Integer, Long> frequencyMap = asList.stream()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        System.out.println("frequencyMap: " + frequencyMap);

        // Keep only repeating ones (count > 1)
        Map<Integer, Long> repeating = frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Repeating elements with count: " + repeating);


        //Remove duplicates from the list and preserve the order

        List<String> List = Arrays.asList("apple", "banana", "apple", "orange", "banana");

        List.stream()
                .distinct()
                .forEach(System.out::println);
        //output: apple,banana,orange


        //peek()----Remove duplicates from the list and preserve the order

        List<String> List1 = Arrays.asList("apple", "banana", "apple", "orange", "banana");

        List1.stream()
                .peek(w -> System.err.println("before---" + w))
                .filter(w -> w.startsWith("a"))
                .peek(w -> System.err.println("after filter letter starts with a----" + w))
                .map(String::toUpperCase)
                .peek(w -> System.err.println("after uppercase----" + w))
                .forEach(System.out::println);


        //Remove duplicates from the list and preserve the order

        List<String> dupList = Arrays.asList("apple", "banana", "apple", "orange", "banana");

        Set<String> dupcollect = dupList.stream()
                .distinct()
                .collect(Collectors.toSet());
        System.out.println("Remove duplicates from the list" + dupcollect);
        //output: apple,banana,orange

        //find out strings which starts with number
        List<String> stringwithnum = Arrays.asList("1apple", "banana", "3cherry", "date", "5elephant");
        stringwithnum.stream()
                .filter(str -> !str.isEmpty() && Character.isDigit(str.charAt(0)))
                .forEach(System.out::println);

        //find out strings which starts with number and remove and print
        //List<String> stringwithnum = Arrays.asList("1apple","banana","3cherry","date","5elephant");
        stringwithnum.stream()
                .filter(str -> str.matches(".*\\d.*"))
                .map(str -> str.replaceAll("\\d", " "))
                .forEach(System.out::println);

        //using streams for single string-check palindrome
        String input = "madam";
        int length = input.length();
        boolean palindrome = IntStream.range(0, length / 2)
                .allMatch(i -> input.charAt(i) == input.charAt(length - 1 - i));
        System.out.println("its a plaindrome" + palindrome);


        //decimals in reverse order
        List<Double> decimals = Arrays.asList(3.14, 1.59, 2.65, 4.89, 8.77);
        decimals.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        //nth smallest number
        int[] arr = {12, 3, 5, 5, 7, 19, 1, 8}; //1,3,5,7,8,12,19
        int n = 3;
        Optional<Integer> first = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(n - 1)
                .findFirst();
        if (first.isPresent()) {
            System.out.println("nth highest number:" + first);
        } else {
            System.out.println("number not pressent");

        }

        //last element of the given array
        int[] last = {10, 20, 30, 40, 50};
        Arrays.stream(last)
                .boxed()
                .skip(last.length - 1)
                .findFirst()
                .ifPresent(System.out::println);

        //join the strings with '['as prefix, ']' as suffix, ',' as delimiter

        List<String> joinwords = Arrays.asList("apple", "banana", "cherry");
        String joinStrings = joinwords.stream()
                .map(w -> "[" + w + "]")
                .collect(Collectors.joining(","));


        String collect = joinwords.stream()
                .collect(Collectors.joining(",", "[", "]"));
        System.out.println("JoinStrings----" + collect);

        //sum of first two numbers
        List<Integer> listOfNum = Arrays.asList(10, 20, 30, 40, 50);
        int sumOfFirstTwo = listOfNum.stream()
                .limit(2)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("sumOfFirstTwo----" + sumOfFirstTwo);
        String st="pruthvi from hyderabad studied college in hyderabad,pruthvi working in hyderabad";
        Arrays.stream(st.split(" "))
                .forEach(System.out::println);

        //product of first two numbers
        Optional<Integer> productOfTwo = listOfNum.stream()
                .limit(2)
                .reduce((a, b) -> a + b);
        System.out.println("product of two numbers----" + productOfTwo);


        List<Integer> listOfNums = Arrays.asList(1, 2, 3, 4, 2, 3, 5, 6, 6, 7);
        Optional<Integer> sumOfuniquenos = listOfNums.stream()
                .distinct()
                .reduce((a, b) -> a + b);
        System.out.println("sumOfuniquenos ----" + sumOfuniquenos);


        //find first oddd numbers from list
        List<Integer> list = Arrays.asList(2, 4, 6, 7, 9, 3);
        list.stream()
                .filter(i -> i % 2 != 0)
                .findAny()
                .ifPresent(System.out::println);
        Map<Boolean, List<Integer>> collect1 = list.stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println("even numbers----" + collect1.get(true));
        System.out.println("odd numbers----" + collect1.get(false));


        //intersection of two lists
        List<Integer> list11 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list22 = Arrays.asList(4, 5, 6, 7);

        List<Integer> list3 = list11.stream()
                .filter(list22::contains)
                .toList();
        System.out.println(list3);


        //sum of first 10 naturnal numbers
        List<Integer> naturalno = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        OptionalInt reduce = naturalno.stream()
                .mapToInt(Integer::intValue)
                .reduce((a, b) -> a + b);

        System.out.println("naturalno----" + reduce);
        int sum = IntStream.rangeClosed(1, 10)
                .sum();
        System.out.println("sum----" + sum);


        //print first even numbers
        IntStream.iterate(2,s->s+2)
                .limit(10)
                .boxed()
                .forEach(System.out::println);
    //sum of 10 even numbers
        int sum1 = IntStream.rangeClosed(2, 20)
                .filter(i -> i % 2 == 0)
                .sum();

        System.out.println("sum1----" + sum1);

//most repeated element in an array
        List<Integer> list4 = Arrays.asList(1, 2, 2, 1, 1, 1);
     list4.stream()
             .collect(Collectors.groupingBy(i->i,LinkedHashMap::new,Collectors.counting()))
             .entrySet()
             .stream()
             .limit(1)
             .findFirst()
             .ifPresent(System.out::println);




    }





}
