package BubbleSort;

public class BubbleSort9Jan19METHOD {

    public static void main(String[] args) {
        int[] intArr = {5, 2, 3, 1, 1, 7, 3, 2, 4, 2, 1, 4};

        bubbleSort(intArr);

        for (int i : intArr) {
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int[] intArr) {
        //bubble sort
        int l = intArr.length;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l - 1 - i ; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    int temp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = temp;
                }
            }
        }
    }
    public static void bubbleSortFlag(int[] intArr) {
        //bubble sort with a flag at 28 Mar 19 CFM
        int l = intArr.length;
        boolean swap;
        for (int i = 0; i < l; i++) {
            swap = false;
            for (int j = 0; j < l - 1 - i ; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    int temp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }

}
