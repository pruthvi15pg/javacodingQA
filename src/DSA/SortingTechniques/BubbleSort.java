package DSA.SortingTechniques;

public class BubbleSort {
    /*
    Bubble Sort is a simple comparison-based sorting algorithm.
    How it works
    Compare each pair of adjacent elements.
    If the left one is greater than the right one → swap them.
    Repeat this until the list becomes fully sorted.
    Largest elements “bubble up” to the end in each pass.
            0 1 2 3 4
    arr[]= {3,5,7,2,9}
   i= {3,5,7,2,9}
   n=5     swapping adjacent..so it take iterations...
 i=0  j= {3 5 7 2 9}---- j<5-1
   1   { 3 5 2 7 9}---- j<5-2
   2   { 3 2 5 7 9}---- j<5-3
   3   {2 3 5 7 9 }---- j<5-4
 i<n-1                  j<n-(i-1)


    */
    static int[] BubbleSort(int[] arr){
      int n=  arr.length;
      for(int i=0;i<n-1;i++){
          for(int j=0;j<n-i-1;j++){
              if(arr[j]>arr[j+1]){
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
              }
          }
      }
      return arr;
    }
    public static void main(String[] args) {
      int[] arr={7,3,5,9,2};
        System.out.println( BubbleSort(arr));

       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }
    }

}
