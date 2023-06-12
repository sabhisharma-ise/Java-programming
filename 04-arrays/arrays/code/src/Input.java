import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array of primitives
        int[] arr = new int[5]; // Size is 5. Last Index will be 4 (size - 1)
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 40;
        arr[3] = 50;
        arr[4] = 32;
        // [23, 45, 40, 50, 32]
        System.out.println(arr[3]);

        // shortcut method to print the elements of an array
        System.out.println(Arrays.toString(arr));

        // input using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        // output using for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Enhanced for-loop (forEach loop)
        for (int num : arr) {   // for every element in array, print the element
            System.out.print(num + " ");    // here num represents element of the array
        }

//        System.out.println(arr[5]); // Gives an error: Index out of bounds

        // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        
        System.out.println(Arrays.toString(str));

    }
}
