/*
 * Douglas Wendel
 * CSCE 147
 * Homework 07
 */
import java.util.*;
import java.io.*;
public class WordMethod {
	
	private static String dict[] = new String[1000];
	private static int lengthD = 0;
	
	public static void readFile(String fileName) 
	{
		try 
		{
			FileReader file = new FileReader(fileName);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		Scanner scanner = new Scanner(fileName); 
		
		while(scanner.hasNext())
		{
			dict[lengthD++] = scanner.next().toLowerCase();
		}
	}
	
	public static boolean Word(String word)
	{
		if(word.length() < 2)
		{
			return false;
		}
		for(int i =0; i < lengthD; i++)
		{
			if(word.toLowerCase().equals(dict[i]))
			{
				return true;
			}		
		}
		return false;
	}
	
	public static void findings(char letters[], boolean pWords[][], String str, int i, int j)
	{
		pWords[i][j] = true;
		if(str.length() == 5)
		{
			return;
		}
		str = str + letters[i][j];
		
		if(Word(str))
		{
			System.out.println("Found word " +str);
		}
		int i1 = letters.length;
		int j1 = letters[0].length;
		
		for(int rows= i-1; rows <=i+1 && rows<i1; rows++)
		{
			for(int column = j-1; column <= j+1 && column <column; column++)
			{
				if(rows>=0 && column >= 0 && !pWords[rows][column])
				{
					findings(letters,pWords,str,column,rows);
				}
			}
		}
				
			
				
	}
	
	private static void Search(char letters[][])
	{
		int a = letters.length;
		int b = letters[0].length;
		
		boolean pWords[][] = new boolean[][];
	}
}
