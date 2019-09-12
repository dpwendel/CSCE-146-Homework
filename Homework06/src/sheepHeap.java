/*
 * Douglas Wendel
 * CSCE 146
 * Homework 06
 */
public class sheepHeap <sheep extends Comparable<sheep>>{
	
	private sheep[] heap;
	private int nullElement; //points to the first null elemebt
	
	public sheepHeap(int nullElement)
	{
		init(nullElement);
	}
	private void init(int nullElement)
	{
		if(nullElement <= 0)
		{
			return;
		}
		heap = (sheep[])(new Comparable[nullElement]);
	}
	
	public void addSheep(sheep aData)
	{
		if(nullElement >= heap.length)
			return;
		heap[nullElement] = aData;
		bubbleUp();
		nullElement++;
	}
	
	private void bubbleUp()
	{
		int index = nullElement; //start from newly added item
		while(index > 0 && heap[pIndex(index)].compareTo(heap[index])<0)
		{
			//SWAP
			sheep temp = heap[pIndex(index)];
			heap[pIndex(index)] = heap [index];
			heap[index] = temp;
			index = pIndex(index);
		}
	}
	private int pIndex(int index)
	{
		return(index-1)/2;
	}
	private int lIndex(int index)
	{
		return index*2+1;
	}
	private int rIndex(int index)
	{
		return index*2+2;
	}
	
	public sheep peek()
	{
		return heap[0];
	}
	public sheep removeSheep()
	{
		sheep temp = peek();
		heap[0] = heap[nullElement-1];
		heap[nullElement-1] = null;
		nullElement--;
		bubbleDown();
		return temp;
	}
	private void bubbleDown()
	{
		int index = 0; //Start from root
		while(lIndex(index) < nullElement)
		{
			//find the larger of the two children
			int bigIndex = lIndex(index);//assume the left is larger
			if(rIndex(index) < nullElement &&
					heap[lIndex(index)].compareTo(heap[rIndex(index)]) < 0)
				bigIndex = rIndex(index);//Right was acutally larger
			if(heap[index].compareTo(heap[bigIndex])<0) {
				//swap
				sheep temp = heap[index];
				heap[index] = heap[bigIndex];
				heap[bigIndex] = temp;
			}
			else
				break; //we didnt have to swap to stop
			index = bigIndex;
		}
	}
	
	public void sheepRollCall()//prints the array of sheep
	{
		for(int i = 0; i< nullElement; i++)
			System.out.println(heap[i].toString());
	}
	
	public sheep peak() //peek method
	{
		return heap[0];
	}
	
	public void sheepHeapSort()
	{
		//this creates a new process heap
		sheepHeap c = new sheepHeap(heap.length);
		//then i need to copy my current process and paste it into another process
		sheep newPH[] = heap.clone(); //clone is a way to copy 
		
		for(int i = 0; i < nullElement; i++)
		{
			c.addSheep(newPH[i]);
			
		}
		for(int i = 0; i< nullElement-1; i++)//size points to first index that is null
		{
			System.out.println(c.removeSheep().toString());
		}

	}
	
	public boolean isEmpty()
	{
		if(peak() != null)
			return false;
		else
			return true;
		
	}

	
	

}
