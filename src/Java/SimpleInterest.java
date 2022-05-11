package Java;

//simple interest=(p*r*t)/100
import java.util.Scanner;
class SimpleInterest
{
Scanner in=new Scanner(System.in);
//Data Member 
float p;
float r;
float t;
float si;
//member function 
void getPara()
{
System.out.println("Enter principle Amount");
p=in.nextFloat();//taking input
System.out.println("Enter rate of interest");
r=in.nextFloat();//taking input
System.out.println("Enter time duration");
t=in.nextFloat();//taking input
}
void findInterest()
{
si=(p*r*t)/100;
}
void show()
{
System.out.println("Simple Interest="+si);
}
public static void main(String[] args) 
{
//creating instance(object) of class
SimpleInterest obj=new SimpleInterest();
//calling function
obj.getPara();
obj.findInterest();
obj.show();
}
}

