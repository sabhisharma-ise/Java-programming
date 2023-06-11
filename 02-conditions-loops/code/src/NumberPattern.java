public class NumberPattern {

//    Q: Print the number pattern without using loops
//       01234543210

//    Recursive Method #1
    public static void printPattern(int n) {
        if (n < 5) {
            System.out.print(n);
            printPattern(n + 1);
        }
        System.out.print(n);
    }

    public static void main(String[] args) {
        printPattern(0);    // Recursive Call

        System.out.println();

//        Iterative Method #2
        int size = 5;
        for (int i = 0; i <= size; i++) {
            System.out.print(i);
        }
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(i);
        }
    }
}
