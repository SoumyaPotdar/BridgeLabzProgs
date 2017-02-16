package com.BridgeLabz;

import java.util.Scanner;

public class ParanthesisMainClass {
	private int maxSize;
	private long[] stackArray;
	private int top;

//own implementation for stack class
	public ParanthesisMainClass(int s)
	{
		maxSize = s;
		stackArray = new long[maxSize];
		top = -1;
	}
	public void push(long j) {
		stackArray[++top] = j;
	}
	public long pop() {

		return stackArray[top--];
	}
	public long peek() {
		return stackArray[top];
	}
	public boolean isEmpty() {
		return (top == -1);
	}
	public boolean isFull() {
		return (top == maxSize - 1);
	}


	public static void main(String[] args)
	{
		int flag=1,flag1=1, i=0;
		char d='y';
		Scanner scn=new Scanner(System.in);

		do
		{
			System.out.println(" enter the airhtematic expresssion ");
			String s=scn.next();

			flag=1;
			flag1=1;

			ParanthesisMainClass p=new ParanthesisMainClass(s.length());

			char sa[]=new char[s.length()];
			sa=s.toCharArray();

			for ( i = 0; i <sa.length; i++) 
			{
				//condition to check first it is a[0] is clsoing paranthesis or not
				if(sa[0]==')'||sa[0]==']'||sa[0]=='>'||sa[0]=='}')
				{
					System.out.println("not balanced");  
					System.exit(0);
				}
				// System.out.println(sa[i]);	
				if(sa[i]=='('||sa[i]=='['||sa[i]=='<'||sa[i]=='{')
				{
					flag=0;

					p.push(sa[i]);
				}

				else if(sa[i]==')'||sa[i]==']'||sa[i]=='>'||sa[i]=='}')
				{
					long h = p.pop();

					if(sa[i]==')')
					{
						h=h+1;
					}
					else
					{
						h=h+2;
					}
					if(h-sa[i]!=0)
					{
						flag1=0;
						System.err.println("not  balanced");

					}
				}

			}if(flag==1)
			{
				System.out.println("it doesnt contain any paranthesis");
			}
			else if (flag1!=0)
			{
				System.out.println("balanced");
			}
			System.out.println("Do you want conitnue?,press y or n");
			d=scn.next().charAt(0);
		}while(d=='y'||d=='Y');
		scn.close();
		System.out.println("Thank you");


	}
	
}


