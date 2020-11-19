package SortingAlgorithms;

import java.util.ArrayList;

/**
 *
 * @author cmurray
 */
public class BubbleStageFinal {

    /**
     * @param args the command line arguments
     */
    /*
    using arr = {3,2,1,0}
    -- bubble sort
    for i = 0 to arr.length - 2
        swapped = false
        for j = 0 to arr.length - 2 - i
            if arr[j]>arr[j + 1] then
                temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp
                swap = true
        next j
        if not swap then
            break
        end if
    next i
     */
    
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = 10;
        //populate the arraylist with n random numbers
        popArr(arr, n);
        //populate the arraylist with inverse values
        popInvArr(arr, n);

        System.out.println("Initial array = " + arr);
        //bubble sort
        bubble(arr);

        System.out.println("Final array = " + arr);
    }

    public static void bubble(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            //inner loop
            int temp;
            boolean swap = false;
            for (int j = 0; j < arr.size() - 1 - i; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }

    public static void popArr(ArrayList<Integer> arr, int ceiling) {
        arr.clear();
        for (int i = 0; i < ceiling; i++) {
            //add it to the list
            arr.add((int)(Math.random() * ceiling));
        }
    }

    public static void popInvArr(ArrayList<Integer> arr, int n) {
        arr.clear();
        for (int i = 0; i < n; i++) {
            arr.add(n - i - 1);
        }
    }
}
