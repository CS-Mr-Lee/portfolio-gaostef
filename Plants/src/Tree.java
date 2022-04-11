/**
 * Name: Stefany Gao
 * Date: march 6. 2022 
 * Description: This program demonstrate inheritance and polymorphism. This is the subclass of PlantCode 
 */

public class Tree extends PlantCode {

	/* Attributes */
	/** the leaf percentage of the tree */
	private double leafPercentage = 0;

	/* Constructor */
	/**
	 * name: Tree 
	 * description: constructor for Tree
	 * 
	 * @param height         - the height of the tree
	 * @param color          - the color of the tree
	 * @param type           - the type of the tree
	 * @param leafPercentage - the leaf percentage of the tree
	 */
	public Tree(double height, String color, String type, double leafPercentage) {
		super(height, color, type); // calling from the super class, PlantCode

		// making sure that the leaf percentage doesn't go under 0 and over 100
		if (leafPercentage < 0) {
			this.leafPercentage = 0;
		} else if (leafPercentage > 100) {
			this.leafPercentage = 100;
		} else {
			this.leafPercentage = leafPercentage;
		}
	}

	/* Accessors and Mutators */

	/**
	 * name: getLeafPercentage
	 * description: gets the leaf percentage
	 * @return leafPercentage
	 */
	public double getLeafPercentage() {
		return this.leafPercentage;
	}

	/**
	 * name: burn
	 * description: changes the tree color to black
	 */
	public void burn() {
		super.changeColor("black");
	}

	/**
	 * name: getChopped
	 * description: makes the tree shorter by cutting it by a double number
	 */
	public void getChopped(double cutHeight) {
		super.cut(cutHeight);
	}

	/**
	 * name: leaves
	 * description: adds or removes leaves, can not be more than 100 and less than 0
	 */
	public void leaves(double newLeafPercentage) {
		if (newLeafPercentage < 0) {
			this.leafPercentage = 0;
		} else if (newLeafPercentage > 100) {
			this.leafPercentage = 100;
		} else {
			this.leafPercentage = newLeafPercentage;
		}

	}
	/**
	 * Name: toString 
	 * Description: outputs the trees' attributes
	 * 
	 * @return - String value for tree attributes
	 */
	public String toString() {
		return "\nleaf percentage: " + leafPercentage;
	}
}
