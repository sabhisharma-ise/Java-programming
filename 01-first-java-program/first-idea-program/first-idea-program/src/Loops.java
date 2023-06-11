public class Loops {
    public static void main(String[] args) {

        int count = 1;

        // while loop
        while (count != 5) {
            System.out.println(count);
            count++;
        }

        // for loop
        for (int count1 = 1; count1 != 5; count1++) {
            System.out.println(count1);
        }

        int count2 = 1;

        // do while loop
        do {
            System.out.println(count2);
            count2++;
        } while (count2 != 5);
    }
}
