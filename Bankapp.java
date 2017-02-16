package com.BridgeLabz;

import java.util.Scanner;

public class Bankapp 
{
   public static void main(String[] args) 
   {
	   Scanner sc= new Scanner(System.in);
	   CashCounter c=new CashCounter();
	   BankQ  b=new BankQ();
	   System.out.println("Press 0 to enter the queue");
	   int n=sc.nextInt();
	 
	   if(n==0)
	   b.enter();
	   int x=b.size();
	   System.out.println("Queue size is "+x);
	   
		
	  
   }
}
