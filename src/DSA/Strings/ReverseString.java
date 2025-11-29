package DSA.Strings;



public class ReverseString {
    static String reverseString(String s) {

        String r="";
        for(int i=s.length()-1;i>=0;i--){
            r=r+s.charAt(i);
        }
        return r;
    }
   static String reverseStringRecursion(String str,String rev,int index){
        if(index<0){
            return rev;
        }
        return reverseStringRecursion(str,rev+str.charAt(index),index-1);
   }
    public static void main(String[] args) {
        System.out.println(reverseString("pruthvi"));
        System.out.println(reverseStringRecursion("omu", "","omu".length()-1));
    }
}
