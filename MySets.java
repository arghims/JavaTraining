package com.bajaj.day4;

import java.util.HashSet;
import java.util.Set;
//sets-->it is an interface. they are similar to lists but donot store order of elements during insertion
public class MySets 
{
	public static void main(String args[])
	{
	Set<String> s1=new HashSet<String>();
	s1.add("Pooja");
	s1.add("Priya");
	s1.add("Adi");
	s1.add("Himanshi");
	s1.add("Shivani");
	System.out.println(s1);
	if(s1.contains("babi"))
	{
		System.out.println("yes");
	}
	else
		System.out.println("NO");
	//System.out.println(s1.hashCode());
	
//	Object arr[]=s1.toArray();
//	for(int i=0;i<arr.length;i++)
//	{
//		System.out.println(arr[i]);
//	}
	
	
	}

}
