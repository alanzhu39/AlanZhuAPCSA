//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Lab15d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("/Users/alanzhu39/Desktop/AlanZhuAPCSA/Unit13/src/lab15d.dat"));
		int size = file.nextInt();
		file.nextLine();
		for(int i = 0; i < size; i ++)
		{
			String dat = file.nextLine();
			FancyWords test = new FancyWords(dat);
			System.out.println(test);
		}
	}
}