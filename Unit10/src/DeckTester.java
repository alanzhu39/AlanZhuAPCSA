/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks1 = {"A","B","C"};
		String[] suits1 = {"Giraffes","Lions"};
		int[] values1 = {2,1,6};
		Deck test1 = new Deck(ranks1,suits1,values1);
		System.out.println(test1.size());
		System.out.println(test1.isEmpty());
		System.out.println(test1.deal());
		System.out.println(test1.size());
		System.out.println(test1);
		
		String[] ranks2 = {"D","E","F"};
		String[] suits2 = {"Dogs","Cats"};
		int[] values2 = {5,6,7};
		Deck test2 = new Deck(ranks2,suits2,values2);
		System.out.println(test2.size());
		System.out.println(test2.isEmpty());
		System.out.println(test2.deal());
		System.out.println(test2.size());
		System.out.println(test2);
		
		String[] ranks3 = {"H","E","F","G"};
		String[] suits3 = {"Apples","Oranges","Bananas"};
		int[] values3 = {8,3,10,6};
		Deck test3 = new Deck(ranks3,suits3,values3);
		System.out.println(test3.size());
		System.out.println(test3.isEmpty());
		System.out.println(test3.deal());
		System.out.println(test3.size());
		System.out.println(test3);
		
		String[] stdRanks = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] stdSuits = {"Clubs","Diamonds","Hearts","Spades"};
		int[] stdValues = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Deck standard = new Deck(stdRanks,stdSuits,stdValues);
		System.out.println(standard.size());
		System.out.println(standard.isEmpty());
		System.out.println(standard.deal());
		System.out.println(standard.size());
		standard.shuffle();
		System.out.println(standard);
	}
}
