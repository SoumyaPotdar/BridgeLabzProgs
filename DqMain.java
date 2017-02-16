package com.BridgeLabz;

import java.util.Scanner;

public class DqMain
{
    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the size of dequeue");
    	int n=sc.nextInt();
    	Dequeue d=new Dequeue(n);
    	System.out.println(d.size());

    	System.out.println("enter the string");
    	String s=sc.next();
    
    
    	char c[]= s.toCharArray();
    	System.out.println(d.size());
    	
    	for(int i=0;i<d.size;i++)
    	{
    		char t=c [i];
    		d.addFront(t);
    	  	System.out.print(d +" ");
    	}
    	
    	for(int i=0;i<d.size;i++)
    	{
    		char b=d.removeRear();
    		System.out.print(b);
    	}
    	System.out.println(d.size());

	}
}
