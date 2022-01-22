package com.bajaj.day4;

import java.util.Collections;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class MyCollection
{
	public static void main(String args[])
	{
		//List is parent class creating a child reference to parent class
		//array list
		List<String> ls=new ArrayList<String>();
		//ls.add()
		//ls.remove("A")
		//ls.contains()
		//ls.clear()
		//ls.isEmpty()
		
		ls.add("ABC");
		ls.add("Priya");
		ls.add("Kasturi");
		//Collections.sort(ls/*,Collections.reverseOrder()*/);
		System.out.println(ls);
		ls.remove("Priya");
		for(String str:ls)
		{
			System.out.println(str);
		}
		//List<String> ls=new LinkedList<String>();
		//List<String> ls=new Stack<String>()
		//List<String> ls=new Vector<String>();
	}

}
