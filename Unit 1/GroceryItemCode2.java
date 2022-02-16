/**
* Name: Stefany
* Date: Feb 08, 2022
* description: This program asks for user input on 2 grocery items and the price, the name
* can not be more than 20 characters and the cost can't be more than $99.99
*/
import java.util.Scanner;

public class GroceryItemCode2 {
	/**
	 * 
	 * @param grocery1
	 * @param 
	 * @return the output
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		//declaring variables
		String grocery1;
		String grocery2;
		double groceryCost1;
		double groceryCost2;

		//getting user input on their groceries and cost
		System.out.println("Enter the name of your first grocery");
		grocery1 = scanner.nextLine();
		System.out.println("Enter the name of your second grocery");
		grocery2 = scanner.nextLine();
		System.out.println("Enter the cost of your first grocery");
		groceryCost1 = scanner.nextDouble();
		System.out.println("Enter the cost of your second grocery");
		groceryCost2 = scanner.nextDouble();
	
		//formating the costs so they can have dollar signs
		String format1 = "$" + groceryCost1;
		String format2 = "$" + groceryCost2;
		
		//printing out the output
		for (int j = 0; j < 27; j++) { //printing the lines
	        	System.out.print("-"); 
		}
		System.out.println(" ");
		System.out.printf("%-20s %6s %n",grocery1,format1);
		System.out.printf("%-20s %6s %n",grocery2,format2);
		for (int j = 0; j < 27; j++) {
	        	System.out.print("-");
		}
	}
}

