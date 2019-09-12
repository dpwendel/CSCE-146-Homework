/*
 * Douglas Wendel
 * CSCE 146
 * Homework 04
 */
public class bubbleSort {
	public void bubbleSort(int[] a)
	{

		boolean hasSwapped = true;
		while(hasSwapped)
		{
			hasSwapped = false;
			for(int i = 0; i < a.length-1; i++)
			{
				if(a[i] > a[i+1])
				{
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					hasSwapped = true;
				}
			}
		}
	}



	public int bubbleTotal(int[] a)
	{
		int count = 0;
		boolean hasSwapped = true;
		while(hasSwapped)
		{
			count++;
			hasSwapped = false;
			for(int i = 0; i < a.length-1; i++)
			{
				count++;
				if(a[i] > a[i+1])
				{
					count++;
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					hasSwapped = true;
				}
			}
		}
		return count;
	}
	
	public void printBubbleSort(int [] a) //bubble sort print methoid 
	{
		System.out.println("Bubble Sort: ");
		for(int i = 0; i <a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

}

