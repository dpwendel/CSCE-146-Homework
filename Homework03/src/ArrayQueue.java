/*
 * Douglas Wendel
 * csce 146
 * homework 03
 * 
 */
public class ArrayQueue<T> implements QueueInterface<T> {
	private T[] queue;
	private int tailIndex; //Technically it is not pointing otwards the first item, it is pointing towards the first NULL item. 
	public static final int DEF_SIZE = 50; //default size
	//what is a mod operator? A mod operator divides the number between the two and posts the remainder
	
	public ArrayQueue()
	{
		init(DEF_SIZE);
	}
	
	public ArrayQueue(int size)
	{
		init(size);
	}
	
	private void init(int size)
	{
		if(size <= 0)
			return;
		tailIndex = 0;
		queue = (T[])(new Object[size]);
	}
	
	public void enqueue(T aData) //puts in quque
	{
		if(tailIndex  >= queue.length)
			return;
		queue[tailIndex] = aData;
		tailIndex++;
	}
	
	public T dequeue() //unqueues
	{
		T ret = queue[0];
		for(int i = 0; i <queue.length-1; i++)
		{
			queue[i] = queue[i+1];
		}
		queue[queue.length-1] = null;
		tailIndex--;
		return ret;
	}
	public T peek() //peek
	{
		return queue[0];
	}
	
	public void print() //print
	{
		for(int i = 0; i < tailIndex; i++)
		{
			System.out.println(queue[i]);
		}
	}

	
	
	
	
	
}


