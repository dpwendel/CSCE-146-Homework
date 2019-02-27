/*
 * Douglas Wendel
 * CSCE 146
 * Homework 02
 * 2/12/2019
 */
public class Move {
	
	private int total;
	private int guess;
	
	public Move()
	{
		this.total = 0; 
		this.guess = 1; 
	}

	public Move(int xTotal, int xGuess)
	{
		this.guess = xGuess;
		this.total = xTotal;
	}
	
	public int getTotal()
	{
		return total;
	}

	public void setTotal(int xTotal)
	{
		this.total = xTotal;
	}

	public int getGuess() 
	{
		return guess;
	}
	
	public void setGuess(int xGuess)
	{
		if(xGuess >= 1 && xGuess <= 10) //if the name is greater than 10 it will defaultly set to 10
		{
			this.guess = xGuess;
		}
		else
		{
			this.guess = 10;
			System.out.println("Your guess was defaultly changed to 10");
		}
	}
	
	public void addGuess(int xGuess)
	{
		total += xGuess; 
	}
	
	public void TotalSum(int xGuess)
	{
		total+=xGuess;
	}
	
	public boolean PotV(Potato xPotato)
	{
		if(total < xPotato.getPotato())
			return true;
		else
		{
			
		}
		return false;
		//taking in the potato and creating a copy of the potato
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
