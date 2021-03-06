//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{
	}

	public Histogram(char[] values, String fName)
	{
		fileName = fName;
		letters = new ArrayList<>();
		for(char a : values)
		{
			letters.add(a);
		}
		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		count = new ArrayList<>();
		for(int i = 0; i < letters.size(); i++)
		{
			count.add(0);
		}
		for(int index = 0; index < letters.size(); index++)
		{
			Scanner file = new Scanner(new File(fileName)).useDelimiter("");
			while(file.hasNext())
			{
				char nextChar = file.next().charAt(0);
				if(nextChar == letters.get(index))
				{
					count.set(index, count.get(index) + 1);
				}
			}
		}
	}

	public char mostFrequent()
	{
		int mostFreq = 0;
		for(int index = 0; index < count.size(); index++)
		{
			if(count.get(index) > count.get(mostFreq))
			{
				mostFreq = index;
			}
		}
		return letters.get(mostFreq);
	}

	public char leastFrequent()
	{
		int leastFreq = 0;
		for(int index = 0; index < count.size(); index++)
		{
			if(count.get(index) < count.get(leastFreq))
			{
				leastFreq = index;
			}
		}
		return letters.get(leastFreq);
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}