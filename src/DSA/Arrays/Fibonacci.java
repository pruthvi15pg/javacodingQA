package DSA.Arrays;

public class Fibonacci {
    //              n=   1 2 3 4 5 6  7  8
    /* fibonacci series- 1 1 2 3 5 8 13 21
    *                   n=5 5th term=4th term + 3rd term;
    *                       nth term = fibo(n-1)+fibo(n-2);
    * */
    //using logic
     static int fib(int num){
         int third=0;
         int first=1,second=1;
         for(int i=3;i<=num;i++){
            third= first+second;
             first=second;
             second=third;

         }
         return third;

     }

    //using Recursion
    static int fiboRecursion(int n){
        if(n==1 || n==2)
        {
            return 1;
        }
        return fiboRecursion(n-1)+fiboRecursion(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fib(8));
        System.out.println(fiboRecursion(7));

    }
}
