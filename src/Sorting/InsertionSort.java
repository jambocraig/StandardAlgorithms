package sorting;

import java.util.ArrayList;

/**
 *
 * @author craigmurray
 */
public class InsertionSort {
    protected static ArrayList<Integer> insertionSort (ArrayList<Integer> inList){
        for (int i = 1; i < inList.size(); i++) {
            if (inList.get(i)<inList.get(i-1)) {
                int temp = inList.get(i-1);
                inList.set(i, temp);                
            }
        }        
        return inList;
    }    
}
