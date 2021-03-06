//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;

public class Student implements Comparable
{
	private String myName;
	private Grades myGrades;
	
	public Student()
	{
		setName("");
		setGrades("");
	}
	
	public Student(String name, String gradeList)
	{
		setName(name);
		setGrades(gradeList);
	}
	
	public void setName(String name)
	{
		myName = name;
	}	
	
	public void setGrades(String gradeList)
	{
		myGrades = new Grades(gradeList);
	}
	
	public void setGrade(int spot, double grade)
	{
		myGrades.setGrade(spot, grade);
	}

	public String getName()
	{
		return myName;
	}
	
	public int getNumGrades()
	{
		return myGrades.getNumGrades();
	}

	public double getSum()
	{
		return myGrades.getSum();
	}
	
	public double getAverage()
	{
		return Math.round(((myGrades.getSum() / myGrades.getNumGrades()) * 100.0))/100.0;
	}

	public double getAverageMinusLow()
	{
		return (myGrades.getSum() - myGrades.getLowGrade()) / (myGrades.getNumGrades() - 1);
	}
	
	public double getHighGrade()
	{
		return myGrades.getHighGrade();
	}
	
	public double getLowGrade()
	{
		return myGrades.getLowGrade();	
	}
	
	public String toString()
	{
		return myName + " = " + myGrades.toString();
	}
	
	public int compareTo(Object o)
	{
		Student stu = (Student)o;
		if(getAverage() < stu.getAverage())
		{
			return -1;
		}
		else if(getAverage() > stu.getAverage())
		{
			return 1;
		}
		return 0;
	}
	
	public boolean equals(Student stu)
	{
		if(!getName().equals(stu.getName()))
		{
			return false;
		}
		else if(getAverage() != stu.getAverage())
		{
			return false;
		}
		return true;
	}
}