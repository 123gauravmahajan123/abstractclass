package com.sweeety;
class yahoo extends Thread{
	public yahoo(String value)
	{
		super(value);
	}
}

public class mythread {

	public static void main(String[] args) {
		System.out.println("my thread :: gm>>1");
		yahoo myobject =new yahoo("my thread");
		myobject.start();
		System.out.println("my thread :: gm>>2");
		
		

	}

}
