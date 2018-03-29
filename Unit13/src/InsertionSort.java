//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

class InsertionSort
{
	private ArrayList<String> list;

	public InsertionSort()
	{
		list = new ArrayList<String>();
	}

	//modfiers
	public void add( String  word)
	{
		int loc = 0;
		if(list.contains(word))
		{
			return;
		}
		loc = Math.abs(Arrays.binarySearch(list.toArray(), word));
		list.add(loc - 1, word);
		return;
	}


	public void remove(String word)
	{
		list.remove(word);
	}

	public String toString()
	{
		String output = "";
		for(String word : list)
		{
			output += word + " ";
		}
		return output;
	}
}