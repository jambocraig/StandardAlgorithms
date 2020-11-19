package sorting;

import java.util.ArrayList;

/**
 *
 * @author craigmurray
 */
public class MergeDevelopment1 {

    public static ArrayList<Integer> mergeSort(ArrayList<Integer> inList) {
        int len;
        int mid;
        len = inList.size();

        if (len == 1) {
            //return the inList of length 1
            //because this will be sorted by definition
            return inList;
        }
        
        //this section only carried out if inList is longer than 1
        
        mid = len / 2;

        ArrayList<Integer> leftList = new ArrayList<>(inList.subList(0, mid));
        ArrayList<Integer> rightList = new ArrayList<>(inList.subList(mid, len));
        
        ArrayList<Integer> l2List = mergeSort(leftList);
        ArrayList<Integer> r2List = mergeSort(rightList);
        
        //merge the sorted sublists together
        ArrayList <Integer>sortedList;
        sortedList = merge(l2List, r2List);

        return sortedList;
    }
    
    public static ArrayList<Integer> merge (ArrayList<Integer> l, ArrayList<Integer> r){
        ArrayList <Integer>mergedList = new ArrayList<>();
        while (!l.isEmpty() && !r.isEmpty()) {
            if (l.get(0) < r.get(0)) {
                mergedList.add(l.get(0));
                l.remove(0);
            } else {
                mergedList.add(r.get(0));
                r.remove(0);
            }
        }
        
        while (!l.isEmpty()) {
            mergedList.add(l.get(0));
            l.remove(0);
        }
        
        while (!r.isEmpty()) {
            mergedList.add(r.get(0));
            r.remove(0);
        }
        return mergedList;
    }

    //public 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // looking at merge sort

        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(4);
        testList.add(2);
        testList.add(1);
        testList.add(3);

        ArrayList<Integer> sList = mergeSort(testList);
        System.out.println(sList);

    }

}
