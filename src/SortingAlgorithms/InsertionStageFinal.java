package SortingAlgorithms;

import static SortingAlgorithms.BubbleStageFinal.popArr;
import static SortingAlgorithms.BubbleStageFinal.popInvArr;
import java.util.ArrayList;

/**
 *
 * @author cmurray
 */
public class InsertionStageFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = 4;
        popArr(arr, n);
        //initial arraylist
        System.out.println(arr);
        insertion(arr);
        System.out.println(arr);

    }

    public static void insertion(ArrayList<Integer> arr) {
        int temp;
        for (int i = 1; i < arr.size(); i++) {
            int pos = i;
            while (pos > 0 && arr.get(pos) < arr.get(pos - 1)) {
                temp = arr.get(pos);
                arr.set(pos, arr.get(pos - 1));
                arr.set(pos - 1, temp);
                pos--;
            }
        }
    }
}
