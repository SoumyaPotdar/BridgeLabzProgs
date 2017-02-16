   package com.BridgeLabz;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=sc.next();
		char c[]=st.toCharArray();             
		int n= c.length;
		
		Dequeue q=new Dequeue(n);
		for(int i=0;i<n;i++)
		{
			q.addRare(c[i]);
		}
		
		System.out.println(q.size());
		
		String s="";
		for(int i=0;i<n;i++)
		{
		char t=q.removeRear();
		s=s+t;
		}
		
		System.out.println("given string  "+st);
		System.out.println("reversed string  "+s);
		
		if(st.equals(s))
		System.out.println("given string is palindrome");
		else
		System.out.println("given string is not palindrome");
	}
}
