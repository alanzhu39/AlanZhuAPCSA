//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s)
	{
		word = s;
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		for(int index = 0; index < word.length(); index++)
		{
			if(vowels.indexOf(word.charAt(index)) > -1)
			{
				vowelCount++;
			}
		}
		return vowelCount;
	}

	public int compareTo(Word rhs)
	{
		if(numVowels() < rhs.numVowels())
		{
			return -1;
		}
		else if(numVowels() > rhs.numVowels())
		{
			return 1;
		}
		else
		{
			if(word.compareTo(rhs.toString()) < 0)
			{
				return -1;
			}
			else if(word.compareTo(rhs.toString()) > 0)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
	}

	public String toString()
	{
		return word;
	}
}