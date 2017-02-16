package com.BridgeLabz;
import java.util.Scanner;
public class QueueMain 
{
	public static void main(String[] args)
	{    
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
  	    int n=sc.nextInt();

		
		Queue q1=new Queue(n);
		System.out.println("Enter the elements");
       for(int i=0;i<q1.size();i++)
       {
    	  int t=sc.nextInt();
    	  q1.enQueue(t);
       }
       boolean b=q1.isEmpty();
       System.out.println(b);

        System.out.println("Queue size is "+q1.size());
        while(!q1.isEmpty())
        {
          	 System.out.println(q1.deQueue());
          	 
        }
          b=q1.isEmpty();
          System.out.println(b);
	}
}
