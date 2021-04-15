package dvdsystem;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DVD lotr = new DVD("The Lord of the Rings", "Fantasy", "2003" , "Peter Jackson", 23.00);
		DVD harryPotter = new DVD("Harry Potter", "Fantasy", "2001" , "Chris Columbus", 23.00);
		DVD testDvd = new DVD("Testing Guide", "Instruction", "2015" , "Mr Test", 40.00);
		DVD testDvd2 = new DVD("Testing Guide", "Instruction", "2019" , "Mr Test", 40.00);
		Basket basket = new Basket();
		Checkout checkout = new Checkout();
		basket.addDvd(harryPotter);
		basket.addDvd(lotr);
		basket.addDvd(testDvd);
		basket.addDvd(testDvd2);
		basket.basketContents();
		
		System.out.println(lotr.getPrice());
		//Test removing from basket
		basket.basketRemove("The Lord of the Rings");
		basket.basketContents();
		
		//Test clearing basket
		basket.basketClear();
		basket.basketContents();
		
		
		//Re-add basket contents and test priceCalc + receiptPrint
		basket.addDvd(harryPotter);
		basket.addDvd(lotr);
		basket.addDvd(testDvd);
		basket.addDvd(testDvd2);
		System.out.println("The total basket value is: " +checkout.priceCalc(basket));
		checkout.receiptPrint(basket);
		
		
		
		
	}

}
