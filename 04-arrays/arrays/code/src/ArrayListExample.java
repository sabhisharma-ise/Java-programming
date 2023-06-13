import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(10);
        list.add(8);
        list.add(15);
        list.add(20);
        list.add(23);
        list.add(26);

        // .contains(item)
        System.out.println(list.contains(10));  // returns true or false

        // .set(index, item)
        list.set(0, 30);    // updates the element at specified index

        // .remove(index)
        list.remove(1); // removes the element at specified index

        System.out.println("After modification: " + list);

        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>();

        // input
        for (int i = 0; i < 5; i++) {
            list1.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.print(list1.get(i) + " ");    // .get(index)
        }
//      OR System.out.println(list1); also works


        /*
            How does ArrayList internally works in Java ?

            1. Size is fixed internally
            2. Say ArrayList fills by some amount
            -> It will create a new ArrayList of say, double the size
            -> Old elements are copied to new one
            -> Old one is deleted


         */
    }
}
