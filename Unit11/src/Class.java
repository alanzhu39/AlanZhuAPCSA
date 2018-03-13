//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.Collections;

public class Class
{
	private String name;
	private ArrayList<Student> studentList;
	
	public Class()
	{
		name="";
		studentList=new ArrayList<Student>();
	}
	
	public Class(String nameIn, int stuCount)
	{
		name = nameIn;
		studentList = new ArrayList<Student>();
		for(int i = 0; i < stuCount; i++)
		{
			studentList.add(new Student("",""));
		}
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList.set(stuNum, s);
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage = 0.0;
		for(Student stu : studentList)
		{
			classAverage += stu.getAverage();
		}
		classAverage /= studentList.size();
		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList.get(stuNum).getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		int stuNum = -1;
		for(int index = 0; index < studentList.size(); index++)
		{
			if(studentList.get(index).getName().equals(stuName))
			{
				stuNum = index;
			}
		}
		return studentList.get(stuNum).getAverage();
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage()
	{
		sort();
		return studentList.get(studentList.size() - 1).getName();
	}

	public String getStudentWithLowestAverage()
	{
		sort();
		return studentList.get(0).getName();
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
	
	public void sort()
	{
		Collections.sort(studentList);
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