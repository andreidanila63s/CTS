package ro.ase.cts.g1093.testing.main;

import ro.ase.cts.g1093.testing.models.MathOperations;

public class MainApp {

	public static void main(String[] args) {
		
		
		System.out.println("tha app is running...");
		
		int a = 5;
		int b = 6;
		int expectedResult = 11;
		int actualResult = MathOperations.add(a, b);
		if(expectedResult == actualResult) {
			System.out.println("IT WORKS");
		}
			else {
				System.out.println("i need more math classes");
			}
		}
		
	}


