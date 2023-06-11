import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        // Taking input of a character.
        // There is no such thing as nextChar() to input of a single character, but
        // we'll have to take the first character of a String input using next() only

        char ch = in.next().trim().charAt(0);

        // .trim() removes any extra spaces before a character
        // .charAt(index) gives the character at the index of the string, returns a char type character

        // Q: Check if given character is lowercase or uppercase
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }



    }
}
