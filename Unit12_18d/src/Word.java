//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;
	private int length;

	public Word( String s )
	{
		word = s;
		length = s.length();
	}
	
	public int getLength()
	{
		return length;
	}
	
	public String getWord()
	{
		return word;
	}
	
	private int compare(Word rhs)
	{
		for(int index = 0; index < length; index++)
		{
			if(word.charAt(index) < rhs.getWord().charAt(index))
			{
				return -1;
			}
			else if(word.charAt(index) > rhs.getWord().charAt(index))
			{
				return 1;
			}
		}
		return 0;
	}

	public int compareTo( Word rhs )
	{
		if(length > rhs.getLength())
		{
			return 1;
		}
		else if(length < rhs.getLength())
		{
			return -1;
		}
		else if(compare(rhs) > 0)
		{
			return 1;
		}
		else if(compare(rhs) < 0)
		{
			return -1;
		}
		return 0;
	}

	public String toString()
	{
		return word;
	}
}