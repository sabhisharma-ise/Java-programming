public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Block Scope
        {
            // int a = 50;  // already initialised outside the block
            a = 50; // re-assign the original ref variable to some other value
            System.out.println(a);

            int c = 90; // Values that are initialised in the block, can only be used in the same block
        }

        System.out.println(a);
//        System.out.println(c);
//        Cannot use 'c' outside the block

        // Loop Scope
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 10;
        }
//        System.out.println(i);
    }

    static void random() {
        int num = 67;

        // Method Scope
//        System.out.println(a);
//        Cannot access the variable 'a' here, as its scope is limited in the main() method only
    }
}
