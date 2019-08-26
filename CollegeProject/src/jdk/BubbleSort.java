package jdk;

public class BubbleSort {
	
	static void bubbleSort(int arr[], int n)
	{
	    int i, j, temp;
	    for(i = 0; i < n; i++)
	    {
	    	int flag = 0;
	        for(j = 0; j < n-1; j++)
	        {
	            // introducing a flag to monitor swapping
	            
	            if( arr[j] > arr[j+1])
	            {
	                // swap the elements
	                temp = arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = temp;
	                // if swapping happens update flag to 1
	                flag = 1;
	            }
	            
	        }
	        // if value of flag is zero after all the iterations of inner loop
	        // then break out
	        
	        if(flag==0)
	        {
	            break;
	        }
	       
	    }
	    
	    // print the sorted array
	    System.out.println("Sorted Array: ");
	    for(i = 0; i < n; i++)
	    {
	    	System.out.println(arr[i]);
	    }
	}
	
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		long starttime= System.currentTimeMillis();
		int a[]={4,8,1,6,3,2,7,5};
		bubbleSort(a,8);
		long endtime= System.currentTimeMillis();
		System.out.println("total");
		System.out.println(endtime-starttime);
	}

}
