package Calculator;

import java.util.Scanner;

public class Sales_Tax_Calculator {
	
	
	
	public static void main(String[] args) {
		
		
		Scanner kybd = new Scanner(System.in);
		
		
		System.out.println("Welcome to Sales tax calculator");
		
		
		double totalPrice = calculateTotalPrice(kybd);
		
		
		double finalPrice = calculateFinalPrice(kybd, totalPrice);
		
		
		System.out.println(finalPrice);
		
		
	}


	private static double calculateTotalPrice(Scanner kybd) {
		
		double userChoice = 0.0;
		double totalPrice = 0.0;
		boolean exit = false;
		
		
		while (exit == false) {
			
			System.out.println("How much was the items (Enter 0 to exit) : ");
			
			userChoice = kybd.nextDouble();
			
			if (userChoice == 0.0) {
				exit = true;
			}
			
			totalPrice += userChoice;
						
		}
		
		return totalPrice;
		
	}
	
	
	
	private static double calculateFinalPrice(Scanner kybd, double totalPrice) {
		
		double taxRate = 0.0;
		double finalTotal = 0.0;
		
		System.out.println("How much is the sales tax rate: ");
		
		taxRate = kybd.nextDouble();
		
		finalTotal = totalPrice + (totalPrice * (taxRate / 100));
		
		return finalTotal;
	}
		
}
