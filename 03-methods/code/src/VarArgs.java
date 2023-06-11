import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        /*
            Variable Arguments (Varargs) in Java is a method that takes a variable number of arguments.
        */

        fun(2, 3, 4, 5, 6, 7, 10, 23, 45);
        fun();  // this will also work (it will be an empty array)

        multi(2, 3, "Sabhi", "Kunal", "Rahul");
    }

    static void multi(int a, int b, String ... c) { // Remember: VarArgs must always be last in the list
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    static void fun(int ... a) {    // Internally, it is taking an array of integers
        System.out.println(Arrays.toString(a));
    }
}
