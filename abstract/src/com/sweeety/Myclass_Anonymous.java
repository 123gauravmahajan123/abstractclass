package com.sweeety;

interface Mycontents1 {
	public String getdata();
}

class Myclass {
	public Mycontents1 getMyclassdata1() {
		return new Mycontents1() {
			private String data = "learning java";

			public String getdata() {
				return data;
			}
		};
	}
}

public class Myclass_Anonymous {
	public static void main(String args[]) {
		Myclass obj = new Myclass();
		System.out.println("anonymous class " + obj.getMyclassdata1().getdata());
	}
}
