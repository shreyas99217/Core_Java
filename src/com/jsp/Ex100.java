package com.jsp;

import java.util.Scanner;

public class Ex100 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int r=sc.nextInt();
	int c=sc.nextInt();
	for(int i=1; i<=5; i++)
	{
		for(int j=1; j<=5; j++)
		{
			System.out.print( "*"+"  ");
		}
			System.out.println();
	}
}
}
