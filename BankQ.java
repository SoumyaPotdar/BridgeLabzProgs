package com.BridgeLabz;

public class BankQ 
{
   int count=0;
   
   public void enter()
   {
	   count++;
   }
   
   public int exit()
   {
	   count--;
	   return count;
			   
   }
   public int size()
   {
	   return count;
   }
   
   public boolean full()
   {
	   return count==10;
   }
   
   public boolean isEmpty()
   {
	   return count==0;
   }
}
