import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};

        reverseArray(arr);

        System.out.println("After Reverse: " + Arrays.toString(arr));
    }

    // method 2 (Kunal)
    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++; end--;
        }
    }

    // method 1 (Self)
    static void reverse(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < ( size / 2 ); i++) {
            swap(arr, i, size - i - 1); // swaps (0th, 3rd), (1st, 2nd) indexes
        }
    }

    // Swap method
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
