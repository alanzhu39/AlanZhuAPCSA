//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab14i
{
	public static void main( String args[] )
	{
		RomanNumeral test = new RomanNumeral(10);
		out.println(test.toString());

		test.setNumber(100);
		out.println(test.toString());

		test.setNumber(1000);
		out.println(test.toString());
		test.setNumber(2500);
		out.println(test.toString());
		test = new RomanNumeral(1500);
		out.println(test.toString());
		test.setNumber(23);
		out.println(test.toString());
		test.setNumber(38);
		out.println(test.toString());
		test.setNumber(49);
		out.println(test.toString());
		test.setRoman("LXXVII");
		out.println(test.toString());
		test.setRoman("XLIX");
		out.println(test.toString());
		test.setRoman("XX");
		out.println(test.toString());
		test.setRoman("XLIX");
		out.println(test.toString());	}
}