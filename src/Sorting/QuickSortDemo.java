package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author craigmurray
 */
public class QuickSortDemo {

    /**
     * @param myList
     * @param left
     * @param right
     */
    // this is a procedure - no RETURN statement
    public static void quickSort(ArrayList<Integer> myList, int left, int right) {
        int index;
        index = partition(myList, left, right);
        if (left < index - 1) {
            quickSort(myList, left, index - 1);
        }
        if (index < right) {
            quickSort(myList, index, right);
        }

    }

    // this is a function which returns the leftPointer
    public static int partition(ArrayList<Integer> myList, int left, int right) {

        int leftPointer = left;
        int rightPointer = right;
        //choosing the pivot as the middle element
        int pivot = myList.get((left + right) / 2);
        //int pivot = myList.get(0);
        int temp;

        while (leftPointer <= rightPointer) {
            // comparing the left subarray elements with pivot value
            // if left element is less than pivot the left pointer is moved to the right 
            while (myList.get(leftPointer) < pivot) {
                leftPointer++;
            }
            // comparing the right subarray elements with pivot value
            // if right element is greater than pivot the right pointer is moved to the left 
            while (myList.get(rightPointer) > pivot) {
                rightPointer--;
            }

            // once the above loops have completed, the pointers should either be:
            //- on the pivot
            //- on the first value met that is larger (for leftP) or smaller (for rightP)
            // this IF statement will swap the elements at leftP and rightP
            // and increment leftP/decrement rightP
            if (leftPointer <= rightPointer) {
                temp = myList.get(leftPointer);
                myList.set(leftPointer, myList.get(rightPointer));
                myList.set(rightPointer, temp);
                leftPointer++;
                rightPointer--;
            }

        }
        return leftPointer;

    }

    public static void main(String[] args) {
        // demonstrating a Quick Sort
        ArrayList<Integer> testList = new ArrayList<>(Arrays.asList(7, 2, 8, 5, 4, 1, 6, 3));

        quickSort(testList, 0, testList.size() - 1);
        System.out.println(testList);
    }

}
