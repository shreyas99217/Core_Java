package com.jsp;

import java.util.Scanner;

public class DuplicateNumber 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int[]a=new int[size];
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0; i<a.length; i++)
		{
			// 1 = 4 true
			if(i!=a.length-1)
			{
				// 1 != 0 true
				if(a[i]!=0)
				{
//					j = i + 1; = 2 true
					for(int j=i+1; j<a.length; j++)
					{ 
//						a[i] == a[j] false
						
						if(a[i]==a[j])
						{
							a[j]=0;
							System.out.println(a[j]);

						}
					}
				}
			}
		}
		
		for (int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				System.out.println(a);
			}
		}
	}
}
