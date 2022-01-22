package com.bajaj.day4;
import java.util.*;

import java.util.Collections;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

class Details implements Comparable<Details>
{
	int ID;
	String name;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employees [employeeID=" + ID + ", name=" + name + "]";
	}
	public Details()
	{
		
	}
	public Details(int ID, String name)
	{
		super();
		this.ID=ID;
		this.name=name;
	}
	public Details(int ID)
	{
		super();
		this.ID=ID;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void update(List<Details> d,int ID)
	{
		Scanner sc=new Scanner(System.in);
		for(Details str:d)
		{
			if(str.ID==ID)
			{
				System.out.println("Enter new id");
				int id1=sc.nextInt();
				str.ID=id1;
			}
		}
		
	}
      public int compareTo(Details d2) 
      {
		
		if(this.ID>d2.getID())
		{
			return -1;
		}
		else if(this.ID<d2.getID())
		{
			return 1;
		}
		else
		{
		return 0;
		}

	}
	
}

public class MyEmployee {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
	 List<Details> ls=new ArrayList<Details>(4);
	 int id;
	 String name;
	while(true)
	{
	 int ch;
	 System.out.println("Enter choice");
	 ch=sc.nextInt();
	 //adding elements
	 switch(ch)
	 {
	 case 1:
	 for(int i=0;i<4;i++)
	 {
		System.out.println("Enter Employee Records");
		id =sc.nextInt();
		name=sc.next();
		Details ob=new Details(id, name);
	 ls.add(ob);
	 }
	 //Print elements
	 for(Details str:ls)
	 {
		 System.out.println(str.toString());
	 }
	 break;
	 case 2:
	 //Deletion using index
	 System.out.println("Enter the index to delete");
	 int index=sc.nextInt();
	 for(int i=0;i<ls.size();i++)
	 {
		 if(i==index)
		 {
		 ls.remove(i);
		 }
	 }
	 System.out.println(ls);
	 break;
	 case 3:
	//updation
	 
	 System.out.println("Enter the id to update");
	 int id1=sc.nextInt();
	 Details ob=new Details();
	 ob.update(ls,id1);
		for(Details str:ls)
		{
			
			System.out.println(str.toString());
		} 
	 break;
	 case 4:
		 //Sorting
		 Collections.sort(ls,Collections.reverseOrder());
		 for(Details str:ls)
		 {
		 System.out.println(str);
		 }
		 break;
	 
	 default: System.out.println("Wrong choice");
		   break;
	 }
	}

	}

}


//updation using an object as input
//append
//sorting list using function
//sorting list using compareTo