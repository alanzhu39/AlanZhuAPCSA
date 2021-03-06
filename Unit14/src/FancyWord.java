//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;

	public FancyWord()
	{
	}

	public FancyWord(String s)
	{
		mat = new char[s.length()][s.length()];
		for(int r = 0; r < s.length(); r++)
		{
			for(int a = 0;a < s.length(); a ++)
			{
				mat[r][a] = ' ';
			}
			mat[r][r] = s.charAt(r);
			mat[r][s.length() - 1 - r] = s.charAt(s.length() - 1 - r);
			if(r == 0 || r == s.length() - 1)
			{
				for(int c = 0; c < s.length(); c ++)
				{
					mat[r][c] = s.charAt(c);
				}
			}
		}
	}

	public String toString()
	{
		String output="";
		for(char[] arr : mat)
		{
			for(char c : arr)
			{
				output += c;
			}
			output += "\n";
		}
		return output+"\n\n";
	}
}