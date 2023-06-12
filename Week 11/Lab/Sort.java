/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Sort {
    //Q1
    public void selectionSortSmallest(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int currentMin=arr[i];
            int currentMinIndex=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(currentMin>arr[j])
                {
                    currentMin=arr[j];
                    currentMinIndex=j;
                }
            }
            if(currentMinIndex!=i)
            {
                arr[currentMinIndex]=arr[i];
                arr[i]=currentMin;
            }
        }
    }
    
    public void selectionSortLargest(int[] arr)
     {
        for(int i=0;i<arr.length-1;i++)
        {
            int currentMin=arr[i];
            int currentMinIndex=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(currentMin<arr[j])
                {
                    currentMin=arr[j];
                    currentMinIndex=j;
                }
            }
            if(currentMinIndex!=i)
            {
                arr[currentMinIndex]=arr[i];
                arr[i]=currentMin;
            }
        }
    }
}
