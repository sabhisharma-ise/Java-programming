import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        sum();
//        int ans = sum2();
        int ans = sum3(20, 30);
        System.out.println("The sum = " + ans);
    }

    /*
        A function which is written inside a class, is known as a method.

        Syntax of defining a method in Java:

        access modifier returnType name {
            // body
            return statement;
        }

    */

    // Since the main() is a static method, so anything we want to use in this should also be static
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum = " + sum);
    }

    // return the value
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    // pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }

}
