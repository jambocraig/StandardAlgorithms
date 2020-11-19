package sorting;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author craigmurray
 */
public class QuickSort {

    /**
     * @param myList
     * @param left
     * @param right
     * @return 
     */
    public static ArrayList<Integer> quickSort(ArrayList<Integer> myList, int left, int right) {
        int index;
        index = partition(myList, left, right);
        if (left < index - 1) {
            quickSort(myList, left, index - 1);
        }
        if (index < right) {
            quickSort(myList, index, right);
        }
        return myList;

    }

    public static int partition(ArrayList<Integer> myList, int left, int right) {

        int i = left;
        int j = right;
        int pivot = myList.get((left + right) / 2);
        int temp;

        while (i <= j) {
            while (myList.get(i) < pivot) {
                i++;
            }
            while (myList.get(j) > pivot) {
                j--;
            }
            if (i <= j) {
                temp = myList.get(i);
                myList.set(i, myList.get(j));
                myList.set(j, temp);
                i++;
                j--;
            }       

        }
        return i;

    }

    public static void main(String[] args) {
        // demonstrating a Quick Sort
        ArrayList<Integer> testList = new ArrayList<>(Arrays.asList(7, 5, 6, 4, 2, 3));

        quickSort(testList, 0, testList.size()-1);
        System.out.println(testList);
    }

}
