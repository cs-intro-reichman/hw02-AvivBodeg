/**
 * Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);

        String evenRow = "";
        String oddRow = "";

        for (int i = 0; i < size; i++) {
            oddRow += "* ";
            evenRow += " *";
        }
        for (int i = 1; i <= size; i++) {
            if (i % 2 == 0) {
                System.out.println(evenRow);
            } else {
                System.out.println(oddRow);
            }
        }
    }
}
