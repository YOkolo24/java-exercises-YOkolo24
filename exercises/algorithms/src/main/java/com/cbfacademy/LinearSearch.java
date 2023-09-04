package com.cbfacademy;

public class LinearSearch {
    
    static int linearSearch(int arr[], int n, int x)
    {
        for (int i = 0; i < n; i++) {
            
            if (arr[i] == x)
                return i;
        }

        return -1;
    }
}

/* the code above can be found using the folling psuedo-code:
 * PROCEDURE LINEAR_SEARCH (LIST, VALUE)
  FOR EACH ITEM IN THE LIST
     IF SAME ITEM == VALUE
          RETURN THE ITEM’S LOCATION
     END IF
  END FOR
END PROCEDURE

For the above, 'n' is the length of the array, 'x' is the element to be found and 
the array elements can be declared in the main method.

 */