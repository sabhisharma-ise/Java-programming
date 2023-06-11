import java.util.Scanner;

public class CountOccurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num = in.nextInt();

        int n = in.nextInt();

        // Q: Count the number of occurrence of a digit 'n' in a given number 'num'
        // #Method-1
        int count = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit == n) {
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);


        // #Method-2 (Self)
        // You can convert a number into String, and then you can use toCharArray()
        // or split() method to separate the number into digits.
//        String s = String.valueOf(num);
//        char[] ch = s.toCharArray();

        // Convert a character array into an integer array
//        int[] intArray = new int[ch.length];
//        for (int i = 0; i < ch.length; i++) {
//            intArray[i] = Character.getNumericValue(ch[i]);
//        }

        // for loop for counting the number of occurrences of 'n' in intArray
//        int count = 0;
//        for (int i = 0; i < intArray.length; i++) {
//            if (n == intArray[i]) {
//                count++;
//            }
//        }
//        System.out.println(count);
    }
}
