package com.BridgeLabz;

public class Dequeue 
{
	int rear;
	int size;
	int front;
	char[] dq;
	
	Dequeue(int n)
	{
		size=n;
		front=-1;
		rear=-1;
		dq= new char[size];
	}
     
	public void addFront(char c)
	{
	    for(int i=rear+1;i>0;i--)
	    {
	    	dq[i]=dq[i-1];
	    }
	    ++rear;
	    dq[0]=c;
	}
	    
	    public void addRare(char c)
	    {
	    	++rear;
	    	dq[rear]=c;
	    }
	
	  public char removeFront()
	  {
		  char t=dq[0];
		  for(int i= 0;i<=rear;i++)
		  {
			  dq[i]=dq[i+1];
		  }
		  rear--;
		  return t;
	  }
	
	  public char removeRear()
	  {
		  char t=dq[rear];
		  rear--;
          return t;
      }  

	  public int size()
	  {
		  return rear+1;
	  }
}
