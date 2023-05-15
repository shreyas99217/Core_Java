package com.jsp;
import java.util.Scanner;
public class Array
{
	public static void main(String[] args) {
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter size");
			int[] a=new int[sc.nextInt()];
			System.out.println("enter data");
			for(int i=0; i<a.length; i++)
			{
				a[i]=sc.nextInt();
			}
			for(int i=0; i<a.length; i++)
			{
				System.out.println(a[i]);
				
			}
		}
	}
}

