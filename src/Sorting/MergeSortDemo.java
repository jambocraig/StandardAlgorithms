package sorting;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author craigmurray
 */
public class MergeSortDemo {

    /**
     * @param sList
     * @return 
     */
    
    public static ArrayList<Integer> mergeSort (ArrayList<Integer> sList){
        int len = sList.size();
        
        // this is the stopping condition
        // where the arraylist is split into lists containing one element
        if (len == 1) {
            return sList;
        }
        
        // finding the mid point for splitting
        int mid = len/2;
        
        //declaring 2 arraylists
        ArrayList<Integer> lList;
        ArrayList<Integer> rList;
        
        //making each list equal half the original list
        lList = new ArrayList<> (sList.subList(0, mid));
        System.out.println("lList " + lList);
        rList = new ArrayList<> (sList.subList(mid, len));
        System.out.println("rList " + rList);
        
        //recursive call to split until lists contain one element
        ArrayList<Integer> left1List = mergeSort (lList);
        ArrayList<Integer> right1List = mergeSort (rList);
        
        // merging the sorted lists together  
        ArrayList<Integer> sortedList = merge (left1List, right1List);
        return sortedList;        
    }
    
    public static ArrayList<Integer> merge (ArrayList<Integer> aList, 
            ArrayList<Integer> bList){
        ArrayList<Integer> combinedList = new ArrayList<>();
        // the next line is used for array implementation ONLY
        //int l = aList.size() + bList.size();
        
        //comparing the first element of two lists
        //putting lowest value into new list
        //removing it from the donor list
        while (!aList.isEmpty() && !bList.isEmpty()) {
            if (aList.get(0)>bList.get(0)) {
                combinedList.add(bList.get(0));
                bList.remove(0);
            } else {
                combinedList.add(aList.get(0));
                aList.remove(0);
            }
        }
        
        //two loops that will insert remainder of elements 
        //when one of the donor lists is empty
        while (!aList.isEmpty()) {
            combinedList.add(aList.get(0));
            aList.remove(0);
        }
        
        while (!bList.isEmpty()) {
            combinedList.add(bList.get(0));
            bList.remove(0);            
        }        
        return combinedList;
    }
    
    public static void main(String[] args) {
        // testing the mergesort
        ArrayList<Integer> testList = new ArrayList<>(Arrays.asList(3,1,4,2));
        testList = mergeSort(testList);
        System.out.println(testList);        
    }    
}
