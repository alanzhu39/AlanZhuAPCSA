//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.util.Arrays;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("/Users/alanzhu39/Desktop/AlanZhuAPCSA/Unit14/src/lab21i.dat"));
		while(file.hasNextLine())
		{
			int size = Integer.parseInt(file.nextLine());
			String[] maze = file.nextLine().split("\\s");
			Maze test = new Maze(size, maze);
			test.hasExitPath(0, 0);
			System.out.println(test);
		}
	}
}