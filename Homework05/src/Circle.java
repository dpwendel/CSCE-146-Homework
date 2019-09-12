/*
 * Douglas Wendel
 * CSCE 146
 * Homework 05
 */
public class Circle {

	private String Type;
	private double radius;
//default constructor	
	public Circle()
	{
		this.Type = "zed";
		this.radius = 0.0;
	}
//parameterized constructor	
	public Circle(String xType, double xRadius)
	{
		this.setType(xType);
		this.setRadius(xRadius);
	}
//getters and setters
	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double xRadius) { //only allows the user to input the radius if its greater than or equal to 0
		if(xRadius >= 0)
			this.radius = xRadius;

		else
			System.out.println("Invalid value");
	}
	
	public double area()
	{
		return Math.PI*(Math.pow(radius,2)); //this calculates the area. to find the area for a circle it is pi x radius squared
	}
	
	public String toString() //final print statement 
	{
		return "Type: " + this.Type + " Radius: " +this.radius + "Area: " +this.area(); 
	}
	
	
	
	
	
	
	
	
	
}
