//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class WordPrinter
{
	//instance variables and constructors could be present, but are not necessary
	private static int useTimes;
	private static String userWord;
	
	public WordPrinter()
	{
	}
	
	public static void printWord(String word, int times)
	{
		int i = 0;
		while(i < times)
		{
			System.out.println(word);
			i++;
		}
	}
}