/**
 * Generates and prints random integers in the range [0,10),
 * as long as they form a non-decreasing sequence.
 */
public class InOrder {
    public static void main(String[] args) {
        int rnd = (int) (Math.random() * 10);
        int prev;

        do {
            prev = rnd;
            System.out.print(prev + " ");
            rnd = (int) (Math.random() * 10);
        } while (rnd >= prev);
    }
}
