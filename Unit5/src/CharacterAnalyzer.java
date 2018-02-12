//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;
	private String result;

	public CharacterAnalyzer()
	{


	}

	public CharacterAnalyzer(char c)
	{
		theChar = c;
	}

	public void setChar(char c)
	{
		theChar = c;
	}

	public char getChar()
	{
		return theChar;
	}

	public void isUpper( )
	{
		if(theChar >= 65 && theChar <= 90)
		{
			result = "an uppercase character.";
		}
		else
		{
			return;
		}
	}

	public void isLower( )
	{
		if(theChar >= 97 && theChar <= 122)
		{
			result = "a lowercase character.";
		}
		else
		{
			return;
		}
	}
	
	public void isNumber( )
	{
		if(theChar >= 48 && theChar <= 57)
		{
			result = "a number.";
		}
		else
		{
			return;
		}
	}	
	
	public String getTest()
	{
		isUpper();
		isLower();
		isNumber();
		return result;
	}

	public int getASCII( )
	{
		return (int)theChar;
	}

	public String toString()
	{
		return ""+getChar() + " is " +  getTest() + " ASCII == " + getASCII() + "\n";	  
	}
}