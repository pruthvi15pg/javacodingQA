package DSA;

public class SumOfDigits
{
    //using logic
    static int sumDigits(int n)
    {
        int sum=0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    //using Recursion
    static int SumDigitRecursion(int n)
    {
        if(n==0)
            return 0;
        return SumDigitRecursion(n/10)+n%10;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(5123));
        System.out.println(SumDigitRecursion(5123));
    }
}
