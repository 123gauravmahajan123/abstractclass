package com.anil;
class yahoo2 implements Runnable
{
	
		public void run()
		{
try {
	for(int i=1;i<=5;i++)
	{
		System.out.println(Thread.currentThread()+"::"+i);
		Thread.sleep(5000);
	}}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
}}

public class mythread2 {

	public static void main(String args[]) {
		Thread obj1=new Thread(new yahoo2());
		obj1.setName("Thread A");
		obj1.start();
		Thread obj2=new Thread(new yahoo2());
		obj2.setName("Thread B");
		obj2.start();
		
	}

}
