package com.BridgeLabz;

import java.util.Scanner;

public class Stopwatch 
{ 
	long start;
	long end;
	long dTime;
	
	public void startTimer()
	{
		start=System.currentTimeMillis();
	}
	
	public void stopTimer()
	{
		end=System.currentTimeMillis();
	}
   
	public long timeElapsed()
	{
	dTime=end-start;
	return dTime;
	}
	public static void main(String[] args) 
	{
		Stopwatch sw=new Stopwatch ();
		Scanner sc=new Scanner(System.in);
		System.out.println("Press key to start");
		sc.nextLine();
		
		sw.startTimer();
		
		System.out.println("Press key to stop");
		sc.nextLine();
		
		sw.stopTimer();
		
		
		
		System.out.println("time elapsed is "+ sw.timeElapsed()+ "millis");
		System.out.println("time elapsed in secs "+ sw.timeElapsed()/1000+ "sec");
	}
	
}
