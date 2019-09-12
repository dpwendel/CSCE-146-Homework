/*
 * Douglas Wendel
 * CSCE 146
 * Homework 04
 */
public class mergeSort {

	public static void mergeSort(int[] a) 
	{
		int size = a.length;
		if(size < 2)
			return;
		int mid = size / 2;
		int leftSize = mid;
		int rightSize = size - mid;
		
		int[] left = new int[leftSize];
		int[] right = new int[rightSize];
		
		for(int i = 0; i < mid; i++) //filling arrays
			left[i] = a[i];
		for(int i = mid; i < size; i++)
			right[i-mid] = a[i]; 
		mergeSort(left);
		mergeSort(right);
		merge(left,right,a);
		
		
	}
	public static void merge(int[] left, int[]right, int[] a)
	{
		int leftSize = left.length;
		int rightSize = right.length;
		int i = 0; //left index
		int j = 0; //right index
		int k = 0; //a's index
		while(i < leftSize && j < rightSize)
		{
			if(left[i] <= right[j])
			{
				a[k] = left[i];
				i++;
				k++;
			}
			else
			{
				a[k] = right[j];
				j++;
				k++;
			}
		}
		while(i < leftSize)
		{
			a[k] = left[i];
			i++;
			k++;
		}
		while(j < rightSize)
		{
			a[k] = right[j];
			j++;
			k++;
		}
	}
	
	public int mergeTotal(int[] left, int[]right, int[] a)
	{
		int leftSize = left.length;
		int rightSize = right.length;
		int i = 0; //left index
		int j = 0; //right index
		int k = 0; //a's index
		int count = 0;
		//for every loop or if statemnt make sure to increment count++
		while(i < leftSize && j < rightSize)
		{
			if(left[i] <= right[j])
			{
				a[k] = left[i];
				i++;
				k++;
				count++;//count increment
			}
			else
			{
				a[k] = right[j];
				j++;
				k++;
				count++;//count increment
			}
		}
		while(i < leftSize)
		{
			a[k] = left[i];
			i++;
			k++;
			count++; //count increment
		}
		while(j < rightSize)
		{
			a[k] = right[j];
			j++;//j inc
			k++;//k inc
			count++; //count increment
		}
		count++; //count increment
		return count; //prints count
	}
	
	public static void mergePrint(int[] a)
	{
		System.out.println("Merge sort:"); //merge sort output statement
		for(int i = 0; i <a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
}
