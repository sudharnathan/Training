import java.util.Scanner;
public class Operations {
	
	int value1,value2,Output;
	String Operation;
	Scanner in=new Scanner(System.in);
	
	public void getInput() {
		System.out.println("Enter Value1 :");
		value1=in.nextInt();
		System.out.println("Enter Value2 :");
		value2=in.nextInt();
		}
	public void OperationDetails() {
		System.out.println("Enter the Operation to Perform :");
		Operation=in.next();
		}
	public void OperationToPerform() {
		switch(Operation) 
		{
		case "add":
			Output=value1+value2;
			System.out.println("Output for the Operation is :"+Output);
		break;
		case "sub":
			Output=value1-value2;
			System.out.println("Output for the Operation is :"+Output);
		break;
		case "div":
			Output=value1/value2;
			System.out.println("Output for the Operation is :"+Output);
		break;
		default:
			System.out.println("Sorry..Given Operation is not Valid");
		}
		
	}

}
