package if_else_practice;

import java.util.Scanner;

public class Square 
{
    public void dimensions()
    {
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter length");
    	int l=s.nextInt();
    	
    	System.out.println("Enter breadth");
    	int b=s.nextInt();
    	
    	if(l == b)
    	{
    		System.out.println("This is a square");
    	}
    	else
    	{
    		System.out.println("This is a rectangle");
    	}
    	
    }
	
	public static void main(String[] args) 
	{
        Square square = new Square();
        square.dimensions();
	}

}
