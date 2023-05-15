package com.jsp;

import java.util.Scanner;

public class Ex_9
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int a[]=new int[] {1,-2,-3,-4,-5};
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<0)
			{
				System.out.println(a[i]);

			}
		}
	}
}
