package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeMainInLesson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // making the merge function
        
        ArrayList <Integer> aList = new ArrayList(Arrays.asList(3,1,7));
        //ArrayList <Integer> bList = new ArrayList(Arrays.asList(5,2,9));
        
        //ArrayList <Integer> mergedList = mergeSort (aList);
        
        //System.out.println(mergedList);
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> aList, ArrayList<Integer> bList) {
        ArrayList <Integer> outList = new ArrayList<>();
        while (!aList.isEmpty() && !bList.isEmpty()) {
            if (aList.get(0)<bList.get(0)) {
                outList.add(aList.get(0));
                aList.remove(0);
            } else {
                outList.add(bList.get(0));
                bList.remove(0);
            }
        }        
        while (!aList.isEmpty()) {
            outList.add(aList.get(0));
            aList.remove(0);
        }
        while (!bList.isEmpty()) {
            outList.add(bList.get(0));
            bList.remove(0);
        }        
        return outList;
    }

//    private static ArrayList<Integer> mergeSort(ArrayList<Integer> aList) {
//        // the algorithm for merge sort
//        // starting with a recursive instruction to split the list
//        //stopping condition is len = 1
//        
//       //ArrayList <Integer> sortedList = merge (l,r);
//        return sortedList;
//    }
    
}
