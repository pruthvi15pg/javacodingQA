package DSA.Arrays;

public class InverseOfArray {

    /* index= i 0 1 2 3 4
    arr=       {2,3,1,0.4} //value
//
//         0 1 2 3 4   //
//     rd={3 2 0 1 4}
     */
     static int[] Inverse(int[] arr){
         int[] b=new int[arr.length];
         for(int i=0;i<arr.length;i++){
             int v=arr[i];
             b[v]=i;
         }
         return b;

     }

    public static void main(String[] args) {
     int[] arr={2,3,1,0,4};
      for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
      }
      System.out.println();
      int[] b=Inverse(arr);
      for(int i=0;i<b.length;i++){
          System.out.print(b[i]+" ");
      }

    }
}
