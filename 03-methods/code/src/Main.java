import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Q: Input two numbers and print the sum

        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum = " + sum);
    }
}