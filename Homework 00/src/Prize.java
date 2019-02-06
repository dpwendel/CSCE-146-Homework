/*
 * Douglas Wendel
 * CSCE 146
 * 1/29/2018
 */
import java.io.*;
import java.util.Scanner;

public class Prize {	
	public static final String DELIM = "\t"; //Deliminator (TAB)

	
	private String Name;
	private int Prizes;

	public Prize()
	{
	this.Name = "nothing";
	this.Prizes = 0;
	}

	public Prize(String xName, int xPrizes)
	{
	this.setName(xName);
	this.setPrizes(xPrizes);
	}

	public String getName() {
	return Name;
	}

	public void setName(String xName) {
	Name = xName;
	}

	public int getPrizes() {
	return Prizes;
	}

	public void setPrizes(int xPrizes) {
	Prizes = xPrizes;
	}

	public void print()
	{
		System.out.println(getName() + DELIM + getPrizes() );
	}

	
	
}


