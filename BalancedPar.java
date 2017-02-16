package com.BridgeLabz;

import java.util.Scanner;
import java.util.Stack;

public class BalancedPar 
{
		public static void main(String[] args) 
		{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Expression");
		
		String s= sc.nextLine();
		char[] c= s.toCharArray();
		boolean b=s.isEmpty();
		
	    
		Stack st=new Stack();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]== '('||c[i]== '{'||c[i]== '[')
			{
				st.push(c[i]);
			}
			else if(c[0]=='}'||c[0]==']'||c[0]==')')
			{
				System.out.println("strint is not balanced");
				return; 
			}
			else if(c[i]== ')'||c[i]== '}'||c[i]== ']')
			{
				char t=(char)st.pop();
				if(c[i]==')'&& t=='('||c[i]=='}'&&t=='{'||c[i]==']'&&t=='[')
				{
					if(i==c.length-1)
						System.out.println("strint is balanced");

					else 
						System.out.println("strint is not balanced");
					    return;
				  }
			}
		}
	}

	}
