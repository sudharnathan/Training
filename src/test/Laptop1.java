package test;

class Laptop1{
	//String brand;
	//String warranty;
	//int modelno;
Laptop1(String brand,String warranty,int modelno)

{
	
    System.out.println("Laptop Brand is "+brand);    
    System.out.println("Period of warranty "+warranty);
    System.out.println("Model number "+modelno);
}
public static void main(String[] args)
{
    Laptop1 val=new Laptop1("Lenovo","5 Years",22);
    
}
}
