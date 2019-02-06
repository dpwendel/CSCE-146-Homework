/*
 * Douglas Wendel
 * Homework 0.0
 * CSCE 146 
 */
import java.io.*;
import java.util.Scanner;

public class Showcase {
	
	public static final String FILE_NAME = "./TextFiles/prizeList.txt"; //calls file
	public static final String DELIM = "\t"; //deliminator
	
	File file = new File(FILE_NAME);
	Scanner scanner = new Scanner(FILE_NAME);

	
	public static Prize[] readFromFile(String FILE_NAME) //readFromFile method - allows the tester to print the code
	{
		
		try
		{
			Scanner scanner = new Scanner(FILE_NAME);
			int count = 0; 
			while(scanner.hasNextLine())
			{
				
				scanner.nextLine();
				count++;
			}
			Prize[] matter = new Prize[count]; //creates the array
			scanner = new Scanner(new File(FILE_NAME)); //resets the scanner and puts it to the top of the document
			count = 0; 
			while(scanner.hasNextLine())
			{
				//read the line
				String line = scanner.nextLine();
				//split the line
				String[] splitString = line.split(DELIM);
				if(splitString.length != 3) //check it  
					continue; //if the length of splitStrig is not equal to 3, continue
				matter[count] = new Prize(splitString[0],
						Integer.parseInt(splitString[1]));
				count++; //add
				scanner.close();
				System.out.println(scanner.toString());

			}
			return matter;
				
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
		
				
	}
	
	
	/*public static Prize[] printMethod(String FILE_NAME)
	{
	
		return null;
	}*/
	
		
	/*
	 * Showcase:  A more complex class which holds the arrays for 
	 * the entire prize list and the randomly prize array that is the showcase.  
	 * Each array uses the type Prize.  This class must populate the entire prize
	 * array upon its construction from the file.  Also the file contains each 
	 * prize name and cost separated by a tab.  A method for populating the showcase 
	 * by randomly selecting items from the prize list is strongly recommended.
	 */

	
	
	
	/*
	 * 
	 */
	
	
	
	
	
	
}
