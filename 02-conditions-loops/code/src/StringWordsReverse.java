public class StringWordsReverse {
    public static void main(String[] args) {
        String n = "All cows eat grass";
        String[] a = n.split(" ");
        for (int i = 0; i < a.length; i++) {
            StringBuilder sb = new StringBuilder(a[i]);
            System.out.print(sb.reverse() + " ");
        }
    }
}
