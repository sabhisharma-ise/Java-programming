public class Main {
    public static void main(String[] args) {

        // Q: Store a roll number
        int a = 19;

        // Q: Store a name
        String name = "Sabhi Sharma";

        // Q: Store 5 roll numbers
        int rno1 = 12;
        int rno2 = 24;
        int rno3 = 36;

        // Syntax:-
        // datatype[] variable_name = new datatype[size];
        int[] rnos = new int[5];
        // or we can directly write
        int[] rnos2 = {23, 12, 36, 15, 18}; // even though we do not put the 'new' keyword, internally it is also doing the same thing as 'new'

        int[] ros;  // declaration of array: ros is getting defined in the stack (happens at Compile-time)
        ros = new int[5];   // initialisation: actual object is created in the memory (Heap)
        // happens at Run-time, known as Dynamic Memory Allocation
        // What is Dynamic Memory Allocation ?
        // At run-time, memory is allocated !
        // the 'new' keyword is used to create an object.
        System.out.println(ros[0]); // Default values of Integer is 0

        /*
            Arrays in Java are not guaranteed to be continuous in memory!

            https://stackoverflow.com/a/31624722
            Point 1:- Array objects are dynamically created in heap.
            Point 2:- Heap objects need not be continuous.

            So, Arrays may not be continuous in Java.
            (Depends on the JVM)

         */

        String[] arr = new String[4];
        System.out.println(arr[0]); //Default value of String is null

        // null - special literal in Java
//        int num = null;   Cannot assign to any primitive types
        String str = null; // Can assign to non-primitive types

    }
}