package com.BridgeLabz;

import java.io.File;
import java.util.Scanner;

public class Demo1 
{
	public static void main(String[] args) 
	{
		/*File f1=new File("/home/bridgeit/smita/try/t.pdf");
		boolean b1=f1.exists();
		if(b1!=true)
		{
			boolean b2=f1.mkdir();
			
			if(b2==true)
			{
			System.out.println("dir created");
			}
			else
			{
}
				System.out.println("die creation failed");
			}
		}
			
		else
		{
			System.out.println("dir exists");
			System.out.println("deleting it");
			f1.delete();
		}*/
		
		 /*  int n,key, a[], first, last, mid;
		   int i=0; 
		      Scanner sc = new Scanner(System.in);
		      System.out.println("Enter number of elements:");
		      n =sc.nextInt(); 
		      System.out.println("Enter the elements:");
		      a = new int[n];
		    
		      for ( i = 0; i < n; i++)
		    	  a[i]=sc.nextInt(); 
		      
		      System.out.println("Enter the element to be searched:");
		      key=sc.nextInt(); 
		      for ( i= 0; i < a.length; i++)
		      {
		    	  for (int j =i+1; j< a.length; j++)
		    			  {
		    		  		if(a[i]>a[j])
		    		  		{
		    		  			int t=a[i];
		    		  			a[i]=a[j];
		    		  			a[j]=t;
		    		  			
		    		  		}
		    			  }
		      }
		      System.out.println("sorted array");

		      for ( i = 0; i < n; i++)
		      {
		      System.out.print(a[i]+" ");
		      }
		     System.out.println();
		      first=0;
		      last=n-1;
		      mid=(first+last)/2;
		      while(first<=last)
		      {
		    	  if(a[mid]<key)
		    	  first=mid+1;
		    	  else if(a[mid]==key)
		    	  {
		    		  System.out.println(key +" found at index "+ mid);
		    		  System.out.println(key +" found at position "+ (mid+1));
		    		  break;
		    	  }
		    	  else
		    	  {
		    		  last=mid-1;
		    	  }
		    	  mid=(first+last)/2;
		      } 
		 
		      if(first>last)
		      {
				  System.out.println(key + " not found");

		      }*/
		
				int n,key, a[], first, last, mid;
				 int i=0; 
			      Scanner sc = new Scanner(System.in);
			      System.out.println("Enter number of elements:");
			      n =sc.nextInt(); 
			      System.out.println("Enter the elements:");
			      a = new int[n];
			    
			      for ( i = 0; i < n; i++)
			    	  a[i]=sc.nextInt(); 
			      
			      System.out.println("Enter the element to be searched:");
			      key=sc.nextInt(); 
			      for ( i= 0; i < a.length; i++)
			      {
			    	  for (int j =i+1; j< a.length; j++)
			    			  {
			    		  		if(a[i]>a[j])
			    		  		{
			    		  			int t=a[i];
			    		  			a[i]=a[j];
			    		  			a[j]=t;
			    		  			
			    		  		}
					    		 
			    			  }
			      }
			      
			      System.out.println("sorted array");

			      for ( i = 0; i < n; i++)
			      {
			      System.out.print(a[i]+" ");
			      }
			     System.out.println();
			     first=0;
			      last=n-1;
			      mid=(first+last)/2;
			     
			     int t=binarys(a,key,first,last);

	    		  System.out.println(key +" found at index "+ t);
	    		  System.out.println(key +" found at position "+ (t+1));
	}

             static int binarys(int ar[],int k,int f,int l)
			     {
            	   
			    	 if(f<l)
			    	 {
			    		 int m=(f+l)/2;
			    		 if(ar[m]<k)
			    		return binarys(ar, k, m+1, l);	
			    		 else if(ar[m]==k)
			    			 return m;
			    		 else 
			    			 return binarys(ar, k, f,m-1);	
			    	 }
			    	 
			         return -1;
			     }
	
	
			}
	