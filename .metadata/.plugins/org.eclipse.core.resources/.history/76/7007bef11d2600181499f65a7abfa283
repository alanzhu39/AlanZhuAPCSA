//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Class
{
	private String name;
	private Student[] studentList;
	
	public Class()
	{
		name="";
		studentList=new Student[0];
	}
	
	public Class(String nameIn, int stuCount)
	{
		name = nameIn;
		studentList = new Student[stuCount];
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList[stuNum] = s;
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		for(Student stu : studentList)
		{
			classAverage += stu.getAverage();
		}
		classAverage /= studentList.length;
		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList[stuNum].getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		int stuNum = -1;
		for(int index = 0; index < studentList.length; index++)
		{
			if(studentList[index].getName().equals(stuName))
			{
				stuNum = index;
			}
		}
		return studentList[stuNum].getAverage();
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList[stuNum].getName();
	}

	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		String hName ="";
		for(int index = 0; index < studentList.length; index++)
		{
			if(studentList[index].getAverage() > high)
			{
				high = studentList[index].getAverage();
				hName = studentList[index].getName();
			}
		}
		return hName;
	}

	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		String hName ="";		
		for(int index = 0; index < studentList.length; index++)
		{
			if(studentList[index].getAverage() < low)
			{
				low = studentList[index].getAverage();
				hName = studentList[index].getName();
			}
		}
		return hName;
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for(Student stu : studentList)
		{
			if(stu.getAverage() < failingGrade)
			{
				output += stu.getName() + " ";
			}
		}
		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";
		for(Student stu : studentList)
		{
			output += stu.getName() + " = " + stu.toString() + "\t" + stu.getAverage() + "\n";
		}
		return output;
	}  	
}