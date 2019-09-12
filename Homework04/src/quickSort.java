/*
 * Douglas Wendel
 * CSCE 146
 * Homework 04
 */
public class quickSort {

	public void quickSort(int [] a, int leftIndex, int rightIndex)
	{
		int pIndex = partition(a, leftIndex, rightIndex);
	
		if(leftIndex < pIndex-1)
			quickSort(a, leftIndex, pIndex-1);
	
		if(rightIndex > pIndex)
			quickSort(a, pIndex, rightIndex);
	
	}

	public int partition(int [] a, int leftIndex, int rightIndex)
	{
		int i = leftIndex;
		int j = rightIndex;
		int pivot = a[(leftIndex + rightIndex)/2];
	
		while(i <= j)
		{
			while(a[i] < pivot)
			{
				i++;
			}
			while(a[j] > pivot)
			{
				j--;
			}
		
			if(i <= j)
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		return i;
	}
	public int quickSortTotal(int [] a, int leftIndex, int rightIndex)
	{
		int count = 0;
		int i = leftIndex;
		int j = rightIndex;
		int pivot = a[(leftIndex + rightIndex)/2];
	
		while(i <= j)
		{
			count++;
			while(a[i] < pivot)
			{
				i++;
				count++;
			}
			while(a[j] > pivot)
			{
				j--;
				count++;
			}
		
			if(i <= j)
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		return count;
	}
	public void printQuickSort(int [] a)
	{
		System.out.println("quick sort");
	
		for(int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

}
