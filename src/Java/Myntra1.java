package Java;


	class Myntra1 extends Myntra{
		@Override
		public void AddToCart(String Dress, String Colour) {
			System.out.println("Product Details: ");
			System.out.println("Product: "+ Dress);
			System.out.println("Product Colour: "+Colour);
			}
		@Override
		public void AddToCart(String Dress, String Colour, int Price, int Qty) {
			System.out.println("Product Details: ");
			System.out.println("Product: "+ Dress);
			System.out.println("Product Colour: "+Colour);
			System.out.println("Product Price: "+ Price);
			System.out.println("Product Qty: "+Qty);
			}
		public static void main(String[] args) {
			//Myntra myntra=new Myntra();
			//myntra.AddToCart("Shirt","white");
			//myntra.AddToCart("chudi","pink", 399, 2);
			Myntra1 myntra1= new Myntra1();
			myntra1.AddToCart("pant", "black");
			Myntra1 myntra2= new Myntra1();
			myntra2.AddToCart("pant", "black",1590,5);
			
			
	}

}
