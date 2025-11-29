package DSA.Arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyArray {

    //using logic
    static void frequency(int[] arr){
        int i=1;
        int freq=1;
        while(i<arr.length){
            while(i<arr.length && arr[i]==arr[i-1]){
                freq++;
                i++;

            }
            System.out.println(arr[i-1]+"---->"+freq);
            freq=1;
            i++;
        }
    }
    public static void main(String[] args) {
        int[] arr={20,20,30,30,30};
        frequency(arr);

        //using streams
        Map<Integer, Long> collect = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
                System.out.println(collect);
    }

    }

