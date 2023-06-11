
public class Shadowing {
    static int x = 10;   // Make it static, if we want to use it in the static void main() method
//    this will be shadowed at line 9

    public static void main(String[] args) {
        System.out.println(x);  // 10
        int x; // the class variable at line 3 is shadowed by this
//        System.out.println(x);    // scope will begin when value is declared
        x = 20;
        System.out.println(x);  // 20
        fun();  // 10
    }

    static void fun() {
        System.out.println(x);
    }
}
