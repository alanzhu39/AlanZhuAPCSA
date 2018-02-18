//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
	}

	//add in second constructor
	public LetterRemover(String sent, char look)
	{
		sentence = sent;
		lookFor = look;
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		for(int index = 0; index < cleaned.length(); index++)
		{
			if(cleaned.charAt(index) == lookFor)
			{
				cleaned = cleaned.substring(0,index) + cleaned.substring(index + 1);
				index = -1;
			}
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
	}
}