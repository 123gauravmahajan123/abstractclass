package com.sweeety;

class outer {
	private int i = 10;

	class innerclass1 {
		public innerclass1() {
			System.out.println("inner class constructor");
		}

		public void getinnerclass1data() {
			System.out.println("inner class 1 and value of i is" + i);
		}
	}

	public void getouterclassdata() {
		System.out.println("outer class calling");

		innerclass1 obj = new innerclass1();
		obj.getinnerclass1data();
	}
}

class myinnerclass_memberclass {

	public static void main(String[] args) {
		outer obj = new outer();
		obj.getouterclassdata();
		outer.innerclass1 obj1 = new outer().new innerclass1();
		obj1.getinnerclass1data();

	}

}
