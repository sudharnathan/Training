package Java;
import java.util.Scanner;
public class Dog {
	Scanner in=new Scanner(System.in);
	String dogBreed;
	String dogColour;
Dog()
{
	//dogBreed="lab";
	//dogColour="brown";
	}

public void breed()

	
		{
			System.out.println("Enter the name of breed ");
	dogBreed=in.nextLine();
	
			
		}
public void colour()
{
	System.out.println("Enter the colour of breed ");
			dogColour=in.nextLine();
}
		// TODO Auto-generated method stub

public void Show()
{
	System.out.println("Breed of the dog "+dogBreed);
	System.out.println("Colour of the dog "+dogColour);
}
	

public static void main(String[] args) {
	
	//String dogBreed="Lab";
	//String dogColour="Brown";
	Dog d=new Dog();
	d.breed();
	d.colour();
	d.Show();
	}
}