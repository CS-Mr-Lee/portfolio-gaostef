/**
 * name: Stefany
 * date: feb 14 2022
 * description: this program asks the user for 2 sides of a triangle and one angle of the triangle
 * it then calculates all angles and outputs which angle is the smallest.
 */

import java.util.*;
public class SAScode
{

	public static void main(String []args){
		 Scanner scanner = new Scanner(System.in);
		
		 //declaring variables
		 double sideA, sideB, sideC; 
		 double angleA, angleB, angleC; 
		 double angleCDegrees, angleADegrees, angleBDegrees;
		 
		 //asking the user for input
		 System.out.println ("Enter your first side of the triangle");
		 sideA = scanner.nextDouble();
		 System.out.println ("Enter your second side of the triangle");
		 sideB = scanner.nextDouble();
		 System.out.println ("Enter your angle (in radians).");
		 angleC = scanner.nextDouble();
		 
		 //calling the finding3rdSide method and plugging in the inputs
		 sideC = (finding3rdSide(sideA, sideB, angleC));

		 
		 //calculating the angles
		 angleB = Math.asin((Math.sin(angleC)*sideB/sideC));
		 //turning the radians into degrees
		 angleBDegrees = angleB * (180/Math.PI);

		
		 angleA = Math.asin(sideA*(Math.sin(angleC)/sideC));
		 angleADegrees = angleA * (180/Math.PI);

		 angleCDegrees = angleC * (180/Math.PI);
		 
		 //printing which angle is the smallest
		 if(angleADegrees<=angleBDegrees && angleADegrees<=angleCDegrees)
	         {
	         	System.out.printf("The smallest angle is %.2f",angleADegrees);
	         }
	         else if(angleB<=angleADegrees && angleBDegrees<=angleCDegrees)
	         {
	         	System.out.printf("The smallest angle is %.2f",angleBDegrees);
	         }
	         else if(angleC<=angleADegrees && angleC<=angleBDegrees)
	         {
	         	System.out.printf("The smallest angle is %.2f",angleCDegrees);
	         }
		 
		 
	}
	/**
	 * description: This method calculates the third side of the triangle
	 * @param side1 first side input
	 * @param side2 second side input
	 * @param angle3 angle input
	 * @return missingSide calculated third slide
	 */
	 static double finding3rdSide(double side1, double side2, double angle3)
	 {
		double missingSide = Math.sqrt((side1*side1)+(side2*side2)-(2*side1*side2)*(Math.cos(angle3)));
		return missingSide;
	 }

}
		
