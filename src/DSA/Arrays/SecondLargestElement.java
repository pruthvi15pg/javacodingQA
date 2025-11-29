package DSA.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class SecondLargestElement {
   static int secondLargest(int[] arr) {
       //      i-------- i starts from 3rd element.
       //20,42,6,25,30,88
       int max1=0,max2=0;
        if(arr[0]>arr[1]){
            max1=arr[0];
            max2=arr[1];
        }
        else {
            max1=arr[1];
            max2=arr[0];
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }else if(arr[i]>max2){
                max2=arr[i];
            }
        }
        return  max2;
    }
    public static void main(String[] args) {
        int[] arr = {20,42,6,25,30,88};
        System.out.println( "using logic:"+secondLargest(arr));

        //using streams
       Arrays.stream(arr)
                .boxed()
                .sorted(Collections.reverseOrder())
                .limit(2)
                .skip(1)
               .forEach(System.out::println);

    }
}
