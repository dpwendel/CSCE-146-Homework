/*
 * Douglas Wendel
 * CSCE 147
 * Homework 07
 */
public class GenLL<T> {
	
	private class ListNode
	{
		private T data;
		private ListNode link,prev;
		public ListNode(T xData, ListNode xLink) //PARAMETERIZED CONSTRUCTOR - DEFAULT
		{
			data = xData;
			link = xLink;
		}
		//this is a default list node class
	}
	
	private ListNode head; //points to first item - first item in list 
	private ListNode curr; //points to item of interest - current item selected in list
	private ListNode prev; //one behind the current - previous item 
	
	public GenLL()
	{
		head = curr = prev = null;
	}
	public T getCurrent()
	{
		if(curr != null)
			return curr.data;
		return null;
	}
	public void setCurrent(T aData)
	{
		if(curr != null)
		{
			curr.data = aData;
		}
	}
	public void gotoNext()
	{
		if(curr == null)
			return;
		prev = curr;
		curr = curr.link; //in other wise point to its next. 	
	}
	
	public void resetCurrent() //takes current and points it back to the head - HOW TO FIX THE LAB!!!!!!!!!!!!!!!!!
	{
		curr = head;
	}
	
	public boolean hasMore()
	{
		return curr != null;
	}
	
	public void insert(T aData)
	{
		ListNode newNode = new ListNode(aData,null);
		if(head == null)
		{
			head = newNode;
			curr = head;
			return;
		}
		ListNode temp = head;
		while(temp.link != null) //this is your for int i = 0; loop.
			temp = temp.link;
		temp.link = newNode;
	}
	
	public void insertAfterCurrent(T aData)
	{
		if(curr == null)
		{
			return;
		}
		ListNode newNode = new ListNode(aData, curr.link);
		curr.link = newNode;
	}
	
	
	public void deleteCurrent()
	{
		if(curr != null && prev != null)
		{
			prev.link = curr.link;
			curr = curr.link;
		}
		else if(curr != null) //it has to be the head
		{
			head = head.link;
		}
	}
	
	public void print()
	{
		ListNode temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.link;
		}
	}
	
	public boolean isContained(T aData) //is the data i passed in here in a contained structure?
	{
		return this.findNodeWith(aData) != null; //if i return null here i did not find that data. so if it is contained it wont be null
	}
	
	public void gotoItem(T aData)
	{
		ListNode temp = this.findNodeWith(aData);
		if(temp == null)
			return;
		this.resetCurrent();
		while(this.hasMore() && curr != temp)
			this.gotoNext();
	}
	
	private ListNode findNodeWith(T aData)		// i hav eto make this private because i dont have a list node outside of this class
	{
		ListNode temp = head;
		while(temp != null)
		{
			if(temp.data.equals(aData))
			{
				return temp;
			}
			temp = temp.link;
		}
		return null;
	}
}
