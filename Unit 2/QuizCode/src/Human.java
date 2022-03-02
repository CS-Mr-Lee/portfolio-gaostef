class Human {

	// attributes
	/** The name of the human */
	private String name;
	/** the weight of the human */
	private double weight;
	/** the energy level of the human */
	private int energyLevel;

	// constructor
	/**
	 * Name: Human 
	 * Description: Constructor for the human class
	 * 
	 * @param name        - String value for the name of the human
	 * @param weight      - double value for the weight of the human
	 * @param energyLevel - double value for the energy level of the human
	 */
	public Human(String name, double weight, double energyLevel) {
		this.name = name;
		this.weight = weight;
		//makes sure the energy level stays between 0 and 100
		this.energyLevel = (int) (Math.max(0, Math.min(100, energyLevel))); 
																			
	}

	/**
	 * Name: getName 
	 * Description: gets the name of the human
	 * 
	 * @return - String value for the name of the human
	 */
	public String getName() {
		return name;
	}

	/**
	 * Name: getWeight 
	 * Description: gets the weight of the human
	 * 
	 * @return - returns a double value representing the weight of the human
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Name: getEnergyLevel 
	 * Description: gets the energy level of the human
	 * 
	 * @return - returns a double value for the current energy level of the human
	 */
	public int getEnergyLevel() {
		return energyLevel;
	}

	/**
	 * Name: setWeight 
	 * Description: sets the weight of the human object to the new
	 * weight as specified in the input
	 * 
	 * @param newWeight - double value for the new weight of the human
	 */
	public void setWeight(double newWeight) {
		weight = newWeight;
	}

	/**
	 * name: setEnergyLevel 
	 * description: to change the energy level
	 * 
	 * @param newEnergyLevel
	 */
	public void setEnergyLevel(double newEnergyLevel) {
		//keeps energy level between 0 and 100
		energyLevel = (int) (Math.max(0, Math.min(100, newEnergyLevel)));
	}

	/**
	 * Name: sleep 
	 * Description: human sleeps to gain energy based on hours slept
	 * 
	 * @param hours - int value for the number of hours slept
	 */
	public void sleep(int hours) {
		energyLevel = Math.min(100, energyLevel + 10 * hours); // cannot exceed 100% energy
	}

	/**
	 * Name: run 
	 * Description: human runs and loses energy and weight at the same time
	 * 
	 * @param km - double value for the distance ran in km
	 */
	public void run(double km) {
		//loses 3% of energy level per km
		energyLevel = (int) (Math.max(0, energyLevel - 3 * km)); 
		//loses 0.001kg from weight per km
		weight = Math.max(0, weight - 0.001 * km); 
	}

	/**
	 * name: eat 
	 * description: eating the vegetable. Add weight to the person from
	 * how much grams they ate. add energy level by 1% from each 15 calories. If the
	 * weight trying to be eaten is greater than the weight of the vegetable then
	 * print "I don't have that much food"
	 *
	 * @param veg   vegetable
	 * @param grams the grams eaten
	 */
	public void eat(Vegetable veg, double grams) {

		// gets eaten method from Vegetable
		int caloriesEat = veg.eaten(grams);

		// if the weight trying to be eaten is more than the weight of the vegetable,
		// print "I don't have that much food"
		if (caloriesEat == -1) {
			System.out.println("I don’t have that much food");
			return;
		}

		// converting the grams into kg and adding it to the weight
		weight = weight + (grams / 1000);
		// dividing calories by 15 then rounding it then adding it to the energy level
		// and making sure it is an integer
		energyLevel = (int) (energyLevel + Math.round(caloriesEat / 15.0));
	}

	/**
	 * name: eat 
	 * description: eating the cookie. Add weight to the person from how
	 * much grams they ate. add energy level by 1% from each 15 calories. If the
	 * weight trying to be eaten is greater than the weight of the vegetable then
	 * print "I don't have that much food". If there is packaging in the way, print
	 * "I can't eat the bag"
	 * 
	 * @param food  Cookie
	 * @param grams the grams being eaten
	 */
	public void eat(Cookie food, double grams) {

		//call eaten method from cookie class
		int caloriesGained = food.eaten(grams);

		//if weight being eaten greater than the cookie weight print "I don't have that much food"
		if (caloriesGained == -1) {
			System.out.println("I don’t have that much food");
			return;
		}

		//if weight being eaten greater than the cookie weight print "I can't eat the bag"
		if (caloriesGained == -2) {
			System.out.println("I can’t eat the bag");
			return;
		}

		// converting the grams into kg and adding it to the weight
		weight = weight + (grams / 1000);
		// dividing calories by 15 then rounding it then adding it to the energy level
		// and making sure it is an integer
		energyLevel = (int) (energyLevel + Math.round(caloriesGained / 15.0));
	}

	/**
	 * Name: toString 
	 * Description: returns all the attributes of the human in a string
	 * 
	 * @return - one string value that contains all the attributes and their current values
	 */
	public String toString() {
		return "Name: " + name + "\nWeight: " + weight + "\nEnergy Level: " + energyLevel;
	}
}