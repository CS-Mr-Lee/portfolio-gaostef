
public class Flower {

		private boolean poisonous;
		private String waterFrequency;


		public Flower(boolean poisonous, String waterFrequency) {
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


		public void pollination () {
			System.out.println("the flower is now pollinated!");
		}
		
		public void wither () {
			System.out.println("the flower withered");
		}
		public void rot () {
			System.out.println("the flower rotted");
		}

	}


