import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Check for prime: ");
        int n = in.nextInt();
        System.out.println(isPrime(n));

        System.out.print("Check for armstrong: ");
        n = in.nextInt();
        System.out.println(isArmstrong(n));

        // Q: Print all the 3 digit armstrong numbers
        System.out.print("All 3-digit Armstrong numbers: ");
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    /*
        Armstrong numbers:

        Say a = 153 (no of digits = power of each digit while adding)
        1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 (same number)

        Say b = 1634 (no of digits = 4)
        1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1634 (same number)
    */

    static boolean isArmstrong(int n) {
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += lastDigit * lastDigit * lastDigit;
            temp /= 10;
        }
        return n == sum;    // Simplified statement
    }

    static boolean isPrime (int n) {
        if (n <= 1) { return false; }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c = c + 1;
        }
        return true;
    }
}
