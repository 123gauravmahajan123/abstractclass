package com.anil;
class z{
	public void getdata()
	{
		System.out.println("class z>> getdata1");
	}
}
class y extends z
{
	public void getdata2()
	{
		System.out.println("class y>> getdata2");
	}
}
  final class x extends y
{
	public void getdata3()
	{
		System.out.println("class x>> getdata3");
	}
}
public class sandhya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

y obj=new y();
obj.getdata();
obj.getdata2();
x obj2=new x();
obj2.getdata3();
	}

}
