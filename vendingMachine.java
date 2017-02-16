package com.BridgeLabz;
import java.util.Scanner;
public class vendingMachine 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
	   int amt=sc.nextInt();
	   int q=0;
	   int r=0;
	   int t=amt;
	   int sum=0;
	   if(t==0)
	   System.out.println("no change available for this amt");
	   else
	   {
	 
	    if(t>=1000)
	    {
		   q=t/1000;
		    r=t%1000;
		       System.out.println("number ofthousand rs notes = " + q+ "				" + q+ "* 10  ");
		       t=r;
			   sum=sum+q;
		    
	   }
	   
	    if(t>=500)
	    {	
	    	q=t/500;
	    	r=t%500;
	       System.out.println("number of five hundred rs notes = " + q+ "		" + q+ "* 500");
	       t=r;
		   sum=sum+q;
	    }
	    if(t>=100)
	    {
	   	q=t/100;
	    	r=t%100;
	       System.out.println("number of hundred rs notes = " + q+ "				" + q+ "* 100");
	       t=r;
		   sum=sum+q;
	    }
	    if(t>=50)
	    {
	 	q=t/50;
	    	r=t%50;
	       System.out.println("number of fifty rs notes = " + q+ "				" + q+ "* 50");
	       t=r;
		   sum=sum+q;
	    }
	    if(t>=20)
	    {
	  	q=t/20;
	   	r=t%20;
	       System.out.println("number of Twentys rs notes = " + q+ "				" + q+ "* 20  ");
	       t=r;
		   sum=sum+q;
	    }
	    if(t>=10)
	    {
	    	q=t/10;
	    	r=t%10;
	       System.out.println("number of ten rs notes = " + q+ "				" + q+ "* 10  ");
	       t=r;
		   sum=sum+q;
	    }
	    if(t>=5)
	    {
	   	q=t/5;
	r=t%5;
	       System.out.println("number of five  rs notes = " + q+ "				" + q+ "* 5 ");
	       t=r;
		   sum=sum+q;
	    }
	    if(t>=2)
	    {
	  	q=t/2;
	    	r=t%2;
	       System.out.println("number of two rs notes = " + q+ "				" + q+ "* 2 ");
	       t=r;
		   sum=sum+q;
	    }
	    if(t==1)
	    {
	   	q=t/1;  
	    	r=t%1;
	       System.out.println("number one rs notes = " + q+ "					" + q+ "* 1");
		   sum=sum+q;
	    }
	    
	    System.out.println("..................................................");
	    System.out.println("Total no of denominations =  "+ sum);
	   }
	}
	
	
   
}
