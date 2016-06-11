package com.sweeety;

class share {
	public synchronized void getdata(String ThreadName) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(ThreadName + " ::" + i);
		}
	}
}

class Mythread6 extends Thread {
	private share share;

	public Mythread6(share shareobj, String pThreadName) {
		super(pThreadName);
		this.share = shareobj;
	}

	public void run() {
		share.getdata(Thread.currentThread().getName());

	}
}

public class vishal {
	public static void main(String args[]) {
		share shareobject = new share();
		Mythread6 obj1 = new Mythread6(shareobject, "Thread a");
		obj1.start();
		Mythread6 obj2 = new Mythread6(shareobject, "Thread b");
		obj2.start();
	}
}
