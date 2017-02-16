package com.BridgeLabz;

public class Queue
{
	int front=0;
	int rear=-1;
	int size;
	int[] queue;

	Queue(int n)
	{  
		 size=n;
		 queue=new int[n];
	}
	
	public void enQueue(int x)
	{	
	  queue[++rear]=x;
	}
	
	public int size()
	{
		return rear+1;
	}
    
	public  int deQueue()
	{	
	 int t= queue[front];
	 for(int i=0;i<rear;i++)
	 {
		 queue[i]=queue[i+1];
	 }
	 rear--;
	 return t;
	}
	
	public boolean isEmpty()
	{
		return rear==-1;
	}
	
	
}
