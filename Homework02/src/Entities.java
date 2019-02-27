/*
 * DOuglas Wendel
 * CSCE 146
 * Homework 02
 */

import java.util.Scanner;
import java.util.Random;
public class Entities {
	public static final int MAX = 180;

	Scanner key = new Scanner(System.in);
	/*
	 * First thing you have to do is link genLL to person and call it
	 */
	
	private LinkedList<Person>entities;
	
	public Entities()
	{
		entities = new LinkedList<Person>();
	}
		
	public void removePerson(Person xPerson)
	{
		entities.remove(); //removes person
	}
	
	public void addPerson(Person xPerson)
	{
		entities.add(); //adds person
	}
	
	public void print()
	{
		entities.print(); //
	}
	public void StartOver(Person xPerson)
	{
		entities.gotoHead();
	}
	
	public void HotPotato()
	{
		entities.gotoHead();
		
		Random r = new Random();
		
		//NEW VARIABLES
		Person pers = new Person();
		Potato pot = new Potato();
		Move mv = new Move();
		Entities ent = new Entities();
		
		
		int randomrr = r.nextInt(MAX);
		pot = new Potato(10);
		
		mv.setTotal(0); //sets total back to 0
		
		while(mv.PotV(pot) == true)
		{
			entities.gotoHead();
			while(entities.hasMore())
			{
				System.out.println(entities.getCurrent().gettitle() + ", Enter a number from 1-10 coresponding to the number of seconds to hold the potato"); //output statement
				mv.setGuess(key.nextInt()); //sets user # guess
				mv.addGuess(mv.getGuess()); // adds the user # guess
				
				if(mv.PotV(pot)== true)
				{
					System.out.println(entities.getCurrent().gettitle()+ ", is safe for now."); //user is still in, safe.
				}
				else
				{
					System.out.println("HOT POTATO!!! " + entities.getCurrent() + " has been eliminated"); //HOT POTATO output
					entities.remove(); //removes the person
					break;
				}
				entities.gotoNext();
			}
			
		}
		
		
	}
	

	
	
	
	
	
	
	
	
	
}
