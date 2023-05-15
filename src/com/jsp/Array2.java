package com.jsp;

import java.util.Scanner;

public class Array2 
{
		public static void main(String[] args) {
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("enter size");
				int[] a=new int[sc.nextInt()];
				for(int i=0; i<a.length; i++)
				{
					System.out.println("enter data");
					a[i]=sc.nextInt();
				}
				for(int i=0; i<a.length; i++)
				{
					if(a[i]%2==0);
					System.out.println(a[i]);
					
				}
			}
		}
	}
