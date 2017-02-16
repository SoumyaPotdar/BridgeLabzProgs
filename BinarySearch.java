package com.BridgeLabz;
import java.util.Scanner;
class BinarySearch
{
   public static void main(String args[])
   {
      int n,key, a[], first, last, mid;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number of elements:");
      n =sc.nextInt(); 
      System.out.println("Enter the elements:");
      a = new int[n];
      for (int i = 0; i < n; i++)
    	  a[i]=sc.nextInt(); 
      
      System.out.println("Enter the element to be searched:");
      key=sc.nextInt(); 
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

      }
   }
}
      

     
