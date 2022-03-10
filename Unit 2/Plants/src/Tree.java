/**
 * Name: Stefany Date: march 6. 2022 This program demostrates inheritance and
 * polymorphism
 */

public class Tree {


	private boolean hasFruit;
	private double leafPercentage;

	public Tree(boolean hasFruit, double leafPercentage) {
		this.hasFruit = true;
		if (leafPercentage < 0) {
			this.leafPercentage = 0;
		} else if (leafPercentage > 100) {
			this.leafPercentage = 100;
		} else {
			this.leafPercentage = leafPercentage;
		}

	}

	/* Accessors and Mutators */

	public boolean getHasFruit() {
		return this.hasFruit;
	}

	public double getLeafPercentage() {
		return this.leafPercentage;
	}

	

	public void burn(String burnt) {
		super(color);
		this.color = "black";
	}

	public void getChopped(double newHeight) {
		super(height);
		if (this.height > newHeight) {
			this.height = this.height;

		} else if (newHeight == 0) {
			this.height = 0;
		} else {
			this.height = newHeight;
		}
	}
	public void leaves (double newLeafPercentage) {
		if (newLeafPercentage < 0) {
			this.leafPercentage = 0;
		} else if (newLeafPercentage > 100) {
			this.leafPercentage = 100;
		} else {
			this.leafPercentage = newLeafPercentage;
		}

	}

}
