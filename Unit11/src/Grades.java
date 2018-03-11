//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grades
{
	private double[] grades;
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{
		String[] temp = gradeList.split("\\s");
		int size = Integer.parseInt(temp[0]);
		grades = new double[size];
		for(int index = 2; index < temp.length; index++)
		{
			grades[index - 2] = Double.parseDouble(temp[index]);
		}
	}
	
	public void setGrade(int spot, double grade)
	{
		grades[spot] = grade;
	}
	
	public double getSum()
	{
		double sum=0.0;
		for(double grade : grades)
		{
			sum += grade;
		}
		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		for(double grade : grades)
		{
			if(grade < low)
			{
				low = grade;
			}
		}
		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		for(double grade : grades)
		{
			if(grade > high)
			{
				high = grade;
			}
		}
		return high;
	}
	
	public int getNumGrades()
	{
		return grades.length;
	}
	
	public String toString()
	{
		String output="";
		for(double grade : grades)
		{
			output += Double.toString(grade) + " ";
		}
		return output;
	}	
}