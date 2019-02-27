/*
 * Douglas Wendel
 * CSCE 146
 * Homework 03
 */

//just sets a character

public class Character {
	
	
	private char Char;
	
	public Character() //default constructor
	{ 
		this.Char = 0;
	}
	
	public Character(char xChar) //param
	{
		this.setChar(xChar);
	}
	
	public char getChar() //getter
	{
		return Char;
	}

	public void setChar(char xChar)//set
	{
		this.Char = xChar;
	}
	
	
	
	
	
	

}
