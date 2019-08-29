package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.

		
		
		
		// take in the number of customers
		int count = scan.nextInt();
		
		
		for (int i = 0; i < count; i++) {
			
			String firstname = scan.next();
			String lastname = scan.next();
			System.out.print(firstname.charAt(0) + ". ");
			System.out.print(lastname + ": ");
			
			int count2 = scan.nextInt();
			double total = 0;
		
			
			for (int j = 0; j < count2; j++) {
				
				
				int number = scan.nextInt();
				String productName = scan.next();
				double price = scan.nextDouble();
				
				
				double temp = number * price;
				total = total + temp;
			
				
				
			}
			
			System.out.println(String.format("%.2f", total));
			
			
			
		}
		
		
		
		

		
		
	}
}














