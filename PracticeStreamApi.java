package com.bajaj.day4;
import java.util.*;
import java.util.stream.Collectors;

class Consumer implements Comparable<Consumer>
{
	int id;
	String name;
	String email;
	int no_of_items;
	public Consumer(int id, String name, String email, int no_of_items)
	{
		this.id=id;
		this.name=name;
		this.email=email;
		this.no_of_items=no_of_items;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		// TODO Auto-generated method stub
		  if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        Consumer other = (Consumer) obj;
	        return Objects.equals(id, other.id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNo_of_items() {
		return no_of_items;
	}

	public void setNo_of_items(int no_of_items) {
		this.no_of_items = no_of_items;
	}

	@Override
	public String toString() {
		return "Consumer [id=" + id + ", name=" + name + ", email=" + email + ", no_of_items=" + no_of_items + "]";
	}
	public int compareTo(Consumer c2)
	{
		if(this.id>c2.getId())
		{
			return 1;
		}
		else if(this.id<c2.getId())
		{
			return -1;
		}
		else
		{
		return 0;
		} 
		
	}
	
	
}


public class PracticeStreamApi
{
	public static void main(String args[])
	{
	List<Consumer> ls=new ArrayList<Consumer>();
	ls.add(new Consumer(9,"Himanshi","him@gmail.com",2));
	ls.add(new Consumer(8,"Shreya","shregmail.com",4));
	ls.add(new Consumer(3,"Aditya","adi@gmail.com",1));
	ls.add(new Consumer(3,"Aditya","adi@gmail.com",1));
	ls.add(new Consumer(4,"Jai","jai!gmail.com",0));
	ls.add(new Consumer(2,"Tripti","trip@gmail.com",9));
	ls.add(new Consumer(1,"Amit","amit@gmail.com",3));
	//count
	         long c= ls.stream()
	        		 .filter(s->s.getName().startsWith("A"))
	        		 .count();
	         System.out.println(c);
	         System.out.println("****************");
	
	//filter based on no of items
	         ls.stream()
			.filter(s->s.getNo_of_items()>2)
	        .forEach(s->System.out.println(s));
	         System.out.println("****************");
	//filter based on wrong email id
	             ls.stream()
				.filter(s->s.getEmail().contains("@")==false)
		        .forEach(s->System.out.println(s));
	             System.out.println("****************");
	//mapping names with less than 4 products to upper case 
	             List<String> ls1=ls.stream()
					.filter(s->s.getNo_of_items()<4)
					.map(s->s.getName().toUpperCase())
					.collect(Collectors.toList());
	             ls1.forEach(s->System.out.println(s));
	             
	             System.out.println("****************");
	   
	             
			      
	//minimum id
			       
			       Optional<Consumer> s=ls.stream()
			    		            .min((i,j)->i.compareTo(j));
			       System.err.println(s);
			       System.out.println("****************");
	//maximum id
			       Optional<Consumer> s4=ls.stream()
	    		            .max((i,j)->i.compareTo(j));
	       System.err.println(s4);
	       System.out.println("****************");
				   
	//collector
	       
	       int total = ls.stream()
	    		   .collect(Collectors.summingInt(Consumer::getNo_of_items));
	       System.out.println(total);
	       System.out.println("****************");
    //group by to get distinct items 
	        ls.stream()
	       .collect(Collectors.groupingBy(a->a.getId()))
	       .values()
	       .forEach(b->System.out.println(b));
	        System.out.println("****************");
	//distinct
	        ls.stream().map(c1->c1.getId()).distinct().forEach(b->System.out.println(b));
	        System.out.println("****************");
    //sort
				   
				   List<Consumer> ls3=ls.stream()
						   .sorted()
						   .collect(Collectors.toList());
					ls3.forEach(s2->System.err.println(s2));
					
					System.out.println("****************");
	
	
	}
}



