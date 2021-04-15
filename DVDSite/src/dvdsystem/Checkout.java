package dvdsystem;

import java.util.ArrayList;
import java.util.List;

public class Checkout {
	
	private int dvdcount;
	
	//List<DVD> checkoutList = new ArrayList<DVD>();
	
	
	
	
	
	public double priceCalc(Basket basket) {
		double priceTotal = 0.00;
		for (DVD dvd:basket.dvdList) {
			priceTotal += dvd.getPrice();
		}
		return priceTotal;
	}
		
	public void receiptPrint(Basket basket) {
		basket.basketContents();
		System.out.println("Price total: " + this.priceCalc(basket) + "\nDiscounted to: " + this.priceCalc(basket) * discountCalc(dvdCounter(basket), basket));
	}
	
	
	//Calculate no. of items in basket
	public int dvdCounter(Basket basket) {
		for (DVD dvd:basket.dvdList) {
			dvdcount += 1;
		}
		return dvdcount;
	}
	
	
	//Calculate discounts
	public double discountCalc(int dvdcount, Basket basket) {
		int triplediscount = 0;
		triplediscount = dvdcount/3;
		double finalDiscount = triplediscount*0.01;
		
		if (dvdcount >= 10) {
			System.out.println("Over 10 DVDs, discount applied!");
			finalDiscount += 0.1;
		}
		
		if (basket.uniqueCheck2()) {
			System.out.println("Unique title discount applied!");
			finalDiscount += 0.05;
		}
		
		
		
		return 1 - finalDiscount;
	}
	

	
	
}
