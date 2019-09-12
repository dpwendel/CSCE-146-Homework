/*
 * Douglas Wendel
 * CSCE 146
 * Homework 04
 */
public class selectionSort {

	public void selectionSort(int [] a)//selection sort main method
	{
		for(int i = 0; i < a.length - 1; i++)
		{
				int index = i;
				for (int j = i + 1; j < a.length; j++)
				{
					if (a[j] < a[index]) 
					{
						index = j;
					}
					else
					{
						//does absolutely nothing
						
					}
				}
      
			int smallerNumber = a[index];  
			a[index] = a[i];
			a[i] = smallerNumber;
		}	
	}

	public boolean selectionSortBool(int [] a) //selection sort boolean
	{
		for(int i = 0; i < a.length - 1; i++)
		{
			int index = i;
            	for (int j = i + 1; j < a.length; j++)
            	{
            		if (a[j] < a[index]) 
                	{
                		index = j;
                	}
                	else
                	{
                		//does absolutely nothing
                	}
            	}
      
            	int smallerNumber = a[index];  
            	a[index] = a[i];
            	a[i] = smallerNumber;
    	}	
		return true;
	}

	public int selectionCount(int [] a) //selection Count method
	{
		int count = 0;
		for(int i = 0; i < a.length - 1; i++)
		{
            	int index = i;
            	for (int j = i + 1; j < a.length; j++)
            	{
            		count++;
            		if (a[j] < a[index]) 
            		{
            			index = j;
            		}
            		else
            		{
            			//do nothing
            		}
            	}
      
            	int smallerNumber = a[index];  
            	a[index] = a[i];
            	a[i] = smallerNumber;
		}
		return count;
	}

	public void printselectionSort(int [] a) //print statement for selection sort
	{
		System.out.println("Selection Sort: ");
		for(int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
}
