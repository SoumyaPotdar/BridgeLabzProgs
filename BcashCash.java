package com.BridgeLabz;

import java.util.Scanner;

public class BcashCash
{
	
	int d=1;
	double balance=10000.00;
	double amount=0;
	
	do
	{
		
		
		System.out.println("Press 1 to deposit");
		System.out.println("Press 2 to withdraw");
		System.out.println("Press 3 to check Balance");
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
	}
	break;
	default:
		System.out.println("Enter proper choice");
		break;
	}
    System.out.println("Enter 1 to contine");
    d=sc.nextInt();
	}while(d==1);
	
	
	}

}
