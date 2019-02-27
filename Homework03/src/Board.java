//THIS CLASS HAS ALL METHODS LIKE MOVE RIGHT MOVE DOWN - readfrom file - print
/*
 * Douglas Wenddel
 * CSCE 146
 * Homework 03
 */
import java.util.*;
import java.io.*;
public class Board <T>{
	
	
	private class ListNode
	{
		private T data;
		private ListNode link;
		
		public ListNode(T aData, ListNode aLink)
		{
			data = aData;
			link = aLink;
		}
	}
	
	private ListNode head;
	private ListNode curr;
	private ListNode prev;
	//may need above 
	//may need below
	
	public void readFromFile(String fileName)//method that reads all information and commands from a file
	{
		try
		{
			Scanner fileScanner = new Scanner(new File(fileName));
			while(fileScanner.hasNextLine())
			{
				String fileLine = fileScanner.nextLine();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void print() //prints the current data
	{
		for(ListNode temp = head; temp != null; temp = temp.link)
		{
			System.out.println(temp.data);
		}
		System.out.println();;
		
	}

	
	public void moveRight() //moves current to the right
	{
		//gotonext
		if(curr == null)
			return;
		prev = curr;
		curr = curr.link;
	}
	
	public void moveLeft() //moves current to the left
	{
		//gotoprev
		if(prev != null)
		{
			curr = prev;
			prev = prev.link;
		}
	}
	
	
	public void moveUp()
	{
		
	}
	
	public void moveDown()
	{
		
	}
	
	
	
	

	
	
	
	

}
