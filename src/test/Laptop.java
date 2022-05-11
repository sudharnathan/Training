package test;

class Laptop{
    String brand;
    String warranty;
    int modelno;
Laptop()
{
    brand="Lenovo";
    warranty="5 years";
    modelno=22;
}
void show()
{
	
    System.out.println("Laptop Brand is "+brand);    
    System.out.println("Period of warranty "+warranty);
    System.out.println("Model number "+modelno);
}
public static void main(String[] args)
{
    Laptop val=new Laptop();
    val.show();
}
}