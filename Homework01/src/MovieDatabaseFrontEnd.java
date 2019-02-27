/*
 * Douglas Wendel
 * Homework 02
 * CSCE 146
 */

import java.util.Scanner;
public class MovieDatabaseFrontEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		//creates a new instance of Movie Database
		MovieDB movieDB = new MovieDB();
		Movie m = new Movie();
		System.out.println("Welcome to the movie Database");
		boolean quit = false;
		
		
		
		while(quit == false)
		{
			//prompts the user 
			System.out.println("Enter 1 to add a movie\n"
					+ "Enter 2 to remove a movie by its title\n"
					+ "Enter 3 to search for a Title\n"
					+ "Enter 4 to search for movies by a Director\n"
					+ "Enter 5 to search for movies of a  given year\n"
					+ "Enter 6 to search for movies of a certain Rating\n"
					+ "Enter 7 to print out all movies\n"
					+ "Enter 8 to print to a database file\n"
					+ "Enter 9 to load a database file\n"
					+ "Enter 0 to quit");
			int input = key.nextInt();
			
			
			
			switch(input)
			{
			case 0: 
				quit = true;
				break;
				
				
			case 1:
				m = new Movie();
				key.nextLine();
				System.out.println("Enter the name");
				String name = key.nextLine();
				System.out.println("Enter the year");
				int year = key.nextInt();
				System.out.println("Enter a rating between 1 and 5");
				int rating = key.nextInt();
				System.out.println("Enter the directtors name");
				String directorName = key.next();
				System.out.println("Enter the box office gross");
				double BOG = key.nextDouble();
				m = new Movie(name, year, rating, directorName, BOG);
				movieDB.AddMovies(m);
				break;
				
				
			case 2:
				m = new Movie();
				key.nextLine();
				System.out.println("Enter the name of the movie you want to remove");
				name = key.nextLine();
				year = 1;
				rating = 1;
				directorName = "no name";
				BOG = 1.0;
				m = new Movie(name, year, rating, directorName, BOG);
				movieDB.removeMovieByName(m);
				break;
				
				
			case 3:
				m = new Movie();
				key.nextLine();
				System.out.println("Enter the name of the movie you want to search for");
				name = key.nextLine();
				directorName = "no name";
				year = 1;
				rating = 1;
				BOG = 1.0;
				m = new Movie(name, year, rating, directorName, BOG);
				movieDB.SearchByTitle(m);
				break;
				
				
			case 4:
				m = new Movie();
				key.nextLine();
				System.out.println("Enter the directors name of the movie you want to search for");
				directorName = key.nextLine();
				name = "no name";
				year = 1;
				rating = 1;
				BOG = 1.0;
				m = new Movie(name, year, rating, directorName, BOG);
				movieDB.SearchByDirector(m);
				break;
				
				
			case 5: 
				m = new Movie();
				key.nextLine();
				System.out.println("Enter the year you want to search movies.");
				year = key.nextInt();
				name = "no name";
				rating = 1;
				directorName = "no name";
				BOG = 1.0;
				m = new Movie(name, year, rating, directorName, BOG);
				movieDB.SearchByYear(m);
				break;
				
				
			case 6:
				m = new Movie();
				key.nextLine();
				System.out.println("Enter the rating you want to search movies");
				rating = key.nextInt();
				name = "no name";
				year = 1;
				BOG = 1.0;
				directorName = "no name";
				m = new Movie(name, year, rating, directorName, BOG);
				movieDB.SearchByRating(m);
				break;
				
				
			case 7:
				key.nextLine();
				System.out.println("Printing all values");
				movieDB.PrintAllValues();
				break;
				
				
			case 8:
				key.nextLine();
				System.out.println("Printing to a database file");
				movieDB.writeToFile("mv.txt");
				break;
				
				
			case 9:
				key.nextLine();
				System.out.println("Loading a database file");
				movieDB.readFromFile("mv.txt");
				break;
				
				
		
		}

	}

}
}

