package if_else_practice;

import java.util.Scanner;

public class PurchaseOrder 
{
    public void getOrder()
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the quantity of product : ");
    	int n = sc.nextInt();
    	int cop = n*100;
    	
    	if(cop>1000)
    	{
    		int discprice = (int) (cop-(.1*n*100));
    		System.out.println("Total price after discount is :" + discprice);
    	}
    	
    	else
    	{
    		System.out.println("Discount not available, Total price is : " + cop);
    	}
    }
	
	public static void main(String[] args) 
	{
      PurchaseOrder po = new PurchaseOrder();
      po.getOrder();
	}

}
