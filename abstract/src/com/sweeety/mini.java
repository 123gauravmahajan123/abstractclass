package com.sweeety;

public class mini {

	public static void main(String[] args) {
		int a[][] = new int [2][2];
		
			a[0][0]=10;
			a[0][1]=20;
		    a[1][0]=30;
			a[1][1]=40;
			        for(int m=0;m<=1;m++)
		{
			             for(int j=0;j<=1;j++)
			{
			                   System.out.print(a[m][j]+" ");
			                   System.out.print(" ");
			                   
		} 
			             System.out.println(" ");
			             

	}
			        System.out.println("*****");
			        int b[][]=new int [2][2];
			        b[0][0]=50;
			        b[0][1]=60;
                    b[1][0]=70 ;
                    b[1][1]=80;
                    for(int m=0;m<=1;m++)
            		{
            			             for(int j=0;j<=1;j++)
            			{
                    
                    	System.out.print(b[m][j]+" ");
                    	System.out.print(" ");
            		 
                    	
                    }
            			             System.out.println(" ");
            			             
            			}
                    System.out.println("*****");
            		int c[][]=new int[2][2];
            		  for(int m=0;m<=1;m++)
            			{
            				             for(int j=0;j<=1;j++)
            				{
            				            	 c[m][j]=a[m][j]+b[m][j];
            				
            				                   System.out.print(c[m][j]+" ");
            			}
            				             System.out.println(" ");
            		}
	}
}

	
            		