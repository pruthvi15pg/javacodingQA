package DSA.Strings;
//reverse it and store it in another string and check using equals method
public class PalindromeString {
    static String palindrome(String str) {

       String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(rev.equals(str))
            return "its palindrome";
        else return "not palindrome";
    }
    //using recursion
    static boolean palindRecursion(String s,int i,int j){
       if(s.charAt(i)!=s.charAt(j))
           return false;
       if(j<=i)
           return true;
       return palindRecursion(s,i+1,j-1);
    }
    public static void main(String[] args) {
        System.out.println(palindrome("abc"));
        System.out.println(palindRecursion("madam",0,"madam".length()-1));
    }
}
