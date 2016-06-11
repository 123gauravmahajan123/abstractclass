package com.sweeety;

abstract class manju {
	private int irr=8;
	public int getirr()
	{
		return irr;
	}
	public abstract String get_accounttype();
}
class savingsaccount extends manju
{
	public String get_accounttype()
	{
		return("savings account");
	}
	class currentaccount extends manju{
		public String get_accounttype()
		{
			return("current account");
		}
	}
}
class diksha
{
	public static void main(String args[])
	{
		savingsaccount pooja=new savingsaccount();
		System.out.println("account:"+pooja.get_accounttype());
		System.out.println("interst:"+pooja.getirr());
		
	}
}
