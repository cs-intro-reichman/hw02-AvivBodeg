
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int kids = 0;
		boolean noBoy = true;
		boolean noGirl = true;

		while(noBoy || noGirl){
			double rnd = Math.random();
			kids++;

			if (rnd < 0.5){
				System.out.print("g ");
				noGirl = false;
			}else{
				System.out.print("b ");
				noBoy = false;
			}
		}
		System.out.println();
		System.out.println("You made it... and you now have "+kids+ " children");
	}
}
