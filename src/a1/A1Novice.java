package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Your code follows here.


		// take in the number of customers
		int count = scan.nextInt();

		//use number of customers as a counter to 
		//filter through the names of the customers
		//and print them out
		for (int i = 0; i < count; i++) {

			String firstname = scan.next();
			String lastname = scan.next();
			System.out.print(firstname.charAt(0) + ". ");
			System.out.print(lastname + ": ");

			//take in the number of items each customer has
			int count2 = scan.nextInt();
			double total = 0;

			//use the amount of items a customer has as a counter
			//to loop through each item in the customer's cart
			for (int j = 0; j < count2; j++) {

				int number = scan.nextInt();
				String productName = scan.next();
				double price = scan.nextDouble();

				//calculate the total amount the customer spent
				double temp = number * price;
				total = total + temp;

			}

			//print the customers total with two decimals places
			System.out.println(String.format("%.2f", total));

		}
	}
}














