package Java;
interface Geometry
{
  void rectangle_area(int height,int width);
  void square_area(int side);  
  void circle_area(float radius);          
}
//implementing interface
class Area implements Geometry
{
 //implementing method of interface
 public void rectangle_area(int height,int width)
 {
  int ar=height*width;
  System.out.println("Area of rectangle="+ar);
 }
  //implementing method of interface
 public void square_area(int side)
 {
  int ar=side*side;
  System.out.println("Area of square="+ar);
 }
  //implementing method of interface
 public void circle_area(float radius)
 {
  float ar=3.14f*radius*radius;
  System.out.println("Area of circle="+ar);
 }
 public static void main(String[] args)
 {
   //creating instance of derived class
   Area obj=new Area();
   obj.rectangle_area(12, 13);
   obj.square_area(12);
   obj.circle_area(2.2f);
 }
}
