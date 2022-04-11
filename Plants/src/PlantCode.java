/**
 * Name: Stefany Gao
 * Date: march 6. 2022 
 * Description: This program demonstrate inheritance and polymorphism. This is the super class of Tree and Flower
 */

public class PlantCode {

	/* Attributes */
	/** the height of the tree */
	private double height;
	/** the color of the tree */
	private String color;
	/** the type of the tree */
	private String type;

	/* Constructor */
	/**
	 * name: PlantCode description: constructor for PlantCode
	 * 
	 * @param height - the height of the plant
	 * @param color  - the color of the plant
	 * @param type   - the type of the plant
	 */
	public PlantCode(double height, String color, String type) {
		this.height = height;
		this.color = color;
		this.type = type;
	}

	/* Accessors and Mutators */
	/**
	 * Name: changeColor 
	 * Description: changes the color
	 */
	public void changeColor(String newColor) {
		this.color = newColor;
	}

	/**
	 * Name: changeHeight 
	 * Description: changes the height
	 */
	public void changeHeight(double newHeight) {
		if (this.height > newHeight) {
			this.height = this.height;

		} else if (newHeight == 0) {
			this.height = 0;
		} else {
			this.height = newHeight;
		}
	}
	
	/**
	 * Name: getHeight 
	 * Description: gets height
	 * 
	 * @return height
	 */
	public double getHeight() {
		return this.height;
	}

	/**
	 * Name: getColor 
	 * Description: gets color
	 * 
	 * @return color
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 * Name: getType 
	 * Description: gets type
	 * 
	 * @return type
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * Name: grow 
	 * Description: makes the plant grow, can not be less than the
	 * original height
	 */
	public void grow(double newHeight) {
		if (this.height > newHeight) {
			this.height = this.height;
		} else {
			this.height = newHeight;
		}
	}

	/**
	 * Name: cut 
	 * Description: cuts the plant and makes it shorter, can not be
	 * shorter than 0
	 */
	public void cut(double cutHeight) {
		if (this.height < cutHeight) {
			this.height = 0;
		} else {
			this.height = this.height - cutHeight;
		}
	}

	/**
	 * Name: colorChange 
	 * Description: burns the tree and makes it black
	 */
	public void colorChange(String newColor) {
		this.color = "black";
	}

	/**
	 * Name: toString 
	 * Description: outputs the plants' shared attributes
	 * @return - String value for plants attributes
	 */
	public String toString() {
		return "\nheight: " + height + "\nColor: " + color + "\ntype: " + type;
	}
}
