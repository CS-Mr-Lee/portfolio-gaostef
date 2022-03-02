
public class Vegetable {

	//declaring the variables
	/** the name of the vegetable*/
	private String name;
	/** the calories of the vegetable*/
	private int calories;
	/** the weight of the vegetable*/
	private double weight;

	//constructor to initialize the variables
	public Vegetable() {
		name = "";
		calories = -1;
		weight = -1;
	}
	
	/**
	 * name: Vegetable
	 * description: sets name, calories, and weight
	 * 
	 * @param name name of vegetable
	 * @param calories calories of vegetable
	 * @param weight weight of vegetable
	 */
	public Vegetable(String name, int calories, double weight) {
		this.name = name;
		this.calories = calories;
		this.weight = weight;
		
	}


	/**
	 * Name: getName 
	 * Description: gets the name of the vegetable
	 * 
	 * @return name a string value that returns the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * Name: getCalories 
	 * Description: gets the calories of the vegetable
	 * 
	 * @return a int value that holds calories 
	 */
	public int getCalories() {
		return calories;
	}


	/**
	 * Name: getWeight
	 * Description: gets the weight of the vegetable
	 * 
	 * @return a double value that weight returns the weight
	 */
	private double getWeight() {
		return weight;
	}

	
	/**
	 * name: setWeight
	 * description: sets new weight
	 * 
	 * @param weight the new weight
	 */
	public void setWeight(double weight) {

			this.weight = weight;
		}
	

	/**
	 * name: eaten
	 * description: method for eating the vegetable. if the weight trying to eat is more than the
	 * vegetable weight, return -1. Calculates how much is being eaten and how much calories is it
	 * 
	 * @param weight the weight trying to be eaten
	 * @return eaten a int value that returns the calories eaten
	 * @return -1 if weight trying to be eat greater than weight of vegetable
	 */
	public int eaten(double weight) {
		//if the weight trying to get eaten is more than the vegetable weight return -1
		if (this.weight < weight) {
			return -1;

		}
		//calculating the percentage of how much is being eaten
		double percentage = weight / this.weight;
		//calculating the calories of what's being eaten
		int eaten = (int) (this.calories * percentage);

		//subtracting the eaten weight and calories from the weight and calories
		this.weight = this.weight-weight;
		this.calories = this.calories - eaten;

		//returns the calories eaten
		return eaten;
	}


		//toString method that returns a string that has important information about the vegetable
	public String toString() {
		return "Name: " + name + "\nWeight: " + weight + "\ncalories: " + calories;
	}
}
