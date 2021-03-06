/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card spadesa = new Card("ace", "spades", 1);
		Card clubsa = new Card("ace", "clubs", 1);
		Card hearts5 = new Card("five", "hearts", 5);
		Card other = new Card("ace", "spades", 1);
		System.out.println(spadesa.matches(other));
		System.out.println(spadesa);
		System.out.println(hearts5);
		System.out.println(clubsa);
	}
}
