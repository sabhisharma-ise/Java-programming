import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // create an array
        int[] arr = {1, 2, 3, 4, 5};
        change(arr);
        System.out.println(Arrays.toString(arr));   // Arrays.toString() takes an int array and return string value of it
    }

    static void change(int[] nums) {
        nums[0] = 99;   // if you make a change to the object via this ref variable, the original object will be changed
    }
}
