package com.anil;

class kanyaji {
	public int a=10;
	public  static int b=20;
	public void getdata()
	{
	System.out.println("value of a ::"+a);	
	System.out.println("value of b ::"+b);
	

}}
class kanya
{
	public static void main(String args[])
	{
		kanyaji obj1=new kanyaji();
		obj1.getdata();
		obj1.a=15;
		obj1.b=25;
		kanyaji obj2=new kanyaji();
		obj2.getdata();
	}
}
