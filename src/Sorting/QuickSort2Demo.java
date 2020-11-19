package sorting;

import java.util.Arrays;

public class QuickSort2Demo {

    public static void sort(int[] values) {
        int length = values.length;

        if (length == 0) {
            return;
        }

        quicksort(values, 0, length);
    }

    private static int partition(int arr[], int left, int right) {
        int i = left + 1;

        int pivot = arr[left];

        for (int j = (left + 1); j < right; j++) {
            if (arr[j] < pivot) {
                swap(arr, i, j);
                i++;
            }
        }

        swap(arr, left, i - 1);
        return i;
    }

    public static void quicksort(int arr[], int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1) {
            quicksort(arr, left, index - 1);
        }

        if (index < right) {
            quicksort(arr, index, right);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp;
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        // demonstrating a Quick Sort
        int[] testArr = {4,1,3,2};

        sort(testArr);
        System.out.println(Arrays.toString(testArr));
    }
}
