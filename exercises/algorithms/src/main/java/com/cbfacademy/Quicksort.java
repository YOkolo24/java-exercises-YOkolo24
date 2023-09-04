package com.cbfacademy;

import java.util.Arrays;

public class Quicksort {

    public static void quickSort(Arrays [] arr, int beg, int end) { 

        int pivotIndex = -1;

        if (beg < end) {
            pivotIndex = this.partition(arr, beg, end);
            quickSort(arr, beg, pivotIndex);
            quickSort(arr, pivotIndex + 1, end);
        }
    }
    public static int partition(Arrays [] arr, int beg, int end) {

        int pivotIndex = end;
        int pIndex = beg - 1;

        for(int i = beg; i < end -1; i++) {

            if (arr[i] <= pivotIndex) {
                pIndex++;
                Arrays temp = arr[pIndex];
                arr[pIndex] = arr[i];
                arr[i] = temp;
            }
        }

        Arrays temp = arr[pIndex + 1];
        arr[pIndex + 1] = arr[pivotIndex];
        arr[pivotIndex] = temp;
        
        return pIndex + 1;

    }
}

/* Code adpated from the following psuedo-code:
quickSort(arr, beg, end)
  if (beg < end)
    pivotIndex = partition(arr,beg, end)
    quickSort(arr, beg, pivotIndex)
    quickSort(arr, pivotIndex + 1, end)

partition(arr, beg, end)
  set end as pivotIndex
  pIndex = beg - 1
  for i = beg to end-1
  if arr[i] < pivot
    swap arr[i] and arr[pIndex]
    pIndex++
  swap pivot and arr[pIndex+1]
return pIndex + 1
*/    
