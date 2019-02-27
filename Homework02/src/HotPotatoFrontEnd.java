/*
 * Douglas Wendel
 * CSCE 146
 * Homework 02
 * 2/14/2019
 */

/*
 * This is the front end of the program. This is where the user 
 * inputs what they want to put in as names, etc which is then ran through
 * the program. 
 */
import java.util.Scanner;
import java.util.Random;
public class HotPotatoFrontEnd {
	public static final int FINAL = 180; //final amoun
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		Random random = new Random();
		int randoe = random.nextInt(FINAL)+1;
		
		Person ads = new Person();
		Potato adsd = new Potato();
		Move mv = new Move();
		Entities entities = new Entities();
		
		System.out.println("Welcome to the hot potato game!"
				+ "\nEnter the amount of players. (2 or more required)");
		int amountOfPlayers = key.nextInt();
		for(int i = 0; i < amountOfPlayers; i++)
		{
			ads = new Person();
			System.out.println("Enter the name of player "+(i+1));
			String Name = key.next();
			ads.settitle(Name);
			ads = new Person(Name);
			entities.addPerson(ads);
		}
		
		adsd = new Potato(10);
		
		entities.HotPotato();

	
	}
}
