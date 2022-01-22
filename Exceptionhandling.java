package com.bajaj.day4;
import java.io.*;
class CustomException extends Exception
{
	public CustomException(String message)
	{
		super(message);
	}
}
public class Exceptionhandling 
{
	public static void main(String args[]) throws FileNotFoundException
	{
		FileReader file=new FileReader("C:\\test\\a.txt");
		int a[]=new int[2];
		try
		{
			if(a.length==1)
			{
				a[0]=1;
			}
			else
			{
				throw new CustomException("There is no space in array ");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(a[0]);
		}

		finally
		{
			System.out.println("I am Final");
		}
	}

}
