//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab08g
{
	public static void main ( String[] args )
	{
		//add test cases
		LoopStats myLoop = new LoopStats(1,5);
		System.out.println(myLoop);
		System.out.println("total " + myLoop.getTotal());
		System.out.println("even count " + myLoop.getEvenCount());
		System.out.println("odd count " + myLoop.getOddCount());
		System.out.println();
		myLoop.setNums(2,8);
		System.out.println(myLoop);
		System.out.println("total " + myLoop.getTotal());
		System.out.println("even count " + myLoop.getEvenCount());
		System.out.println("odd count " + myLoop.getOddCount());
		System.out.println();
		myLoop.setNums(5,15);
		System.out.println(myLoop);
		System.out.println("total " + myLoop.getTotal());
		System.out.println("even count " + myLoop.getEvenCount());
		System.out.println("odd count " + myLoop.getOddCount());
	}
}