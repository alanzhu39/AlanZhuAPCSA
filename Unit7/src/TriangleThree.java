//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
	}

	public TriangleThree(int count, String let)
	{
		size = count;
		letter = let;
	}

	public void setTriangle( int sz, String let)
	{
		size = sz;
		letter = let;
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output="";
		for(int i = 1; i <= size; i++)
		{
			int x = 1;
			int y = size;
			while(y > i)
			{
				output = output + " ";
				y--;
			}
			while(x <= i)
			{
				output = output + letter;
				x++;
			}
			output = output + "\n";
		}
		return output+"\n";
	}
}