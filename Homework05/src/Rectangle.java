/*
 * Douglas Wendel
 * CSCE 147
 * Homework 05
 */
public class Rectangle {
	
	private String type;
	private double side; 
	private double side1;
	
	//default constructor
	public Rectangle()
	{
		this.type = "zed";
		this.side = 0.0;
		this.side1 = 0.0;
	}
	
	//parameterized constructor
	public Rectangle(String xType, double xSide, double xSide1)
	{
		this.setType(xType);
		this.setSide(xSide);
		this.setSide1(xSide1);
	}

	public String getType() {
		return type;
	}

	public void setType(String xType) {
		this.type = xType;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double xSide) {
		if(xSide > 0)	
			this.side = xSide;
		else
			System.out.println("Invalid value"); //negative or invalid input
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double xSide1) {
		if(xSide1 > 0)
			this.side1 = xSide1;
		else
			System.out.println("Invalid value"); //negative or invalid input
	}
	
	

}
