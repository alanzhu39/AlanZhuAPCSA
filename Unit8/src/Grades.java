//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	//instance variables
	private int length;
	private double[] grades = new double[length];

	//constructor
	public Grades(int len, double[] nums)
	{
		setGrades(len,nums);
	}


	//set method
	public void setGrades(int len, double[] nums)
	{
		length = len;
		grades = nums;
	}


	private double getSum()
	{
		double sum=0.0;
		for(double item : grades)
		{
			sum = sum + item;
		}
		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		average = getSum()/length;
		return average;
	}


	//toString method
	public String toString()
	{
		String output = "";
		for(int index = 0; index < grades.length; index++)
		{
			output = output + "grade " + index + " :: " + grades[index] + "\n";
		}
		output = output + "\naverage = " + String.format("%.2f", getAverage()) + "\n";
		return output;
	}

}