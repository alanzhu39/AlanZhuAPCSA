//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("/Users/alanzhu39/Desktop/AlanZhuAPCSA/Unit12_18d/src/lab18d.dat"));

		int size = file.nextInt();
		Word[] words = new Word[size];
		for(int index = 0; index < words.length; index++)
		{
			Word test = new Word(file.next());
			words[index] = test;
		}
		for(int index1 = 0; index1 < words.length - 1; index1++)
		{
			int leastIndex = index1;
			for(int index2 = index1 + 1; index2 < words.length; index2++)
			{
				if(words[index2].compareTo(words[leastIndex]) < 0)
				{
					leastIndex = index2;
				}
			}
			Word temp = words[index1];
			words[index1] = words[leastIndex];
			words[leastIndex] = temp;
		}
		for(Word word : words)
		{
			System.out.println(word);
		}
	}
}