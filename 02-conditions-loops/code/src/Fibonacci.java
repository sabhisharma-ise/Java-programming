import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        /*
            Fibonacci number series:
            Start with 0, 1 and then the next number is the sum of previous two numbers i.e.,
            0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, . . .
        */

        int a = 0;  // 0th fibonacci number (say, prev)
        int b = 1;  // 1st fibonacci number (say, curr)

        int count = 2;  // We already have the first two numbers, so count starts with 2

        // Q: Find the nth fibonacci number
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();

        while (count <= n) {
            int temp = b;   // take temp variable on 'b' (curr)
            b = a + b;      // move 'b' (curr) to next fibonacci number (next)
            a = temp;       // move 'a' (prev) to temp variable assigned to original 'b' (curr)

            count++;
        }

        System.out.println(b);

    }
}
