/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
    public static void main(String[] args) {
        String str = args[0];
        String reversed = "";
        int len = str.length();

        for (int i = 0; i < len; i++) {
            reversed = str.charAt(i) + reversed;
        }

        System.out.println(reversed);
        System.out.println("The middle character is " + str.charAt(len / 2));
    }
}
