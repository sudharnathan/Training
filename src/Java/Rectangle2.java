package Java;

class Rectangle2
{
//Data Member 
int area;
//constructor 
//notice here there is no return type and name is same as class name
Rectangle2(int height,int width)
 {
  area=height*width;
 }
void show()
{
System.out.println("Area of Rectangle="+area);
}
 public static void main(String[] args) 
 {
  //creating instance(object) of class
  /*notice here there are two values is passed
  because there are two parameters in the constructor
  15 will assign to height and 25 will assign to the width 
 */
  Rectangle2 obj1=new Rectangle2(15,25);
  obj1.show();
  //passing obj1 in obj2 
  Rectangle2 obj2=obj1;
  obj2.show();
 }
}
