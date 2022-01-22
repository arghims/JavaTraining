package com.bajaj.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

//Comparator is one where we can send class a parameter and use its sorting functions
class Student
{
	int id;
	String name;
	int salary;
	Student(int id, String name, int salary)
	{
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Rollno=" + id + ", name=" + name + ", salary="+ salary+"]";
	}
	
}
public class ComparatorPractice
{
	public static void main(String args[])
	{
		//Set<Student> students=new TreeSet<Student>(new SortByID());
		Set<Student> students=new TreeSet<Student>(new SortByName());
		students.add(new Student(8,"Pooja",2000));
		students.add(new Student(3,"Priya",20000));
		students.add(new Student(1,"Jiya",3000));
		students.add(new Student(9,"Zee",20));
		students.add(new Student(10,"Ayush",200));
		//Collections.sort(students,new SortByID());
		 students.forEach(
		    		(str)->System.out.println(str)
		    		);
		
//		for(Student str:students)
//		{
//		System.out.println(str.toString());
//		}
	}


}
