/*
 * Douglas Wendel
 * CSCE 146
 * Homework
 */
import java.util.*;
public class sheep implements Comparable<sheep>{
	
	private String Name;
	private int Weight;
	
	//parameterized constructor
	public sheep(String aName, int aWeight)
	{
		this.setName(aName);
		this.setWeight(aWeight);
	}
	
	//default
	public sheep() {
		Name = "none";
		Weight = 0;
		
		// TODO Auto-generated constructor stub
	}

	//getters and setters
	public String getName() {
		return Name;
	}
	public void setName(String aName) {
		Name = aName;
	}
	public int getWeight() {
		return Weight;
	}
	public void setWeight(int aWeight) {
		Weight = aWeight;
	}
	
	public String toString()
	{
		return " Name: " +this.getName()+ " Weight: " +this.getWeight();
	}

	//need to do this compare to method
	
	public int compareTo(sheep xSheep)
	{
		//YOU HVE TO HAVE THIS METHOD TO NOT GET A SYNTAX ERROR
		if(this.Weight < xSheep.getWeight())
		{
			return -1;
		}
		else if(this.Weight > xSheep.getWeight())
			return 1;
		else
			return 0;
	}
	

	
}
