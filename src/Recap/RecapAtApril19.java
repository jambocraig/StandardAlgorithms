package Recap;

import java.util.*;

/**
 *
 * @author cmurray
 */
public class RecapAtApril19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //populate

        int[] arr;
        int SIZE = 500_000;
        arr = new int[SIZE];

        populateArr(arr, SIZE);

        //System.out.println(Arrays.toString(arr));
        double start = System.nanoTime();
        //binSort(arr, SIZE);
        double stop = System.nanoTime();
        double duration = (stop - start) / 1_000_000;
        System.out.println("Bubble Sort = " + duration + "ms");

        populateArr(arr, SIZE);
        start = System.nanoTime();
        insertionSort(arr, SIZE);
        stop = System.nanoTime();
        duration = (stop - start) / 1_000_000;
        System.out.println("Insertion Sort = " + duration + "ms");
        //System.out.println(Arrays.toString(arr));
        //sort checking
        for (int i = 0; i < SIZE - 1; i++) {
            if (arr[i]>arr[i+1]) {
                System.out.println("WRONG");
            }
        }
    }

    private static void populateArr(int[] arr, int SIZE) {
        int data;
        Random rn = new Random();
        for (int i = 0; i < SIZE; i++) {
            data = rn.nextInt(SIZE);
            arr[i] = data;
        }
    }

    private static void binSort(int[] arr, int SIZE) {
        int temp;
        Boolean flag;
        for (int i = 0; i < SIZE; i++) {
            flag = false;
            for (int j = 0; j < SIZE - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    private static void insertionSort(int[] arr, int SIZE) {
        for (int i = 1; i < SIZE; i++) {
            int temp = arr[i];
            int pos = i - 1;
            while (pos >= 0 && temp < arr[pos]) {
                arr[pos + 1] = arr[pos];
                pos--;
            }
        }
    }
}
