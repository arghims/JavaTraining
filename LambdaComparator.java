package com.bajaj.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product
{
	int pid;
	String pname;
	public Product(int pid,String pname)
	{
		super();
		this.pid=pid;
		this.pname=pname;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + "]";
	}
	
}

public class LambdaComparator 
{
	public static void main(String args[])
	{
		List<Product> ls=new ArrayList<Product>();
		ls.add(new Product(9,"comb"));
		ls.add(new Product(2,"lipstick"));
		ls.add(new Product(8,"compact"));
		ls.add(new Product(5,"serum"));
		ls.add(new Product(1,"cream"));
		
//		Collections.sort(ls,(p1,p2) -> {
//			return p1.pname.compareTo(p2.pname);
//		});
		Collections.sort(ls,(p1,p2) -> {
			return p1.pid - p2.pid;
		});
		for(Product p:ls)
		{
			System.out.println(p.toString());
		}
		
	}

	

}
