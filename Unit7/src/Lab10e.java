//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		GuessingGame test = new GuessingGame(0);
		test.playGame();
		System.out.println();
		System.out.println("Do you want to play again? ");
		response = keyboard.next().charAt(0);
		while(response == 'y')
		{
			test.playGame();
			System.out.println();
			System.out.println("Do you want to play again? ");
			response = keyboard.next().charAt(0);
		}
	}
}