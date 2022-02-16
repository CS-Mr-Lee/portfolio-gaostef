/**
* Name: Stefany
* Date: Feb 09, 2022
* description: This program gets user input and swaps the first and last letter of each word and
* the middle characters of each word are shifted to the character two after it in the ASCII table. 
* The spaces are unchanged.
*/

import java.util.Scanner;

public class Encryptioncode2
{
   public static void main(String [] args) 
   {
      Scanner scanner = new Scanner(System.in);
      String sentence;

      //ask user input for the line
      System.out.print("Enter a line to be encrypted: ");
      sentence = scanner.nextLine();

      //separate the words by space
      String [] words = sentence.split(" ");
      int [] sums = new int[words.length];

      //printing the encryption output
      System.out.println("The encryption is: ");
      for (int i = 0; i < words.length; i++) 
      {
         int sum = 0;
         int currNum = 1;
         
         //swapping the first and last
         System.out.print(words[i].charAt(words[i].length()-1));
         while (currNum < (words[i].length())-1) {
        	 
        	//shifting the words by 2 after it in the ASCII table
            char currC = words[i].charAt(currNum);
            sum = sum + currC; 
            char newChar = (char) (currC+2);
            System.out.print(newChar);
            currNum++;
         }
         System.out.print(words[i].charAt(0) + " ");
         sums[i] = sum;
      }
   }
}