//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;

	public GuessingGame(int stop)
	{
		upperBound = stop;
	}

	public void playGame()
	{
		int guess = 0;
		int counter = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Guessing Game - how many numbers? ");
		upperBound = keyboard.nextInt();
		int answer = (int) Math.ceil(Math.random() * upperBound);
		while(guess != answer)
		{
			System.out.println("Enter a number between 1 and " + upperBound);
			guess = keyboard.nextInt();
			if(guess < 1 || guess > upperBound)
			{
				System.out.println("Number out of range!");
				continue;
			}
			else
			{
				counter++;
			}
		}
		System.out.println();
		System.out.println("It took " + counter + " guesses to guess " + answer);
		System.out.println("You guesses wrong " + (int)(((double)(counter-1)/(double)upperBound) * 100) + " percent of the time.");
		System.out.println();
	}

	public String toString()
	{
		String output="";
		return output;
	}
}