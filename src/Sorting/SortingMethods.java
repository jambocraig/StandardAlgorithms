package Sorting;

import java.util.Random;

/**
 *
 * @author Craig
 */
public class SortingMethods {

    public static void populate(int[] intArr, int SIZE, int LIMIT) {
        Random rn = new Random();
        int data;
        for (int i = 0; i < SIZE; i++) {
            data = rn.nextInt(LIMIT);
            intArr[i] = data;
        }
    }

    private static void bubble(int[] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr.length - 1 - i; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    int temp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = temp;
                }
                //System.out.println(Arrays.toString(intArr));
            }
        }
    }

    static void insertion(int[] intArr) {
        for (int i = 1; i < intArr.length; i++) {
            int temp = intArr[i];
            int j = i;
            while (j > 0 && intArr[j - 1] > temp) {
                intArr[j] = intArr[j -1];
                j--;
            }
            intArr[j] = temp;
        }
    }
    
}
