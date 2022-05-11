package Java;
 class Myntra {
	String Dress;
	String Colour;
	int Price;
	int Qty;
	public void AddToCart(String Dress, String Colour) {
		System.out.println("Product Details: ");
		System.out.println("Product: "+ Dress);
		System.out.println("Product Colour: "+Colour);
		}
	public void AddToCart(String Dress, String Colour, int Price, int Qty) {
		System.out.println("Product Details: ");
		System.out.println("Product: "+ Dress);
		System.out.println("Product Colour: "+Colour);
		System.out.println("Product Price: "+ Price);
		System.out.println("Product Qty: "+Qty);
		}
		
	public static void main(String[] args) {
		Myntra myntra=new Myntra();
		myntra.AddToCart("Shirt","white");
		myntra.AddToCart("pant","brown", 999, 2);
		
	
		// TODO Auto-generated method stub

	}

}
