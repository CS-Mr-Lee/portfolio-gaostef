/**
* Name: Stefany
* Date: Feb 10, 2022
* description: This program asks the user for input for a numerator and a divisor.
* It will then divide them and output the quotient. If the user inputs a sequence of characters
* with a 'q' or 'Q' at the front, the program will end. If the user enters 0 for the divisor
* the program will tell them that they can't do that and have them re-enter their numerator and
* divisor. If the user inputs anything else it will tell them they have entered bad data and tell them
* to try again.
*/

import java.util.*;
public class FoolProofCode
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
	    	//declare variables
	    	String numerator;
		String divisor;
		double divide = 0;
		
		//creating the loop
		while (true){
			
			try {
			    	//getting user input for numerator
			    	System.out.print("Enter the numerator: ");
			    	numerator = scanner.nextLine();
			    	char ch1 = numerator.charAt(0);
			    	if(ch1 == 'q' || ch1 == 'Q') //testing if the input starts with q or Q
				{
					System.exit(0); //exiting the program
				}
				else {
					double numerator1 = Double.parseDouble(numerator); //if not, turn it into a double
				}
				//turning it into a double if numerator doesn't start with q or Q
				double numerator1 = Double.parseDouble(numerator);

				//getting user input for divisor
				System.out.print("Enter the divisor: ");
				divisor = scanner.nextLine();
				//turning the string into a double
				double divisorDouble = Double.parseDouble(divisor);

				//if divisor is not 0
				if (divisorDouble!=0 ){
					divide = numerator1/divisorDouble;
					System.out.printf(numerator+ " / "+divisor+ " is %.2f %n",divide);
				    	System.out.println("");
				}
				//if divisor is 0
				else {
					System.out.println("You can't divide "+numerator+ " by 0");
					System.out.println("");
			        }
			    
			}	
			//if user inputs anything else it tells them and makes them try again.
			catch (Exception e) {
			System.out.println("You entered bad data "); 
			System.out.println("Please try again.");
			System.out.println("");
            
			scanner.close();
			}
		}
	}
}
