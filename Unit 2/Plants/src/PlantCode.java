
public class PlantCode {

	private double height;
	private String color;
	private int age;
	private String type;
	private String amountOfSun;

	public PlantCode(double height, String color, int age, String type, String amountOfSun ) {
		this.height = height;
		this.color = color;
		this.age = 0;
		this.type = "";
		this.amountOfSun = "";
	}
	public PlantCode(String color) {
		this.height = height;
		this.color = color;
		this.age = 0;
		this.type = "";
		this.amountOfSun = "";
	}


	/* Accessors and Mutators */
	public double getHeight() {
		return this.height;
	}

	public String getColor() {
		return this.color;
	}

	public int getAge() {
		return this.age;
	}

	public String getType() {
		return this.type;
	}

	public String getAmountOfSun() {
		return this.amountOfSun;
	}


	public void grow(double newHeight) {
		if (this.height > newHeight) {
			this.height = this.height;
		} else {
			this.height = newHeight;
		}
	}

	public void colorChange (String newColor) {
		this.color = newColor;
	}

}
