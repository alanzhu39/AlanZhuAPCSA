//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.FileNotFoundException;

public class GradeBookRunner
{
   public static void main( String args[] ) throws FileNotFoundException
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner keyboard = new Scanner(System.in);
		Scanner file = new Scanner(new File("/Users/alanzhu39/Desktop/AlanZhuAPCSA/Unit11/src/gradebook.dat"));
		String className = file.nextLine();
		int classSize = Integer.parseInt(file.nextLine());
		Class test = new Class(className,classSize);
		for(int index = 0; index < classSize; index++)
		{
			String stuName = file.nextLine();
			String grades = file.nextLine();
			Student stu = new Student(stuName, grades);
			test.addStudent(index, stu);
		}
		test.sort();
		System.out.println(test);
		System.out.println("Failure List = " + test.getFailureList(61.0));
		System.out.println("Highest Average = " + test.getStudentWithHighestAverage());
		System.out.println("Lowest Average = " + test.getStudentWithLowestAverage());
		System.out.println("Class Average = " + test.getClassAverage());
	}
}