/*
 * Douglas Wendel
 * CSCE 146
 * Homework 0.0
 */
import java.util.Scanner;
import java.io.*;

public class ShowcaseGame{
	
	public static final String FILE_NAME = "./TextFiles/prizeList.txt";
	public static void main(String[] args) {
		
		File file = new File(FILE_NAME);
		Scanner f = new Scanner(FILE_NAME); //sets scanner as the file_name

		Scanner scanner = new Scanner(System.in);
		
		//String[] origional = readFromFile(FILE_NAME);
		
		Showcase homergod = new Showcase();
		
		homergod.readFromFile(FILE_NAME);
	

		


		

	}
}
