
package com.jsp;

public class Ex_12 
{
	public static void main(String[] args)
	{
		String s[]={"i","love","coding","i","love"};
		for(int i=0; i<s.length; i++)
		{
			int count=1;
			if(s[i]!=null)
				for(int j=i+1; j<s.length; j++)
				{
					if(s[i].equals(s[j]))
					{
						count++;
						s[j]=null;
					}
				}
			if(count>1)
				System.out.println(s[i]+ " ");
		}
	}
}
