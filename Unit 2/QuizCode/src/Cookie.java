
public class Cookie {

	//declaring the variables
	/** the name of the cookie */
	String name;
	/** the weight of the cookie */
	double weight;
	/** the calories of the cookie */
	double calories;
	/** is it packaged or not */
	boolean isPackaged;


	//constructor to initialize the variables
	public Cookie() {
		name = "";
		calories = -1;
		weight = -1;
	}
	/**
	 * Name: Cookie 
	 * Description: Constructor for the cookie class
	 * 
	 * @param name     - String value for the name of the cookie
	 * @param weight   - double value for the weight of the cookie
	 * @param calories - double value for the calories of the cookie
	 */
	public Cookie(String name, double weight, int calories) {
		this.name = name;
		this.calories = calories;
		this.weight = weight;
	}

	/**
	 * Name: Cookie 
	 * Description: Constructor for the cookie class
	 * 
	 * @param name        - String value for the name of the cookie
	 * @param weight      - double value for the weight of the cookie
	 * @param energyLevel - double value for the energy level of the cookie
	 * @param isPackaged  - boolean value for if it is packaged or not
	 */
	public Cookie(String name, double weight, int calories, boolean isPackaged) {
		this.name = name;
		this.calories = calories;
		this.weight = weight;
		this.isPackaged = isPackaged;
	}

	// method to check if it is packaged. If it is, open it
	public void open() {
		if (isPackaged) {
			isPackaged = false;
		}
	}

	/**
	 * name: eaten 
	 * description: method for eating the cookie. Removes grams from the
	 * cookie and calculates how many calories are being ate
	 * 
	 * @param weight the weight being eaten
	 * @return eaten a int value that returns calories eaten
	 * @return -1 returns -1 if more of the weight is being taken from the original
	 *         weight
	 * @return -2 if it is packaged return -2
	 */
	public int eaten(double weight) {
		// if more of the weight is being taken from the original weight, return -1
		if (this.weight < weight) {
			return -1;
		}

		// if it is packaged return -2
		if (isPackaged) {
			return -2;
		}

		// percentage of how much of cookie is being eaten
		double percentage = weight / this.weight;

		// calculating the calories and making it into an integer
		int eaten = (int) (calories * percentage);

		// subtracting the weight and calories eaten from the cookie
		this.weight = this.weight - weight;
		this.calories = this.calories - eaten;

		// returns the calories eaten
		return eaten;

	}

	// toString method that is a string that has the important data of Cookie
	public String toString() {
		return "Name: " + name + "\nWeight: " + weight + "\ncalories: " + calories;
	}
}
