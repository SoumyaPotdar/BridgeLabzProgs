package com.BridgeLabz;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation 
{
	public static void main(String[] args) 
	{
		String st="soumya sachin vani pavan";
		FileWriter fw=null;
		try
		{
			fw=new FileWriter("/home/bridgeit/soumya/fileprog/FileOperation.txt");
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		try 
		{
			fw.write(st);
			fw.flush();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		
		FileReader fr=null;
		
		try 
		{
			fr=new FileReader("/home/bridgeit/soumya/fileprog/FileOperation.txt");
			 int x=fr.read();
			 while(x!=-1)
			 { 
				 char c=(char) x;
				 System.out.print(c);
				 x=fr.read();
			 }
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			try 
			{
				fw.close();
				fr.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		
		}
		
		
	}

}
