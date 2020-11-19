package Tester;

import static BubbleSort.BubbleSort9Jan19METHOD.bubbleSort;
import static BubbleSort.BubbleSort9Jan19METHOD.bubbleSortFlag;
import static InsertionSort.InsertionSort9Jan19FUNCTION.insertionSort;
import static MergeSort.MergeSort.mergeSort;
import java.util.Random;
import static QuickSort.QuickSort.quickSort;
import java.util.Arrays;

public class SortTesterJan19 {

    public static void main(String[] args) {
        long start, stop;
        double duration;
        final int SIZE = 250_000;
        int[] arr = new int[SIZE];
        int[] arr2 = new int[SIZE];
        int[] arr3 = new int[SIZE];
        int[] arr4 = new int[SIZE];
        int[] arr5 = new int[SIZE];
        int[] arr6 = new int[SIZE];
        Random rn = new Random();
        int value;
        for (int i = 0; i < SIZE; i++) {
            value = rn.nextInt(1_000);
            arr[i] = value;
            arr2[i] = value;
            arr3[i] = value;
            arr4[i] = value;
            arr5[i] = value;
            arr6[i] = value;
        }

        start = System.nanoTime();
        bubbleSort(arr);
        stop = System.nanoTime();
        duration = (stop - start) / 1000000000.0;
        System.out.println("Bubble duration = " + duration + " seconds");
        
        start = System.nanoTime();
        bubbleSortFlag(arr2);
        stop = System.nanoTime();
        duration = (stop - start) / 1000000000.0;
        System.out.println("Bubble (with flag) duration = " + duration
                + " seconds");

        start = System.nanoTime();
        insertionSort(arr3);
        stop = System.nanoTime();
        duration = (stop - start) / 1000000000.0;
        System.out.println("Insertion duration = " + duration + " seconds");
        
        start = System.nanoTime();
        mergeSort(arr4, arr4.length);
        stop = System.nanoTime();
        duration = (stop - start) / 1000000000.0;
        System.out.println("Merge duration = " + duration + " seconds");
        
        start = System.nanoTime();
        quickSort(arr5);
        stop = System.nanoTime();
        duration = (stop - start) / 1000000000.0;
        System.out.println("Quick duration = " + duration + " seconds");
        
        start = System.nanoTime();
        Arrays.sort(arr6);
        stop = System.nanoTime();
        duration = (stop - start) / 1000000000.0;
        System.out.println("Built-in duration = " + duration + " seconds");
    }
}
