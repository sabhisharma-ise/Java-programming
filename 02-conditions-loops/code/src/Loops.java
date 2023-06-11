import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
            Syntax of for loop:

            for (initialisation; condition; increment/decrement) {
                // body
            }
        */

        // Q: Print numbers from 1 to 5
//        for (int num = 1; num <= 5; num += 1) {
//            System.out.println(num);
//        }

        // Print numbers from 1 to n (user-input)
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//
//        for (int num = 1; num <= n; num++) {
//            System.out.print(num + " ");
//        }

        /*
            Syntax of while loop:

            while (condition) {
                // body
            }
        */

        // Print numbers from 1 to 5
//        int num = 1;
//        while (num <= 5) {
//            System.out.println(num);
//            num += 1;
//        }

//        Hint: Use while-loops when you don't know how many times the loop will run
//        And use for-loops when you know how many times the loop will run

        /*
            Syntax of do-while loop:

            do {
                // body
            } while (condition);
        */

        // Print numbers from 1 to 5
        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 5);

//        In a do-while loop, the program is going to execute at least once!


    }
}
