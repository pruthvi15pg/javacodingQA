package DSA.Arrays;

public class RemoveDuplicates {

    /*   arr={2,2,3,3,4,5,5}
          rd={2,3,4,5}
          take same array size rd
           and store only distinct values.
           return rd+1----becoz array size

    * */
   static int duplicates(int arr[]){
       int rd=0;
       for(int i=1;i<arr.length;i++){
           if(arr[rd]!=arr[i]){
               rd++;
               arr[rd]=arr[i];
           }
       }
     return rd+1;
    }

    public static void main(String[] args) {
       int[] arr={2,2,3,4,5,5,6,6};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
      int rd= duplicates(arr);
        System.out.println();
        for(int i=0;i<rd;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
