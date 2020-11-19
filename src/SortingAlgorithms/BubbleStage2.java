package SortingAlgorithms;

import java.util.ArrayList;

/**
 *
 * @author cmurray
 */
public class BubbleStage2 {

    /**
     * @param args the command line arguments
     */
    /*
    using arr = {3,2,1,0}
    -- bubble sort outer loop
    for i = 0 to arr.length - 2
        --bubble sort inner loop
        for j = 0 to arr.length - 2 - i
            if arr[j]>arr[j + 1] then
                temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp
        next j
    next i
     */
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(0);

        System.out.println("Initial array = " + arr);
        //bubble sort
        for (int i = 0; i < arr.size() - 1; i++) {
            //inner loop
            int temp;
            for (int j = 0; j < arr.size() - 1 - i; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
                System.out.println("Array after comparison " + (j + 1)
                        + " = " + arr);
            }
        }
        System.out.println("Final array = " + arr);
    }
}
