
/*
 * Douglas Wendel
 * CSCE 146
 * Homework 01
 */
public class GenLinkedList <T> //generic type t

{ 
	private class ListNode //Private internal class
	{
		private T data; //type is generic
		private ListNode link;
		
		public ListNode(T aData, ListNode aLink)
		{
			data = aData;
			link = aLink;
		}
	}
	
	private ListNode head; //Ppints to the first item in the list
	private ListNode curr; //Current node of interest
	private ListNode prev; //One node behind current
	
	
	public void add(T aData) //adds at the end of the list
	{
		ListNode newNode = new ListNode(aData,null);//last link in the thing, it has to point to memory address nothing, null
		if(head == null) //does head point to nothing and if so the list is empty
		{
			head = newNode;
			curr = head; // curr = newNode;
			return;
		}
		ListNode temp = head;
		while(temp.link != null)
		{
			temp = temp.link;
		}
		temp.link = newNode;
	}
	
	public void remove() //removes 
	{
		if(curr != null && prev != null) //current is not at the head
		{			
			prev.link = curr.link;
			curr = curr.link;	
		}
		else if(curr != null && prev == null) //current is at the head
		{
			head = head.link;
		}
	}
	
	public T getCurrent() //returns the value of where the current iterator is located
	{
		if(curr != null)
			return curr.data;
		return null;
	}
	
	public void gotoNext() //moves the current foward
	{
		if(curr == null)
			return;
		
		prev = curr;
		curr = curr.link;
	}
	public boolean hasMore()
	{
		return curr != null; 
	}
	
	public void gotoPrevious() //moves the current backwards
	{
		if(prev != null)
			curr = prev;
			prev = prev.link;
	}
	
	public void gotoHead()
	{
		curr = head;
	}
	
	public void print()
	{
		for(ListNode temp = head; temp != null; temp = temp.link)
		{
			System.out.println(temp.data);
		}
		System.out.println();
	}	
	
	
	
	
	
	
}
