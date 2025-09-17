package JavaStreams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateChecker {
    //given list of integers ,return true if array contains duplicate element,return false otherwise
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,6};

        Set<Integer> set=new HashSet();
boolean response=Arrays.stream(num)
        .anyMatch(x->!set.add(x));
System.out.println(response);

        boolean b = Arrays.stream(num)
                .distinct()
                .count() != num.length;
        System.out.println(b);
    }

}
