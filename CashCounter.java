package com.BridgeLabz;
import java.util.Scanner;
import java.lang.Exception;

public class CashCounter
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int t=10;
	int count=0;

	Queue q=new Queue(t); 
	
	
		System.out.println("to enter the queue press 1");
	
		int op=sc.nextInt();
	
		if(op==1)
		{	 
			try
			{
			q.enQueue(count);
			System.out.println("size of queue "+q.size());
			}catch(ArrayIndexOutOfBoundsException e)
			{
			System.out.println("q is full wait fr some time");
			}
			System.out.println("size of queue "+q.size());
	    } 
	
		int d=1;
		double balance=10000.00;
		double amount=0;
		
	   do
	   {
			
			
			System.out.println("Press 1 to deposit");
			System.out.println("Press 2 to withdraw");
			System.out.println("Press 3 to check Balance");
			System.out.println("press 4 to enter the queue ");
			System.out.println("Enter the operation to be performed");
	        int val=sc.nextInt();
	        switch(val)
		    {
				case 1:
				{
					System.out.println("Enter the amount to be deposit");
					amount=sc.nextDouble();
					balance=balance+amount;
					System.out.println("Rs "+ amount +"deposited successfully...!!!!! ");
					System.out.println("Your current balance is Rs. "+ balance);
					System.out.println("Thank you........");
					int r=q.deQueue();
					System.out.println("size of queue "+q.size());
					break;
		        }
		
				case 2:
				{ 
					System.out.println("Enter the amount to be withdrawn");
					amount=sc.nextDouble();
					if(balance>amount&& balance>5000)
					{
						balance=balance-amount;
						System.out.println("Rs "+ amount +"withdwawn successfully...!!!!! ");
						System.out.println("Your current balance is Rs. "+ balance);
						System.out.println("Thank you........");
						int r=q.deQueue();
						System.out.println("size of queue "+q.size());
	                }
					else
					{
						System.out.println("withdwawn failed ..Insuffitient Balance...!!!!! ");
						System.out.println("Your current balance is Rs. "+ balance);
						System.out.println("Thank you........");
					}
					break;
				}
				case 3:
					{
						System.out.println("Your current balance is Rs. "+ balance);
						System.out.println("Thank you........");
                        break;
					}
				case 4:
					{   
						try
						{
						q.enQueue(count);
						System.out.println("size of queue "+q.size());
						}catch(ArrayIndexOutOfBoundsException e)
						{
						System.out.println("queue is full wait fr some time");
						}
						break;
					}
				default:
					{
						System.out.println("Enter proper choice");
						break;
					}
	        }
		    System.out.println("Enter 1 to contine");
		    d=sc.nextInt();
		} while(d==1);
	
	
	}


	
	}

