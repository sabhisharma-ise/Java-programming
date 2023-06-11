import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Q: Find the largest of the 3 numbers
        // Assume max as any one of the values
//        int max = a;
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//        System.out.println(max);

        // The in-built Math.max(a, b) class in Java
        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);

    }
}
