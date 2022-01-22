package com.bajaj.day4;

import java.util.Comparator;

public class SortByName implements Comparator<Student> 
{
	public int compare(Student a, Student b)
	{
		return a.getName().compareTo(b.getName());
	}

}