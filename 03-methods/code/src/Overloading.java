import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {

        /*
            Method Overloading allows different methods to have the same name,
            if the parameters are different.
        */

//        fun(30);
//
//        fun("Sabhi Sharma");

//        int ans = sum(3, 4);
//        System.out.println(ans);
//
//        int ans1 = sum(3, 4, 5);
//        System.out.println(ans1);

        demo(2,3,4,5,6,73,46,2);

        demo("Sabhi", "Rahul", "Krishna", "Kunal");


// Ambiguous method call (does not know whether to call demo(int ... v) or demo(String ... v) as both are valid
//        demo();

        /*
            At compile time, it decides which method to run!
            Hence, it is also known as Compile-time Polymorphism / Static Polymorphism / Early Binding in Java.
        */
    }

    static void demo(int ... v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ... v) {
        System.out.println(Arrays.toString(v));
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }

    /*
        Different Ways of Method Overloading in Java
               - Changing the Number of Parameters.
               - Changing Data Types of the Arguments.
               - Changing the Order of the Parameters of Methods
    */
}
