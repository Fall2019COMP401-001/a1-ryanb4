package a1;

import java.util.Scanner;

public class A1Jedi {

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

		//establishes arrays to use later for the customer
		//names, number of products in customer's cart,
		//and the quantity of each item
		String[] name = new String[numberofcustomers];
		int number[] = new int[numberofitems];
		int itemamount[] = new int[numberofitems];


		//outermost loop that goes through each customer's cart
		for (int j = 0; j < numberofcustomers; j++) {

			name[j] = scan.next() + " " + scan.next();

			//creates boolean array that is later used to determine
			//if the same customer is buying the same product
			//more than one time
			boolean samecustomer[] = new boolean[numberofitems];

			//number of items bought by the customer
			int customernumber = scan.nextInt();

			//items bought by customer loop
			for (int k = 0; k < customernumber; k++) {

				int quantity = scan.nextInt();
				String item = scan.next();

				//loop to see if item customer bought equals a store item
				for (int l = 0; l < numberofitems; l++) {

					//if statement that adds up the quantity of each 
					//product that is bought
					if (itemnames[l].equals(item)) {

						itemamount[l] = itemamount[l] + quantity;

						//if statement that checks to see if a customer has
						//bought the same item already
						if (!samecustomer[l]) {
							number[l] = number[l] + 1;
						}
						samecustomer[l] = true;

					}

				}

			}	

		}
		
		//prints out final numbers from parallel arrays
		for (int x = 0; x < numberofitems; x++) {

			if (number[x] < 1) {

				System.out.println("No" + " customers bought " + itemnames[x]);
				x++;

			} 
			
			System.out.println(number[x] + " customers bought " + itemamount[x] + " " + itemnames[x]);
			
		}
		
	}
}
