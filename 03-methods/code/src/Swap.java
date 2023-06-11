import static java.util.Collections.swap;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Swap two numbers
//        int temp = a;
//        a = b;
//        b = temp;

        swap(a, b);
        System.out.println(a + " " + b);    // numbers remain same

        // Another example
        String name = "Sabhi";
        changeName(name);
        System.out.println(name);   // name does not change

        /*
           In above example, "Sabhi" is an Object and the reference variable 'name' is pointing towards it.
           When we call the method changeName(name), the value of the reference variable 'name' is passed.
           In Java, there is no 'Pass by reference', but only 'Pass by value'!
        */
    }

    static void changeName(String naam) {
        naam = "Will Smith";    // creating a new object
    }

    /*
        The input parameter 'naam' has a copy of the value of the ref. variable 'name'.
        So, it has value as "Sabhi", but if we manipulate it inside the method.
        Only, 'naam' gets changed but the original ref. variable 'name' does not change!
        That is the reason why we get still get the same value, even after calling chnageName() in main();
    */

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
