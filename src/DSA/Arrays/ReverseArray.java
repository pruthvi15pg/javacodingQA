package DSA.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class ReverseArray {

    //logic  i       j two pointers i and j
         //  1 2 3 4 5
    static void reverseArray(int[] arr) {
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        reverseArray(arr);
        System.out.println("Reverse Array using logic:"+Arrays.toString(arr));


        int[] arr2 = { 1, 2, 3, 4, 5 };
        //streams
        int[] reversedArray1 = Arrays.stream(arr2)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println("Reversed array using streams1:"+Arrays.toString(reversedArray1));

        //or
        int[] reversedArray2 = IntStream.range(0, arr2.length)
                .map(i -> arr[arr.length - 1 - i])
                .toArray();
        System.out.println("Reversed array using streams2:"+Arrays.toString(reversedArray2));

    }
}
