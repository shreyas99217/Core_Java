package com.jsp;

public class Primerry 
{
	public static void main(String[] args)
	{
		int[]a= {21,43,16,7,18};
		for(int i=0; i<a.length; i++)
		{
			isPrime(a[i]);
		}
	}
	public static void isPrime(int a)
	{
		int count=0;
		for(int i=1; i<=a; i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(a);

		}
	}

}
