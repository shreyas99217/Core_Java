package com.jsp;

import java.util.Scanner;

public class Ex1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int a[]=new int[sc.nextInt()];
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]+" ") ;

		}
	}
}
