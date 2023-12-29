import java.awt.*;

/**
 * Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        String output = num + " is a perfect number since " + num + " = 1";
        int sum = 1;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                sum += i;
                output = output + " + " + i;
            }
        }
        if (sum == num) {
            System.out.println(output);
        } else {
            System.out.println(num + " is not a perfect number");
        }
    }
}
