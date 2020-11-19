package SearchAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author craigmurray
 */
public class SearchingAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numberArraySorted = {2, 5, 7, 9, 11, 13, 16, 77};
        int[] numberArrayUnsorted = {2, 9, 13, 77, 5, 11, 16};
        String[] stringArrSort = {"cat","dog","frog"};
        
        ArrayList<String> stringListS;
        stringListS = new ArrayList<>(Arrays.asList(stringArrSort));
        
        ArrayList<Integer> intListS;
        intListS = new ArrayList<>();
        for (int i : numberArraySorted) {
            intListS.add(i);
        }
        System.out.println(intListS);
        
        
        int num = 77;

        int position;
        
        position = linearSearch(numberArrayUnsorted, num);
        if (position != -1) {
            System.out.println("Value " + num + " found at position " + position);

        } else {
            System.out.println("Value " + num + " not found");
        }

        int position2;
        
        position2 = binarySearch(numberArraySorted, num);
        if (position2 != -1) {
            System.out.println("Value " + num + " found at position " + position2);

        } else {
            System.out.println("Value " + num + " not found");
        }

    }

    private static int linearSearch(int[] numberArray, int num) {
        int pos;
        pos = -1;
        for (int i = 0; i < numberArray.length; i++) {
            if (num == numberArray[i]) {
                pos = i;
            }
        }
        return pos;
    }

    private static int binarySearch(int[] arr, int value) {
        int low, mid, high, pos;
        boolean found;
        pos = -1;
        low = 0;
        high = arr.length - 1;
        
        found = false;
        while (!found && low <= high) {
            mid = (high + low) / 2;
            if (value == arr[mid]) {
                pos = mid;
                found = true;
            } else if (value > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return pos;
    }
}