/*
 * Douglas Wendel
 * CSCE 146
 * Homework 01
 */

public class Movie {
	
	private String name;
	private int year;
	private int rating;
	private String director;
	private double gross;
	
	
	public Movie()
	{
		this.name = "none";
		this.year = 0;;
		this.rating = 0;
		this.director = "none";
		this.gross = 0;
	}
	
	public Movie(String xname, int xyear,
			int xrating, String xdirector,
			double xgross) 
	{
		this.setName(xname);
		this.setYear(xyear);
		this.setGross(xgross);
		this.setRating(xrating);
		this.setDirector(xdirector);	
	}
	
	public String getName() {
		return name;
	}

	public void setName(String xname) {
		this.name = xname;
	}
	
	public void setDirector(String xdirector) {
		this.director = xdirector;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int xyear) {
		this.year = xyear;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int xrating) {
		
		if(xrating >= 1 && xrating <= 5)
			{
			this.rating = xrating;
			}
		else
		{
			this.rating = 0; 
		}
	}

	public String getDirector() {
		return director;
	}

	public double getGross() {
		return gross;
	}

	public void setGross(double xgross) {
		this.gross = xgross;
	}
	
	
	public String toString()
	{
		return "Name: " +this.name+"\nYear: "+this.year+"\nRating: "+this.rating+"\nDirector: "+this.director+"\nGross: "+this.gross;		
	}
	
	public void compareTo()
	{
		
	}
	
	


}
