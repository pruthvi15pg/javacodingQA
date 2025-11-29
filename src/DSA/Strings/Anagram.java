package DSA.Strings;

import java.util.Arrays;

public class Anagram {
    public static String isAnagram(String str1, String str2) {
      str1 = str1.toLowerCase();
      str2 = str2.toLowerCase();
      char[] arr1 = str1.toCharArray();
      char[] arr2 = str2.toCharArray();
      Arrays.sort(arr1);
      Arrays.sort(arr2);
      if(Arrays.equals(arr1, arr2))
        return "its Anagram";
      else
        return "not Anagram";
    }
        public static void main(String[] args) {
            System.out.println(isAnagram("listen", "silent"));
    }
}
