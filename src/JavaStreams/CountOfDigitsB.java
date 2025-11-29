package JavaStreams;

import java.util.Scanner;
import java.util.stream.Stream;

public class CountOfDigitsB {
    //using logic
    static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number =scanner.nextInt();
        System.out.println(countDigits(number));


        //using streams
        int num = 1234565666;
        //1st way
        long count = String.valueOf(num)
                .chars()
                .count();

        System.out.println(count);

        //2nd way
        long iterate = Stream.iterate(num, n -> n > 0, n -> n / 10)
                .count();
        System.out.println(iterate);

    }
}
