/*
 * Douglas Wendel
 * CSCE 146
 * Homework 05
 */

import java.util.Random;
public class SearchAlgTester {

	public static final int n = 999;
	public static final int max = 1000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("----------------------------------");
		System.out.println("Sorting Method Complexity Tester");
		System.out.println("----------------------------------");

		
		Random r = new Random();
		int derg = 0;
		int half = derg/2;
		
		//create values for each method/array 
		int selectionTotal = 0;
		int bubbleTotal = 0;
		int mergeTotal = 0;
		int quickTotal = 0;
		
		//init objects (bubbleSort bubbleSort = new BubbleSort()
		bubbleSort bubbleSort1 = new bubbleSort();
		quickSort quickSort1 = new quickSort();
		selectionSort selectionSort1 = new selectionSort();
		mergeSort mergeSort1 = new mergeSort();
		
				
		while(derg < 20) //this while loop runs twenty times
		{
			//in thewhile loop you need to create 4 arrays since we have to do 4 methods
			
			int[] selection = new int[max];
			int[] bubble = new int[max];
			int[] quick = new int[max];
			int[] merge = new int[max];
			
			for(int i = 0; i < max; i++)
			{
				int randy = r.nextInt(n);
				selection[i] = randy;
				bubble[i] = randy;
				quick[i] = randy;
				merge[i] = randy;
			}
			
			//selection sort section where you find the total of it
			selectionTotal += selectionSort1.selectionCount(selection);
			selectionSort1.selectionSort(selection);
			selectionSort1.printselectionSort(selection);
			
			//bubble
			bubbleTotal += bubbleSort1.bubbleTotal(bubble);
			bubbleSort1.bubbleSort(bubble);
			bubbleSort1.printBubbleSort(bubble);
			
			//merge sort
			int[] left = new int[half];
			int[] right = new int [max-half];
			for(int i = 0; i < half; i++)
			{
				left[i] = merge[i];
			}
			for(int i = half; i < max; i++)
			{
				right[i-half] = merge[i];
			}
			mergeTotal += mergeSort1.mergeTotal(left, right, merge);
			mergeSort1.mergeSort(merge);
			mergeSort1.mergePrint(merge);
			
			//quick sort
			quickTotal += quickSort1.quickSortTotal(quick, quickTotal, quickTotal);
			quickSort1.quickSort(quick, quickTotal, quickTotal);
			quickSort1.printQuickSort(quick);
			
			derg++;
		}
		System.out.println("20 Selection Sort Trials = " + selectionTotal );
		System.out.println("20 Bubble Sort Trials = " + bubbleTotal);
		System.out.println("20 Merge Sort Trials = " + mergeTotal);
		System.out.println("20 Quick Sort Trials = " +quickTotal);
		
	}

}
