package Java;
abstract class Shape {
    int numSides;
Shape(int newSides) {
    numSides = newSides;
        }
    public int getNumSides() {
    	return numSides;
        }
    }

class Rectangle extends Shape {
	double height, width;
	public Rectangle(double w, double h) {
           super(4);
           this.height = h;
           this.width = w;
           }
    public double getArea() {
         return height * width;
           }
    public double getPerimeter() {
         return 2 * (height + width);
           }
    }
      
class Triangle extends Shape {
      double height, width;
    public Triangle(double w, double h) {
           super(4);
           this.height = h;
           this.width = w;
           }
    public double getArea() {
         return (height * width)/2;
           }
    public double getPerimeter() {
         return 2 * (height + width);
           }
	}
    public class AbstractShape {
    public static void main(String[] args) {
          Rectangle r=new Rectangle(10,20);
          System.out.println("Rectangle - Area: " + r.getArea());
          System.out.println("Rectangle - perimeter: " + r.getPerimeter());     
          Triangle c = new Triangle(20,30);
          System.out.println("Triangle - Area: " + c.getArea());
          System.out.println("Triangle - perimeter: " + c.getPerimeter());
    		}
    }