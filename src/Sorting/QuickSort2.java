package sorting;

/**
 *
 * @author cmurray
 */
public class QuickSort2 {

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

    private static void quicksort(int arr[], int left, int right) {
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

}
