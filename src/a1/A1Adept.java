package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		
		//store inventory
		
				int numberofitems = scan.nextInt();
				
				String[] itemnames = new String[numberofitems];
				Double[] prices = new Double[numberofitems];
				
				for (int i = 0; i < numberofitems; i++) {
					
					itemnames[i] = scan.next();
					prices[i] = scan.nextDouble();
					
				}
				
				//number of customers
				
				int numberofcustomers = scan.nextInt();
				
				String[] name = new String[numberofcustomers];
				Double[] totalexpenditures = new Double[numberofcustomers];
				
				
				for (int j = 0; j < numberofcustomers; j++) {
					
					name[j] = scan.next() + " " + scan.next();
					Double total = 0.00;
					// number of items bought by customer
					int customernumber = scan.nextInt();
					
					//items bought by customer loop
					for (int k = 0; k < customernumber; k++) {
						
						int quantity = scan.nextInt();
						String item = scan.next();
						
						//loop to see if item customer bought equals a store item
						for (int l = 0; l < numberofitems; l++) {
							
							if (itemnames[l].equals(item)) {
								
								
								
								Double temp = quantity * prices[l];
								
								total = total + temp;
								totalexpenditures[j] = total;
								
								
								
								
							
							}
							
						}
						
						
					}
					
					
					
					
					
					
				
					
				}
				
				double max = 0.00;
				String maxname = "";
				for (int z = 0; z < numberofcustomers; z++) {
					if (totalexpenditures[z] > max) {
						max = totalexpenditures[z];
						maxname = name[z];
					}
				}
				
				double min = max;
				String minname = "";
				for (int y = 0; y < numberofcustomers; y++) {
					if (totalexpenditures[y] < min) {
						min = totalexpenditures[y];
						minname = name[y];
					}
				}
				
				double average = 0.00;
				double temp2 = 0.00;
				for (int x = 0; x < numberofcustomers; x++) {
					temp2 = temp2 + totalexpenditures[x];
					
				}
				average = temp2 / numberofcustomers;
				
				
				
				
				
				
				
				System.out.println("Biggest: " + maxname + " (" + String.format("%.2f", max) + ")" );
				System.out.println("Smallest: " + minname + " (" + String.format("%.2f", min) + ")" );
				System.out.println("Average: " + String.format("%.2f", average));
				
				
				
				
				
				
				
				
				
				
		
		
		
		
		
		
		
	}
}
