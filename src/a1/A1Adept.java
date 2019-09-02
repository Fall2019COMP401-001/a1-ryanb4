package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Your code follows here.


		//establish a store "inventory" with two parallel
		//arrays, one for item name and one for price.
		//loop these values into arrays with the number of items variable.
		int numberofitems = scan.nextInt();

		String[] itemnames = new String[numberofitems];
		Double[] prices = new Double[numberofitems];

		for (int i = 0; i < numberofitems; i++) {

			itemnames[i] = scan.next();
			prices[i] = scan.nextDouble();
		}

		//scan for the number of customers to use
		//as the counter for the outermost loop
		int numberofcustomers = scan.nextInt();

		//establish parallel arrays to use later for customer 
		//names and their total expenses 
		String[] name = new String[numberofcustomers];
		Double[] totalexpenditures = new Double[numberofcustomers];

		//outermost loop that goes through each customer's cart
		for (int j = 0; j < numberofcustomers; j++) {

			name[j] = scan.next() + " " + scan.next();
			Double total = 0.00;

			// number of items bought by each customer
			int customernumber = scan.nextInt();

			//number of items bought by customer loop
			for (int k = 0; k < customernumber; k++) {

				int quantity = scan.nextInt();
				String item = scan.next();

				//loop to see if item customer bought equals
				//an item in the store "inventory" array
				for (int l = 0; l < numberofitems; l++) {

					//if statement that calculates the customer's total
					//expenses and places it in an array that is parallel
					//to the names of each customer
					if (itemnames[l].equals(item)) {

						Double temp = quantity * prices[l];
						total = total + temp;
						totalexpenditures[j] = total;

					}

				}

			}

		}

		//calculates the largest spender in the parallel
		//arrays then stores in variables
		double max = 0.00;
		String maxname = "";
		for (int z = 0; z < numberofcustomers; z++) {
			if (totalexpenditures[z] > max) {
				max = totalexpenditures[z];
				maxname = name[z];
			}
		}

		//calculates the smallest spender in the parallel
		//arrays then stores in variables
		double min = max;
		String minname = "";
		for (int y = 0; y < numberofcustomers; y++) {
			if (totalexpenditures[y] <= min) {
				min = totalexpenditures[y];
				minname = name[y];
			}
		}

		//calculates the average price from the total
		//expenses array
		double average = 0.00;
		double temp2 = 0.00;
		for (int x = 0; x < numberofcustomers; x++) {
			temp2 = temp2 + totalexpenditures[x];
		}
		average = temp2 / numberofcustomers;

		//prints out biggest, smallest, and average
		System.out.println("Biggest: " + maxname + " (" + String.format("%.2f", max) + ")");
		System.out.println("Smallest: " + minname + " (" + String.format("%.2f", min) + ")");
		System.out.println("Average: " + String.format("%.2f", average));

	}
}
