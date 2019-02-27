/*
 * Douglas Wendel
 * CSCE 146
 * Homework 02
 * 2/12/2019
 */
public class Person {
	
	private String title;
	
	public Person()
	{
		this.title = "none";
	}
	public Person(String xTitle)
	{
		this.settitle(xTitle);
	}
	
	public void settitle(String xTitle)
	{
		this.title = xTitle;
	}
	
	public String gettitle()
	{
		return title;
	}

}



