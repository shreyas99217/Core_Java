
	package com.jsp;

	import java.util.Scanner;

	public class Ex_14
	{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			int a[]=new int[5];
			for(int i=0; i<a.length; i++)
			{
				a[i]=sc.nextInt();
			}
			for(int i=0; i<a.length; i++)
			{
				int count=1;
				for(int j=i+1; j<a.length; j++)
				{
					if(a[i]==a[j])
					{
						count++;
					}
				}
				if(count>1)
					System.out.println(a[i]+" ");
			}
			
		}
	}

