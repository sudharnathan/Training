package train;

import java.util.Scanner;
public class Construct
{
Scanner in=new Scanner(System.in);
		String brandName;
		String warranty;
		int modelNumber;
		float displayInch;
		int memory;
Construct(){
	System.out.println("Enter the Laptop Brand :");
	brandName=in.nextLine();
	
	System.out.println("Enter the Laptop Warranty :");
	warranty=in.nextLine();
	
	System.out.println("Enter the Laptop modelNumber  :");
	modelNumber=in.nextInt();
	
	System.out.println("Enter the Laptop inch  :");
	displayInch=in.nextFloat();
	
	System.out.println("Enter the Laptop memory  :");
	memory=in.nextInt();
}
	public void show()
	{
		System.out.println("Laptop Brand :"+brandName);
		System.out.println("Laptop Warranty :"+warranty);
		System.out.println("Laptop modelNumber  :"+modelNumber);
		System.out.println("Laptop inch  :"+displayInch);
		System.out.println("Laptop memory  :"+memory);
	}
	public static void main(String[] args) 
	{
	Construct ob=new Construct();
    ob.show();
		                
}
}
		