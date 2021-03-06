package services;

import java.security.InvalidParameterException;

public interface InterestService {
	
	double getInterestRate();
	
	default double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Number of months must be equal or higher than one.");
		} else {
			return amount * Math.pow((1 + getInterestRate() / 100), (double) (months));
		}

	}

}
