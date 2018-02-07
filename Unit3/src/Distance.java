//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first x coordinate :: ");
		xOne = sc.nextInt();
		System.out.println("Enter the first y coodinate :: ");
		yOne = sc.nextInt();
		System.out.println("Enter the second x coordinate :: ");
		xTwo = sc.nextInt();
		System.out.println("Enter the second y coordinate :: ");
		yTwo = sc.nextInt();
		calcDistance();
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		
	}

	public void calcDistance()
	{
		distance = Math.sqrt(Math.pow(xTwo - xOne,2) + Math.pow(yTwo - yOne, 2));
	}

	public void print( )
	{
		System.out.printf("distance == %.3f\n",distance);
	}
}