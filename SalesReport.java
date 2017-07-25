package salesReport;

import java.util.ArrayList;
import java.util.Scanner;

public class SalesReport {

	public static void main(String[] args) {


		String phoneNumber = null; //enter as string so how they enter it does not matter
		String name = null;
		double salesAmount;
		int taxCode;
		double taxDue;
		double amountDue;

		double[] taxMulti = {0,0.03,0.05}; //code 0 = 0.0 code 1 = 0.03 code 2 = 0.05

		ArrayList<Entry> items = new ArrayList<Entry>();//place to store the enteries

		boolean end = false;
		do{
			Scanner scan = new Scanner (System.in);
			System.out.println("Enter customer phone number");
			phoneNumber = scan.nextLine();
			System.out.println("Enter customer name");
			name = scan.nextLine();
			System.out.println("Enter sales amount");
			salesAmount= scan.nextDouble();
			//made a little catch mechanism to prevent other numbers from being inputted because that would cause an out of bounds error when referencing the tax array
			boolean tempControl = false;
			do{		
				System.out.println("Enter tax code (0,1, or 2)");	
				taxCode = scan.nextInt();
				if(taxCode ==0 || taxCode ==1 ||taxCode == 2){
					tempControl = true;
				}else{
					System.out.println("You entered an invalid tax code...");
				}
			}while (tempControl == false);

			//figure out the tax amount and total due (could have done this in the entry object itself and cleaned this up but for time i did it here)
			taxDue = taxMulti[taxCode]*salesAmount;
			amountDue = taxDue+salesAmount;

			//create and populate a new entry (entry object holding all values)
			Entry temp = new Entry();
			temp.setPhoneNumber(phoneNumber);
			temp.setName(name);
			temp.setSalesAmount(salesAmount);
			temp.setTaxCode(taxCode);
			temp.setTaxDue(taxDue);
			temp.setAmountDue(amountDue);

			//add that object we made to an arraylist of all the items we made.  used array list so i can expand this as large as i want
			items.add(temp);
			

			System.out.println("Would you like to continue addint items (\"y\"for yes or \"n\" for no)");
			String response = scan.next();
			if (response.equalsIgnoreCase("y")){
			}
			else if(response.equalsIgnoreCase("n")){
				end = true;
				scan.close();
			}
			else{
				System.out.println("why you no answer correctly. Try again (y or n)");
			}

		}while (end == false);
		//System.out.println("I see we are done here... bye then!");
		System.out.println();
		System.out.println("Sales Report");
		for (int i = 0; i < items.size(); i ++){
			items.get(i).printEntry();


		}
		//I used this to check how many items were read and stored... and i liked the look it gave on the end of the report
		System.out.println();
		System.out.println("There are " + items.size() + " item(s) in the report");
	}

}
