package DSA.Arrays;

import java.util.stream.LongStream;

public class FactorialB {
    static int factorial(int n) {

        int result=1;
        for(int i=1;i<=n;i++){
            result=result*i;
        }
       // System.out.println(result);
      return result;
    }

    public static void main(String[] args) {
        System.out.println( factorial(5));

        //using streams

        /*2️⃣ .reduce(1, (x, y) -> x * y)

reduce combines all elements of the stream into a single result.

The first argument 1 is the identity value (starting value).

The second argument is the reducer function:

(x, y) -> x * y


which multiplies two numbers.

🔢 How reduce works internally

Let's simulate the reduce operation:

Step	x (accumulator)	y (current stream value)	Result (x * y)
Start	1 (identity)	—	1
Step 1	1	1	1
Step 2	1	2	2
Step 3	2	3	6
Step 4	6	4	24
Step 5	24	5	120

Final value = 120

🧾 Final Output
120

📝 Summary (Easy to Remember)

rangeClosed(1, 5) → creates numbers 1 to 5

reduce(1, x * y) → multiply all numbers starting with 1

Result = factorial of 5, which is 120
 */
        long reduce = LongStream.rangeClosed(1, 5)
                .reduce(1, (x, y) -> x * y);
        System.out.println(reduce);
    }
}
