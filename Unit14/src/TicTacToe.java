//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
	}

	public TicTacToe(String game)
	{
		mat = new char[3][3];
		for(int r = 0; r < 3; r++)
		{
			for(int c = 0; c < 3; c++)
			{
				mat[r][c] = game.charAt(r * 3 + c);
			}
		}
	}

	public String getWinner()
	{
		for(int a = 0; a < 3; a++)
		{
			if(mat[a][0] == mat[a][1] && mat[a][0] == mat[a][2])
			{
				return mat[a][0] + "H";
			}
			if(mat[0][a] == mat[1][a] && mat[0][a] == mat[2][a])
			{
				return mat[0][a] + "V";
			}
		}
		for(int a = 0; a < 3; a++)
		{
			if(mat[0][a] == mat[1][a] && mat[0][a] == mat[2][a])
			{
				return mat[0][a] + "V";
			}
		}
		if((mat[0][0] == mat[1][1] && mat[0][0] == mat[2][2])||(mat[0][2] == mat[1][1] && mat[0][2] == mat[2][0]))
		{
			return mat[1][1] + "D";
		}
		return "  ";
	}

	public String toString()
	{
		String output="";
		for(char[] arr : mat)
		{
			for(char lett : arr)
			{
				output += lett + " ";
			}
			output += "\n";
		}
		if(getWinner().charAt(1) == ' ')
		{
			output += "cat's game - no winner!";
		}
		else
		{
			output += getWinner().charAt(0);
			if(getWinner().charAt(1) == 'D')
			{
				output += " wins diagonally!";
			}
			else if(getWinner().charAt(1) == 'H')
				output += " wins horizontally!";
			else if(getWinner().charAt(1) == 'V')
				output += " wins vertically!";
		}
		return output+"\n\n";
	}
}