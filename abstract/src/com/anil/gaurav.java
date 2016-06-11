package com.anil;
interface HDFC_Account{
	public int getirr();
	public String getaccounttype();
}
class HDFC_current implements HDFC_Account
{


	public int getirr() {
		
		return 10;
	}

	
	public String getaccounttype() {
		// TODO Auto-generated method stub
		return "Current account";
	}
	
}
class HDFC_savings implements HDFC_Account
{
	public int getirr()
	{
		return 11;
	}
	public String getaccounttype() {
		return"savings";
	}
	
	
}

public class gaurav {
	public static void main(String args[])
	{
		HDFC_savings anu=new HDFC_savings();
		System.out.println("interest is:"+anu.getirr());
		System.out.println("account type is :"+anu.getaccounttype());
	HDFC_current anu1=new HDFC_current();
		System.out.println("interest is:"+anu1.getirr());
		System.out.println("account type is :"+anu1.getaccounttype());		

}}
