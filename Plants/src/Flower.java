/**
 * Name: Stefany Gao
 * Date: march 6. 2022 
 * Description: This program demonstrate inheritance and polymorphism. This is the subclass of PlantCode 
 */

public class Flower extends PlantCode {

	/* Attributes */
	/** if the flower is poisonous */
	private boolean poisonous;
	/** how often to water the flower */
	private String waterFrequency;

	/* Constructor */
	/**
	 * name: Flower 
	 * description: constructor for Flower
	 * 
	 * @param height         - the height of the flower
	 * @param color          - the color of the flower
	 * @param type           - the type of the flower
	 * @param poisonous      - if the flower is poisonous
	 * @param waterFrequency - how often to water the flower
	 */
	public Flower(double height, String color, String type, boolean poisonous, String waterFrequency) {
		super(height, color, type);
		this.poisonous = poisonous;
		this.waterFrequency = waterFrequency;
	}

	/* Accessors and Mutators */

	/**
	 * Name: getPoisonous 
	 * Description: gets whether if the flower is poisonous or not
	 * 
	 * @return - String value for if the flower is poisonous or not
	 */
	public void getPoisonous() {
		if (poisonous = false) {
			System.out.println("It is not poisonous");
		} else {
			System.out.println("It is poisonous");
		}
	}

	/**
	 * Name: getWaterFrequency 
	 * Description: gets how often to water the flowers
	 * 
	 * @return waterFrequency - String value for the water frequency
	 */
	public String getWaterFrequency() {
		return this.waterFrequency;
	}

	/**
	 * Name: pollination 
	 * Description: pollinates the flower
	 */
	public void pollination() {
		System.out.println("the flower is now pollinated!");
	}

	/**
	 * Name: wither 
	 * Description: withers the flower
	 */
	public void wither() {
		System.out.println("the flower withered");
	}

	/**
	 * Name: rot 
	 * Description: rots the flower
	 */
	public void rot() {
		System.out.println("the flower rotted");
	}

	/**
	 * Name: toString 
	 * Description: outputs the flowers' attributes
	 * 
	 * @return - String value for flower attributes
	 */
	public String toString() {
		return "\npoisonous: " + poisonous + "\nwater frequency: " + waterFrequency;
	}
}
