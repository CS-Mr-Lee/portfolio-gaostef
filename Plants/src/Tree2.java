///**
// * Name: Stefany 
// * Date: march 6. 2022 
// * description: original subclass for tree
// * 
// */
//
//public class Tree2 {
//
//
//	private boolean hasFruit;
//	private double leafPercentage;
//	private double height;
//	private String color;
//	private String type;
//
//	public Tree2(double height, String color,  String type, double leafPercentage ) {
//		this.height = height;
//		this.color = color;
//		
//		this.type = "";
//		
//		
//		if (leafPercentage < 0) {
//			this.leafPercentage = 0;
//		} else if (leafPercentage > 100) {
//			this.leafPercentage = 100;
//		} else {
//			this.leafPercentage = leafPercentage;
//		}
//	}
//
//	/* Accessors and Mutators */
//
//	public boolean getHasFruit() {
//		return this.hasFruit;
//	}
//
//	public double getLeafPercentage() {
//		return this.leafPercentage;
//	}
//
//	public double getHeight() {
//		return this.height;
//	}
//
//	public String getColor() {
//		return this.color;
//	}
//
//	public int getAge() {
//		return this.age;
//	}
//
//	public String getType() {
//		return this.type;
//	}
//
//	public String getAmountOfSun() {
//		return this.amountOfSun;
//	}
//
//
//	public void grow(double newHeight) {
//		if (this.height > newHeight) {
//			this.height = this.height;
//		} else {
//			this.height = newHeight;
//		}
//	}
//
//	public void colorChange (String newColor) {
//		this.color = newColor;
//	}
//
//	public void burn(String burnt) {
//
//		this.color = "black";
//	}
//
//	public void getChopped(double newHeight) {
//
//		if (this.height > newHeight) {
//			this.height = this.height;
//
//		} else if (newHeight == 0) {
//			this.height = 0;
//		} else {
//			this.height = newHeight;
//		}
//	}
//	public void leaves (double newLeafPercentage) {
//		if (newLeafPercentage < 0) {
//			this.leafPercentage = 0;
//		} else if (newLeafPercentage > 100) {
//			this.leafPercentage = 100;
//		} else {
//			this.leafPercentage = newLeafPercentage;
//		}
//
//	}
//
//}
