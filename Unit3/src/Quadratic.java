//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a :: ");
		a = sc.nextInt();
		System.out.println("Enter b :: ");
		b = sc.nextInt();
		System.out.println("Enter c :: ");
		c = sc.nextInt();
		calcRoots();
	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
		calcRoots();
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		rootOne = ((((-1) * b) + Math.sqrt((double)(b * b - 4 * a * c))) / (2 * a));
		rootTwo = ((((-1) * b) - Math.sqrt((double)(b * b - 4 * a * c))) / (2 * a));
 	}

	public void calcRoots( )
	{
		setEquation(a,b,c);
	}

	public void print( )
	{
		System.out.printf("rootone :: %.2f\n",rootOne);
		System.out.printf("roottwo :: %.2f\n",rootTwo);
		System.out.println();
	}
}