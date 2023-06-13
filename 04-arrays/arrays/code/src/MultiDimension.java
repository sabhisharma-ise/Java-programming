import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
               1 2 3
               4 5 6
               7 8 9
         */

        Scanner in = new Scanner(System.in);

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println( arr[1][0] );    // arr[1] = [4, 5, 6], therefore arr[1][0] = 4

        // The individual size of each column can vary !
        int[][] arr2D = {
                {1, 2, 3},  // 0th index
                {4, 5}, // 1st index
                {6, 7, 8, 9} // 2nd index -> arr2D[2] = {6, 7, 8, 9}
        };

        int[][] array = new int[3][3];
        System.out.println(array.length);   // no of rows

        // Input
        for (int row = 0; row < array.length; row++) {
            // for each col in every row
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = in.nextInt();
            }
        }
        // Using array[row].length in inner for-loop
        // as the col size can vary for each row

        // Output
        for (int row = 0; row < array.length; row++) {
            // for each col in every row
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();   // Prints a newline after every row
        }

        // better way to output
        for (int row = 0; row < array.length; row++) {
            System.out.println(Arrays.toString(array[row]));
        }

        // enhanced for-loop
        for (int[] a : array) {
            System.out.println(Arrays.toString(a));
        }

    }
//        https://stackoverflow.com/questions/67190059/why-is-row-size-required-and-column-size-optional-in-2d-3d-array-in-java
//        The row size is mandatory, but the col size is optional !
//        int[][] arr = new int[3][];

}
