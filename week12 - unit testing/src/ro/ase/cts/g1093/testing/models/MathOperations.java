package ro.ase.cts.g1093.testing.models;

import ro.ase.cts.g1093.testing.exceptions.DivisionBy0Exception;

public class MathOperations {
	
	public static int add(int a, int b) {
		return a +b;
	}

	
	public static double divide(int a, int b) throws DivisionBy0Exception {
		
		if(b ==0) {
			throw new DivisionBy0Exception();
		}
		
		return a/b;
	}
}
