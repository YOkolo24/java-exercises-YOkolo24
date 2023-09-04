package com.cbfacademy;

import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int [] array, int searchValue) {
    
        Arrays.sort(array);
        int low = 0;
        int high = array.length - 1;
    
        while(low <= high) {
            int mid = (low + high)/2; 

            if (searchValue == array[mid]) 
                return mid;

            else if (searchValue > array[mid]) 
                low = mid + 1;

            else                       
                high = mid - 1; 
        }
        return -1;
    }   
}

/* The code above has come from the following puesdo-code:
 * do until the pointers low and high meet each other.
    mid = (low + high)/2
    if (x == arr[mid])
        return mid
    else if (x > arr[mid]) // x is on the right side
        low = mid + 1
    else                       // x is on the left side
        high = mid - 1
    if none of the above, return -1
  */