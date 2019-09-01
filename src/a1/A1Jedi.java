package a1;

import java.util.Scanner;

public class A1Jedi {

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
				
				int number[] = new int[numberofitems];
				int itemamount[] = new int[numberofitems];
				
				
				
				for (int j = 0; j < numberofcustomers; j++) {
					
					name[j] = scan.next() + " " + scan.next();
					
					boolean samecustomer[] = new boolean[numberofitems];
					
					// number of items bought by customer
					int customernumber = scan.nextInt();
					
					//items bought by customer loop
					for (int k = 0; k < customernumber; k++) {
						
						int quantity = scan.nextInt();
						String item = scan.next();
						
						//loop to see if item customer bought equals a store item
						for (int l = 0; l < numberofitems; l++) {
					
							
							if (itemnames[l].equals(item)) {
								
								itemamount[l] = itemamount[l] + quantity;
								//System.out.println(itemamount[l] + itemnames[l]);
								
								
								
								if (!samecustomer[l]) {
									number[l] = number[l] + 1;
								}
								
								samecustomer[l] = true;
								
								
								//System.out.println(number[l] + "customers");
								
								
							}
							
						}
						
						
					}	
					
					
				
					
				}
				
				for (int x = 0; x < numberofitems; x++) {
					
					if (number[x] < 1) {
						
						System.out.println("No" + " customers bought " + itemnames[x]);
						x++;
					
					} 
					
					
					System.out.println(number[x] + " customers bought " + itemamount[x] + " " + itemnames[x]);
					
			
				}
				
				
				
				
				
				
				
		
		
		
		
	
	}
}
