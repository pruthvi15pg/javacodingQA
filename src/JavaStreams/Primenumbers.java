package JavaStreams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Primenumbers {
	// Prime check using Streams
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                        .noneMatch(i -> number % i == 0);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 6, 8, 9, 11, 15, 16);
         
        // Get only prime numbers from list
        List<Integer> primes = numbers.stream()
        								.peek(num->System.out.println("before-----"+num))
                                      .filter(Primenumbers::isPrime)
                                      .peek(num->System.out.println("after-----"+num))
                                      .collect(Collectors.toList());

        System.out.println("Prime numbers: " + primes);
    }
	}


