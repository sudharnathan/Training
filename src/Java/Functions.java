package Java;

class Functions 
{
	void add()
	{
		int x,y=10,z=10;
		x=y+z;
	System.out.println("Sum= "+x);
	}
	public void sub()
	{
		int x,y=10,z=-30;
		x=y-z;
	System.out.println("Sub= "+x);
	}
	public void div()
	{
		int x,y=10,z=30;
		x=y%z;
	System.out.println("Div= "+x);
	}
	public static void main(String[] args) 
	{
		Functions obj=new Functions();
		Functions obj1=new Functions();
		Functions obj2=new Functions();
		obj.add();
		obj1.sub();
		obj2.div();

	}

}
