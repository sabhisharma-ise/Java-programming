public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 9, 18};
        System.out.println(maxInRange(arr, 1, 3));
    }

    // maximum value in a range
    static int maxInRange(int[] arr, int start, int end) {

        // edge cases like
        if (end > start || arr == null || arr.length == 0) {
            return -1;
        }

        int max = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // maximum value in an array
    static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
