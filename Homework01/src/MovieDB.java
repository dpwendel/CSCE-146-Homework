/*
 * Douglas Wendel
 * CSCE 146
 * Homework 02
 */

import java.util.*;
import java.io.*;
public class MovieDB {
	private GenLinkedList<Movie> moviez; 
		public static final String DELIM = "\t";
		
		public MovieDB()
		{
			moviez = new GenLinkedList<Movie>();
		}
		
		public void readFromFile(String fileName)
		{
			try
			{
				Scanner fileScanner = new Scanner(new File(fileName));
				while(fileScanner.hasNextLine())
				{
					String fileLine = fileScanner.nextLine();
					String[] splitLine = fileLine.split(DELIM);
					if(splitLine.length != 5)
					{
						continue;
					}
					String name = splitLine[0];
					int year = Integer.parseInt(splitLine[1]);
					int rating = Integer.parseInt(splitLine[2]);
					String director = splitLine[3];
					Double gross = Double.parseDouble(splitLine[4]);
					Movie newMovie = new Movie(name,year, rating, director,gross);
				}
				fileScanner.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
		//search movie by title for info 
		public void SearchByTitle(Movie xMovie)
		{
			moviez.gotoHead();
			while(moviez.hasMore())
			{
				if(moviez.getCurrent().getName().equals(xMovie.getName()))
				{
					System.out.println(moviez.getCurrent());
					System.out.println();
					break;
				}
				else
				{
					moviez.gotoNext();
				}
			}	
		}
		
		public void writeToFile(String fileName)
		{
			try
			{
				PrintWriter fileWriter = new PrintWriter(new FileOutputStream(fileName));
				moviez.gotoHead();//resets the list to the head
				while(moviez.hasMore())
				{
					fileWriter.println(moviez.getCurrent().getName()+ DELIM + moviez.getCurrent().
							getYear() + DELIM + moviez.getCurrent().getRating() + DELIM + moviez.
							getCurrent().getDirector() + DELIM + moviez.getCurrent().getGross());
					moviez.gotoNext();
				}				
				fileWriter.close();
			}
			catch(Exception e)
			{
				System.out.println(e);;
			}
		}
		
		//add
		public void AddMovies(Movie xMovie)
		{
			moviez.add(xMovie);
		}
		
		//remove by title
		public void removeMovieByName(Movie xMovie)
		{
			moviez.gotoHead();//resets the list to the head
			while(moviez.hasMore())
			{
				if(moviez.getCurrent().getName().equals(xMovie.getName()))
				{
					moviez.remove(); //removes 
					return;
				}
			}
		}
		
		//serach movie list by directors
		public void SearchByDirector(Movie xMovie)
		{
			moviez.gotoHead(); //resets the list to the head
			while(moviez.hasMore())
			{
				if(moviez.getCurrent().getDirector().equals(xMovie.getDirector()))
				{
					System.out.println(moviez.getCurrent());
					System.out.println();
					break;
				}
				else
				{
					moviez.gotoNext(); //moves current to next valuye
				}
			}	
		}
		
		//search movie list by year created
		public void SearchByYear(Movie xMovie)
		{
			moviez.gotoHead();//resets the list to the head
			while(moviez.hasMore())
			{
				if(moviez.getCurrent().getYear() == (xMovie.getYear()))
				{
					System.out.println(moviez.getCurrent());
					System.out.println();
					break;
				}
				else
				{
					moviez.gotoNext();//moves the current to the next current
				}
			}	
		}
		
		//search movie list by rating
		public void SearchByRating(Movie xMovie)
		{
			moviez.gotoHead();//resets the list to the head
			while(moviez.hasMore())
			{
				if(moviez.getCurrent().getRating() == (xMovie.getRating()))
				{
					System.out.println(moviez.getCurrent());
					System.out.println();
					break;
				}
				else
				{
					moviez.gotoNext(); //moves the current to the next current in line
				}
			}	
		}
		
		//Prints all the values of the movies and their information
		public void PrintAllValues()
		{
			//TODO
			moviez.print();
		}
		

			
	
	

	
	
	
	
	
	
}
