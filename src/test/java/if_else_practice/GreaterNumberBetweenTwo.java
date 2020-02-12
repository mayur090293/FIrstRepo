package if_else_practice;

import java.util.Scanner;

public class GreaterNumberBetweenTwo
{
    public void getGreaterNumber()
    {
    	Scanner s =new Scanner(System.in);
    	System.out.println("Enter first number:");
    	long fnum= s.nextInt();
    	System.out.println("Enter second number:");
    	long snum= s.nextInt();
    	
    	if(fnum>snum)
    	{
    		System.out.println("Number " + fnum + " is greater then" + snum);
    	}
    	
    	else
    	{
    		System.out.println("Number " + snum + " is greater then " + fnum);
    	}
    }
	
	public static void main(String[] args) 
	{
		GreaterNumberBetweenTwo g=new GreaterNumberBetweenTwo();
        g.getGreaterNumber();
	}

}
