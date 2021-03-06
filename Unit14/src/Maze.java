//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;
import java.util.Arrays;

public class Maze
{
   private int[][] maze;
   private boolean exit = false;

	public Maze()
	{
	}

	public Maze(int size, String[] line)
	{
		maze = new int[size][size];
		for(int index = 0; index < size; index ++)
		{
			for(int a = 0; a < size; a++)
			{
				maze[index][a] = Integer.parseInt(line[index * size + (a)]);
			}
		}
		for(int[] arr : maze)
		{
			System.out.println(Arrays.toString(arr));
		}
	}

	public boolean hasExitPath(int r, int c)
	{
		if(maze[r][c] == 1)
		{
			if(c == maze.length - 1)
				exit = true;
			maze[r][c] = 0;
			if(r < maze.length - 1)
				hasExitPath(r + 1, c);
			if(r > 0)
				hasExitPath(r - 1, c);
			if(c < maze.length - 1)
				hasExitPath(r, c + 1);
			if(c > 0)
				hasExitPath(r, c - 1);
		}
		return exit;
	}

	public String toString()
	{
		String output="";
		if(hasExitPath(0,0))
			output = "exit found";
		else
			output = "exit not found";
		return output;
	}
}