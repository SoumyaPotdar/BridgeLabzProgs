package com.BridgeLabz;
import java.io.File;
import java.io.IOException;

public class Demo2
{
	public static void main(String[] args) 
	{
		File f1=new File("/home/bridgeit/smita/try/m.txt");
		try 
		{
			f1.createNewFile();
		
		boolean b1=f1.exists();
		if(b1=true)
		{
		System.out.println("file exists");
	    }
		
		boolean b2=f1.canWrite();
		System.out.println("Can write to file?"+b1);
		 
		boolean b3=f1.canRead();
		System.out.println("Can reead ");
		
		System.out.println("remove write permission");
        f1.setWritable(false);
    
        System.out.println("Can write to file?"+b1);
		} catch (IOException e) 
		{
			e.printStackTrace();
		}

		 
		
		}
}