package com.bajaj.day4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//StreamApi is a class in java used to filter and map the data. Works for arrays, lists and collections
//1,2,3,4,5,6,7,8,9
//they are faster in doing operations.
class Info
{
	private int rollno;
	private String name;
	private int fees;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Info [rollno=" + rollno + ", name=" + name + ", fees=" + fees + "]";
	}
	Info(int rollno,String name,int fees)
	{
		this.rollno=rollno;
		this.fees=fees;
		this.name=name;
	}
	
	
	
	
}


public class MyStreamApi 
{
	public static void main(String args[])
	{
		List<Info> ls=new ArrayList<Info>();
		ls.add(new Info(1,"Himanshi",200000));
		ls.add(new Info(2,"Adi",3000));
		ls.add(new Info(3,"Jai",500));
		ls.add(new Info(4,"Kiran",10000));
		
		List<String> ls1=ls.stream()
				.filter(s1->s1.getFees()>500)
				.map(s->s.getName().toUpperCase())
				.collect(Collectors.toList());
				ls1.forEach(s->System.out.println(s));
		
		List<String> ls2=ls.parallelStream()
				.filter(s1->s1.getName().startsWith("A"))
				.map(s->s.getName().toUpperCase())
				.collect(Collectors.toList());
				ls2.forEach(s->System.out.println(s));
				
		
		//Stream is created with null or empty list
//		Stream<String> stream=Stream.empty();
		
		Collection<Integer> collections=Arrays.asList(500,200,300);
//		List<Integer> ls=new ArrayList<Integer>();
//		ls.add(100);
//		ls.add(200);
//		ls.add(300);
		//collections.forEach(str->System.out.println(str));
		
		Stream<Integer> streamofCollection=collections.stream();
		//Optional<Integer> s=streamofCollection.max((i,j)->i.compareTo(j));
		//System.out.println(s.get());
		List<Integer> ls3=streamofCollection.sorted().collect(Collectors.toList());
		ls3.forEach(s->System.err.println(s));
		
		//		long count = streamofCollection
//		.filter(value->value==200)
//		.distinct()		To give unique values as result from set of values
//		.count();
//		//.forEach(s->System.out.println(s));
//		System.out.println(count);
//		
		
	}

}
