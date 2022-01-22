package com.bajaj.day4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//Map-->interface. do not take non primitive objects. can store 2 dimensional array
//LinkedHashMap-->has internal linked list structure
public class MyMap {

	public static void main(String[] args) 
	{
		//Map<Integer,String> map=new Hashtable<Integer, String>();
		//Map<Integer,Student> map=new LinkedHashMap<Integer, Student>();
		//Map<Integer,String> map=new HashMap<Integer, String>();
		Map<Integer,String> map=new LinkedHashMap<Integer, String>();
		map.put(8, "a");
		map.put(2, "b");
		//Keys cannot be duplicated in LinkedHashMap
		map.put(9, "c");
		map.put(4, "d");
		map.put(5, "e");
//		map.put(1,new Student(8,"Pooja",2000));
//		map.put(2,new Student(3,"Priya",20000));
//		map.put(3,new Student(1,"Jiya",3000));
//		map.put(4,new Student(9,"Zee",20));
//		map.put(5,new Student(10,"Ayush",200));
		System.out.println(map);
		//retrieve key as set
//		Set<Integer> keys=map.keySet();
//		for(int str:keys)
//		{
//			System.out.println("key as"+str+"value"+map.get(str));
//		}
//		Collection<Student> values=map.values();
//		for(Student s1:values)
//		{
//			System.out.println(s1);
//		}
//		map.containsKey(keys);
		
		
		
	}

}
