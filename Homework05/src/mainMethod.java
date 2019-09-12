/*
 * Douglas Wendel
 * CSCE 146
 * Homework 05
 */
import java.io.*;
import java.util.Scanner;
public class mainMethod {
	static final String DELIM = "\t";
	static final String FILE = "Rectangle.txt";
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		//BSTShape BST = new BSTShape();
		System.out.println("Welcome to the shape tree tester!");
		double radius = 0;
		double side = 0;
		double side1 = 0;
		
		BSTreeLL bt = new BSTreeLL();
		
		try 
		{
			Scanner fileScanner = new Scanner(new File(FILE));
			
			while(fileScanner.hasNextLine())
			{
				String line = fileScanner.nextLine();
				String [] split = line.split(DELIM);
				
				if(split.length < 2 || split.length > 4)
				{
					System.out.println("Invalid");
					continue;
				}
				String type = split[0];
				
				switch(type)
				{
				case "Circle":
					Circle c = new Circle();//calls the Circle class
					radius = Double.parseDouble(split[1]);
					c = new Circle(type,radius);
					bt.insert(c);
					break;
				case "Rectangle":
					Rectangle r = new Rectangle(); //calls the Rectangle class
					side = Double.parseDouble(split[1]);
					side1 = Double.parseDouble(split[2]);
					r = new Rectangle(type,side,side1);
					bt.insert(r);
					break;
				case "Triangle":
					rTriangle t = new rTriangle(); //calls the right triangle class
					side = Double.parseDouble(split[1]);
					side1 = Double.parseDouble(split[2]);
					t = new rTriangle(type,side,side1);
					bt.insert(t);
					break;	
				}
				System.out.println(line);
			}
		}	
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println();
		System.out.println("Pre-Order: ");
		//BST.printPreOrder();
		System.out.println("In-Order: ");
		//BST.printInOrder;
		System.out.println("Post-Order: ");
		//BST.printPostOrder();
		System.out.println("Max: " +bt.findMaxInTree());
		
		System.out.println("Values less than 30");
		System.out.println("In-Order: ");
		bt.printInOrder();
		
		
	

	}

}
