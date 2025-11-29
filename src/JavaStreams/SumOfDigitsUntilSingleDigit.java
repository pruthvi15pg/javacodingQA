package JavaStreams;

public class SumOfDigitsUntilSingleDigit {
    static int sumDigits(int num) {

        while(num>=10){
            int sum = 0;
            while(num>0){
                sum += num%10;
                num/=10;
            }
            num=sum;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
    }
}
