package com.anil;
class yahoo extends Thread{
public yahoo(String value)
{
	super (value);
}
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
public class mythread1 {

	public static void main(String[] args) {
		yahoo myobject1=new yahoo("thread -a");
		myobject1.start();
		yahoo myobject2= new yahoo("thread -b");
		myobject2.start();

	}

}
