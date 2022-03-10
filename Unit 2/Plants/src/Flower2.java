/**
 * name: Stefany
 * date: march 10
 * description: original subclass
 *
 */
public class Flower2 {

		private boolean poisonous;
		private String waterFrequency;
		private double height;
		private String color;
		private int age;
		private String type;
		private String amountOfSun;


		public Flower2(double height, String color, int age, String type, String amountOfSun,boolean poisonous, String waterFrequency ) {
			this.height = height;
			this.color = color;
			this.age = 0;
			this.type = "";
			this.amountOfSun = "";
			this.poisonous = true;
			this.waterFrequency = "";
		}


		/* Accessors and Mutators */

		public boolean getPoisonous() {
			return this.poisonous;
		}

		public String getWaterFrequency() {
			return this.waterFrequency;
		}

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
		public void pollination () {
			System.out.println("the flower is now pollinated!");
		}
		
		public void wither () {
			System.out.println("the flower withered");
		}
		public void rot () {
			System.out.println("the flower rotted");
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


