package DSA.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class RemoveVowels {
    static String removeVowels(String str){
        String res="";
      List<Character>list= Arrays.asList('a','e','i','o','u');

       String  str1=str.toLowerCase();
        for(int j=0;j<str1.length();j++){
            char ch=str1.charAt(j);
           if(!list.contains(ch)){

               res+=ch;
           }

            }
        return res;
        }

    public static void main(String[] args) {
        System.out.println(removeVowels("pruthvi"));
    }

}
