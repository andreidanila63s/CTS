package ro.ase.csie.cts.g1093.laboratory3.stage3.services;

import ro.ase.csie.cts.g1093.laboratory3.exceptions.InvalidAccountException;
import ro.ase.csie.cts.g1093.laboratory3.exceptions.InvalidPriceException;

public class ValidatorService implements validatorInterface {

	@Override
	public static void validatePrice(float price) throws InvalidPriceException {
if(price <=0)
{
	throw new InvalidPriceException();
}
	}

	@Override
	public static void validateAccountAge(int accountAgeInYears) throws InvalidAccountException {
		if(accountAgeInYears < 0) {
			throw new InvalidAccountException();
		}
	}

}
