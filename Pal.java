package com.BridgeLabz;

import java.util.Scanner;

public class Pal
{
	public static void main(String[] args) 
	{ 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	
	String s= sc.nextLine();
	char[] ci= s.toCharArray();
	int k=ci.length;
	
	String st="";
    char[] co=new char[k];
	for(int i=0;i<ci.length;i++)
	{
		
	    co[i]=ci[k-1-i];
		st=st+co[i];
	}
	 System.out.println("reversed string  " +st);
     co=st.toCharArray();
   int count=0;
     
	for(int i=0;i<k;i++)
	{
		if(ci[i]==co[i])
		{
			count++;
		}
	}
			if(count==k)
			{
				System.out.println("palindrome");
			}
			else
			{
				System.out.println(" not palindrome");
			}
	 
		
	}
}
		

		