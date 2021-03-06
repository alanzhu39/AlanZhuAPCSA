//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Objects;

public class RomanNumeral
{
	private Integer number;
	private String roman;
	private boolean status;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		setRoman(str);
	}

	public RomanNumeral(Integer orig)
	{
		setNumber(orig);
	}

	public void setNumber(Integer numb)
	{
		status = true;
		number = numb;
		String rom = "";
		for(int index = 0; index < NUMBERS.length; index++)
		{
			if(NUMBERS[index] <= numb)
			{
				rom = rom + LETTERS[index];
				numb = numb - NUMBERS[index];
				index = -1;
			}
		}
		roman = rom;
	}

	public void setRoman(String rom)
	{
		status = false;
		roman = rom;
		int num = 0;
		for(int index = 0; index < LETTERS.length; index++)
		{
			if(rom.length() == 1 || rom.length() == 0)
			{
				if(Objects.equals(rom,LETTERS[index]))
				{
					num = num + NUMBERS[index];
					rom = rom.substring(LETTERS[index].length());
					index = -1;
				}
			}
			else if(rom.length() == 2)
			{
				if(LETTERS[index].length() == 2)
				{
					if(rom.equals(LETTERS[index]))
					{
						num = num + NUMBERS[index];
						rom = rom.substring(LETTERS[index].length());
						index = -1;
					}
				}
				else
				{
					if(rom.substring(0,LETTERS[index].length()).equals(LETTERS[index]))
					{
						num = num + NUMBERS[index];
						rom = rom.substring(LETTERS[index].length());
						index = -1;
					}
				}
			}
			else if(Objects.equals(rom.substring(0,LETTERS[index].length()),LETTERS[index]))
			{
				num = num + NUMBERS[index];
				rom = rom.substring(LETTERS[index].length());
				index = -1;
			}
		}
		number = num;
	}

	public Integer getNumber()
	{
		return number;
	}

	public String toString()
	{
		String output = "";
		if(status)
		{
			output = getNumber() + " is " + roman;
		}
		else
		{
			output = roman + " is " + getNumber();
		}
		return output;
	}
}