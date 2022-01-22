package com.bajaj.day4;

import java.util.Scanner;

//Object Oriented Language
//Java 1.8 force us to do the functional programming
class Calc
{
	int a;
	int b;
	public void sum(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void substraction(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
	}
}
//two lambda functions are not allowed in one interface
@FunctionalInterface
interface FunctionType
{
	//code has behaviour here
	public void execute();
}
interface Type1
{
	public void EvenOdd(int num);
}
public class MyLambda 
{
	public static void main(String args[])
	{
		//Function Programming-->lambda function(->) symbol
		int a=10;
		//storing function(behaviour of code) in the variable
		//no need for access specifier
		//no need to give return type like void or int,etc
		//no need for a function name
		//single line code
		//it has implementation here
//		FunctionType code=() -> System.out.println("Hello World");
//		code.execute();
		String str="montu";
		FunctionType c1=() -> System.out.println(str.toUpperCase());
		c1.execute();
		//Even and odd
	    Type1 sum= num -> {
	    	if(num%2==0)
	    	System.out.println("Even");
	    	else
	    	System.out.println("Odd");
	    };
	    sum.EvenOdd(4);
	    //Positive or negative
	    Type1 pos= num -> {
	    	if(num>0)
	    		System.out.println("Positive");
	    	else
	    		System.out.println("negative");
	    };
	    Scanner sc=new Scanner(System.in);
	   
	    System.out.println("Enter your number");
	    int m=sc.nextInt();
	    pos.EvenOdd(m);

	}

}
