package DSA.SearchingTechniques;

public class BinarySearch {

    /*
Binary Search is an efficient algorithm to find an element in a sorted array.

Key idea:
1.Check the middle element.
2.If target is smaller → search left half.
3.If target is bigger → search right half.
4.Repeat until found or search space ends.

Time Complexity :O(log n)
Works only on Sorted arrays / lists

        l       m           h
        3,5,6,8,12,15,16,19,21
     */
    public static int binarySearch(int[] arr,int key){
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(key==arr[mid]){
                return mid;
            }
            else if(key<arr[mid]){
                high=mid-1;
                low=low;
            }
            else if(key>arr[mid]){
                low=mid+1;
                high=high;
            }
        }
    return -1;
    }
    public static void main(String[] args) {
        int[] arr={3,5,6,8,12,15,16,19,21};
        int key=17;
        System.out.println(binarySearch(arr,key));
    }
}
