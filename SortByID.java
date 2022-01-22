package com.bajaj.day4;

import java.util.Comparator;

public class SortByID implements Comparator<Student> 
{
	public int compare(Student a, Student b)
	{
		return a.id - b.id;
	}

}
