package Java;

public class Collectamount {

	public Integer Collectedamount=1000;
	
	public Integer collectAmountAndGiveItToMe() {
		System.out.println("Collected amount is "+Collectedamount+ " already sent to you");
		return Collectedamount;
	}
	public static void main(String[] args) {
		Collectamount myson= new Collectamount();
		Integer amount= myson.collectAmountAndGiveItToMe();
		System.out.println("Amount recived myson "+amount);
	}

}
