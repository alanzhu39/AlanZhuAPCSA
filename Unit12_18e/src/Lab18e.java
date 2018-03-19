//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("/Users/alanzhu39/Desktop/AlanZhuAPCSA/Unit12_18e/src/lab18e.dat"));
		int size = file.nextInt();
		Word[] words = new Word[size];
		for(int index = 0; index < size; index++)
		{
			Word temp = new Word(file.next());
			words[index] = temp;
		}
		for(int index = 0; index < words.length - 1; index++)
		{
			int minIndex = index;
			for(int next = index + 1; next < words.length; next++)
			{
				if(words[next].compareTo(words[minIndex]) <= 0)
				{
					minIndex = next;
				}
			}
			Word temp = words[index];
			words[index] = words[minIndex];
			words[minIndex] = temp;
		}
		for(Word word : words)
		{
			System.out.println(word);
		}
	}
}