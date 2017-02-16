package com.BridgeLabz;

import java.util.Scanner;

public class DetailsofComp
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of companies to be added");
		 int n=sc.nextInt();
		 String[] st=new String[n];
		 int[] a=new int[n];
		 double[] b=new double[n];
		 int count=0;
		 double sum =0.0;
		 
		for (int i=0;i<n;i++)
		{
			System.out.println("Enter company name to be added");
			st[i]=sc.next();

			System.out.println("Enter no of stockes");
			a[i]=sc.nextInt();
	
			System.out.println("Enter stock value");
			b[i]=sc.nextDouble();
		}
		
		System.out.println("Company Details as follows....");
		for (int i=0;i<n;i++)
		{
			System.out.println("Company name  : "+ st[i]+ "\tNo of stocks :"+a[i]+ "\t\tStock value :"+b[i]+"\t total stock val="+ b[i]*a[i]) ;
			  count=count+a[i];		   
			  sum= sum+(b[i]*a[i]);

			
		}

	
		   System.out.println("....................................................................................................");
		   System.out.println("\t\tTotal no of stocks = " + count);
  	   System.out.println("\t\t\\tt\t\t\t\t\t  Total Stock value = "+ sum);
		
	}
}
