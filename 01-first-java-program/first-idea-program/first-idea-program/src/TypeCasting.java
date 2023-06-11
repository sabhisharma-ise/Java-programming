import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // If we input an integer value in this case, it will get converted into floating-point value.
        // We can go from bigger value to small value
        float num = input.nextFloat();
        System.out.println(num);

        // If we try to input a floating-point value in this case, it will give an error!
        // We cannot go from small value to bigger value
        int num1 = input.nextInt();

        // For converting integer to float, we'll have to do typecasting
        int num2 = (int)(56.82f);
        System.out.println(num2);

        // automatic type promotion in expressions
        // Suppose maximum bytes in int is equal to 256, so it gives remainder of its maximum value
        int a = 257;
        byte b = (byte)(a);
        System.out.println(b);

        // Java converts the 'byte' types automatically in 'int' for calculating the expression
        byte x = 40;
        byte y = 50;
        byte z = 100;
        int res = x * y / z;
        System.out.println(res);

        // Should give 97 as output, since ASCII value of 'a' is 97
        // Again, we can see its automatically casting from bigger type to smaller type
        int number = 'a';
        System.out.println(number);

        // Java follows Unicode
        System.out.println("नमस्ते");

        // anyone is float, result is float
        System.out.println(4 * 4.5f);

    }
}
