/**
 * Name: Stefany Gao
 * Date: march 6. 2022 
 * Description: This program demonstrate inheritance and polymorphism. This is the tester  
 */

public class TestPlant {

	public static void main(String[] args) {
		Tree oak = new Tree (432,"brown", "oak", 43);
		Flower violet = new Flower (23, "purple", "violet", true, "once a week");
		
		//testing the tree methods
		
		System.out.println(oak.getType()+ " is a tree, it's color is " + oak.getColor());
		System.out.println("I'm going to burn it now");
		oak.burn();
		System.out.println("the color of the " + oak.getType() + " tree is now " + oak.getColor());
		System.out.println("");
		
		System.out.println("the tree's leaf percentage is " + oak.getLeafPercentage());
		System.out.println("I'm going to force the tree to grow leaves over 100%");
		oak.leaves(122);
		
		System.out.println("the tree's leaf percentage is " + oak.getLeafPercentage());
		System.out.println("");
		
		System.out.println("the tree's height is " + oak.getHeight() + "cm");
		System.out.println("it's going to grow");
		oak.grow(562);
		System.out.println("the tree's height is " + oak.getHeight() + "cm");
		System.out.println();
		
		System.out.println("I'm going to try and make it grow smaller");
		oak.grow(2);
		System.out.println("the tree's height is still " + oak.getHeight() + " because a tree can't grow smaller");
		System.out.println("but I can cut the tree down");
		oak.getChopped(243);
		System.out.println("the tree's height is " + oak.getHeight() + "cm");
		
		//testing the flower methods
		System.out.println("");
		System.out.println(violet.getType() + " is a flower the color is " + violet.getColor() + " and the height is " + violet.getHeight()+ "cm");
		System.out.println("is the flower poisonous?");
		violet.getPoisonous();
		System.out.println("");
		System.out.println("changing the flower height by making it grow");
		violet.grow(43);
		System.out.println(violet.getType() + " is now " + violet.getHeight() + "cm");
		
		System.out.println("you should water the flower "+ violet.getWaterFrequency());
		System.out.println("");
		System.out.println("I will pollination, rot, and wither the flower");
		violet.pollination();
		System.out.print("");
		violet.rot();
		System.out.print("");
		violet.wither();
		System.out.print("");
		
		
	}

}
