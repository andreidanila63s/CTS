package ro.ase.csie.cts.g1093.laboratory3.stage1;

import ro.ase.csie.cts.g1093.laboratory3.exceptions.InvalidAccountException;
import ro.ase.csie.cts.g1093.laboratory3.exceptions.InvalidPriceException;

public class Product {
	
	public static final int MAX_ACCOUNT_AGE = 10;
	public final static float MAX_FIDELITY_DISCOUNT = 0.15f;
	
	
	
	
	public float getFinalPrice(ProductType productType, float initialPrice, int accountAgeInyears) throws InvalidAccountException, InvalidPriceException {
		
		if(initialPrice <= 0) {
			throw new InvalidPriceException();
			
		}
		
		if(accountAgeInyears < 0) {
			throw new InvalidAccountException();
			
		}
		
		float finalPrice = 0;
		float fidelityDiscount = (accountAgeInyears > MAX_ACCOUNT_AGE) ? MAX_FIDELITY_DISCOUNT : (float) accountAgeInyears / 100;
		
		float discountValue = 0;
		
		switch(productType) {
		case NEW:
			finalPrice = initialPrice;
			break;
		case DISCOUNT:
			discountValue = ProductType.DISCOUNT.getDiscount();
			finalPrice = (initialPrice - (discountValue * initialPrice))
					- fidelityDiscount * (initialPrice - (discountValue * initialPrice));
			break;
		case LIMITED_STOCK:
			discountValue = ProductType.LIMITED_STOCK.getDiscount();
			finalPrice = (initialPrice - (discountValue * initialPrice))
					- fidelityDiscount * (initialPrice - (discountValue * initialPrice));
			break;
		case LEGACY:
			discountValue = ProductType.LEGACY.getDiscount();
			finalPrice = (initialPrice - (discountValue * initialPrice))
					- fidelityDiscount * (initialPrice - (discountValue * initialPrice));
			break;
			
			default: 
				throw new UnsupportedOperationException("new enum symbol not processed");
		
		}
		
		
		
		return finalPrice;
	}
}