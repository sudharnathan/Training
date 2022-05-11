package test;

public class Conspara {

		/*String brandName;
		String warranty;
		int modelNumber;
		float displayInch;
		String memory;*/

Conspara(String brandName,String warranty,int modelNumber,float displayInch,String memory) 
{
	/*brandName="Lenovo";
	warranty="5 Years";
	modelNumber=2022;
	displayInch=19.5f;
	memory="8GB 1TB";*/
System.out.println("Laptop Brand is :" +brandName);
System.out.println("Laptop Warranty is :" + warranty);
System.out.println("Laptop modelNumber is :" + modelNumber);
System.out.println("Laptop inch is :" + displayInch);
System.out.println("Laptop memory is :" + memory);
}

public static void main(String[] args) {
Conspara obj=new Conspara("Lenovo","One Year",2022,19.5f,"8GB");
}
}
		