/**
 * Computes some statistics about families in which the parents decide
 * to have children until they have at least one child of each gender.
 * The program expects to get one command-line argument: an int value
 * that determines how many families to simulate.
 */
public class OneOfEachStats1 {
    public static void main(String[] args) {
        int tests = Integer.parseInt(args[0]);

        //counters
        int twoChildren = 0;
        int threeChildren = 0;
        int fourOrMoreChildren = 0;
        int totalKids = 0;

        for (int i = 0; i < tests; i++) {
            boolean noBoy = true;
            boolean noGirl = true;

            int kids = 0;
            //generates family
            while (noGirl || noBoy) {
                double rnd = Math.random();
                if (rnd < 0.5) {
                    noGirl = false;
                } else {
                    noBoy = false;
                }
                kids++;
            }

            //adds to counters
            totalKids += kids;
            if (kids == 2) {
                twoChildren++;
            } else if (kids == 3) {
                threeChildren++;
            } else {
                fourOrMoreChildren++;
            }
        }

		//prints stats
        System.out.println("Average: " + (double) totalKids / tests +
                " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + twoChildren);
        System.out.println("Number of families with 3 children: " + threeChildren);
        System.out.println("Number of families with 4 or more children: " + fourOrMoreChildren);

		//prints most common number of children
        if (twoChildren >= threeChildren) {
            if (twoChildren >= fourOrMoreChildren) {
                System.out.println("The most common number of children is 2.");
            } else {
                System.out.println("The most common number of children is 4 or more.");
            }
        } else {
            if (threeChildren >= fourOrMoreChildren) {
                System.out.println("The most common number of children is 3.");
            } else {
                System.out.println("The most common number of children is 4 or more.");
            }
        }
    }
}
