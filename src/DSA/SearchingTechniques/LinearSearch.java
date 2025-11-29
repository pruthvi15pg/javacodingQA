package DSA.SearchingTechniques;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class LinearSearch {

 /*   Type: Sequential search
    Use When: Array is unsorted
    Time Complexity: O(n)
  */
    static int search(int[] arr, int key){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

 public static void main(String[] args) {
     int[] arr = {20,42,6,25,30,88};
     System.out.println( search(arr,88));

     //using streams
     int index = IntStream.range(0, arr.length)
             .filter(i -> arr[i] == 88)
             .findFirst()
             .orElse(-1);
     System.out.println(index);

     OptionalInt first = Arrays.stream(arr)
             .filter(i -> i == 88)
             .findFirst();
     System.out.println(first.getAsInt());
 }
}
