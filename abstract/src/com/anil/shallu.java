package com.anil;
class aa {
private int a=10;
private final int b=20;
public  void setdata()
{
	a=20;
	
}
public void getdata()
{
	System.out.println("values"+a+"::"+b);
}
}


public class shallu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
aa obj=new aa();
obj.setdata();
obj.getdata();
	}

}
