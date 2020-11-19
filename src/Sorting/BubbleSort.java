package sorting;

import java.util.ArrayList;

/**
 *
 * @author craigmurray
 */
public class BubbleSort {
    protected static ArrayList<Integer> bubbleSort(ArrayList<Integer> inList) {
        boolean flag;
        
        for (int i = 0; i < inList.size()-1; i++) {
            flag = false;
            for (int j = 0; j < inList.size() - i-1; j++) {
                if (inList.get(j)>inList.get(j+1)) {
                    int temp = inList.get(j);
                    inList.set(j, inList.get(j+1));
                    inList.set(j+1, temp);
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        return inList;
    }
}
