package Sorting;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author craigmurray
 */
public class SortingTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final int SIZE = 4;
        int[] numArr = new int[SIZE];
        int[] numArr2;
        System.out.println(Arrays.toString(numArr));
        //populateArr(numArr);
        populateArrReverse(numArr);
        numArr2 = Arrays.copyOf(numArr, SIZE);
        System.out.println(Arrays.toString(numArr));

        System.out.println("Bubble Sort Data");
        bubblesort(numArr);
        //System.out.println(Arrays.toString(numArr));
        System.out.println("Insertion Sort Data");
        insertionsort(numArr2);
        //System.out.println(Arrays.toString(numArr2));

    }

    private static void populateArr(int[] numArr) {
        Random rn = new Random();
        int len = numArr.length;
        int data;
        for (int i = 0; i < len; i++) {
            data = rn.nextInt(len);
            numArr[i] = data;
        }
    }

    private static int[] bubblesort(int[] numArr) {
        int data[] = new int[2];
        int len = numArr.length;
        int temp;
        boolean flag;
        int comparisons = 0;
        int swaps = 0;
        for (int i = 0; i < len - 1; i++) {
            flag = false;
            for (int j = 0; j < len - 1 - i; j++) {
                comparisons++;
                if (numArr[j] > numArr[j + 1]) {
                    swaps+= 3;
                    temp = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        data[0] = comparisons;
        data[1] = swaps;
        System.out.println("Comparisons = " + comparisons);
        System.out.println("Swaps = " + swaps);
        return data;
    }

    private static int[] insertionsort(int[] numArr) {
        int[] dataArr = new int[2];
        int len = numArr.length;
        int comparisons = 0;
        int swaps = 0;
        for (int i = 1; i < len; i++) {
            int position = i;
            int data = numArr[position];
            swaps++;
            while (position > 0 && data < numArr[position - 1]) {
                comparisons++;
                swaps++;
                numArr[position] = numArr[position - 1];
                position--;
            }
            numArr[position] = data;
            swaps++;            
        }
        comparisons *= 2;
        System.out.println("Comparisons = " + comparisons);
        System.out.println("Swaps = " + swaps);
        dataArr[0] = comparisons;
        dataArr[1] = swaps;
        return dataArr;
    }

    private static void populateArrReverse(int[] numArr) {
        int len = numArr.length;
        for (int i = 0; i < len; i++) {
            numArr[i] = len - i - 1;
        }
    }

}
