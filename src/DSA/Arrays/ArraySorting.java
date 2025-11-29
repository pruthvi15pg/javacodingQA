package DSA.Arrays;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        //logic
        int[] arr = {10, 9, 25, 3, 6, 8};
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = -1;
            }
        }
        System.out.println("Array after sorting using logic:" + Arrays.toString(arr));

      //using BuiltIn
  Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));

    }

}
