package sorting;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author craigmurray
 */
public class MergeSort2 {

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
        //System.out.println("lList " + lList);
        rList = new ArrayList<> (sList.subList(mid, len));
        //System.out.println("rList " + rList);
        
        //recursive call to split until lists contain one element
        ArrayList<Integer> left1List = mergeSort (lList);
        ArrayList<Integer> right1List = mergeSort (rList);
        
        // merging the sorted lists together  
        ArrayList<Integer> sortedList = merge (left1List, right1List);
        return sortedList;        
    }
    
    public static ArrayList<Integer> merge (ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> c = new ArrayList<>();
        // the next line is used for array implementation ONLY
        //int l = a.size() + b.size();
        
        //comparing the first element of two lists
        //putting lowest value into new list
        while (!a.isEmpty() && !b.isEmpty()) {
            if (a.get(0)>b.get(0)) {
                c.add(b.get(0));
                b.remove(0);
            } else {
                c.add(a.get(0));
                a.remove(0);
            }
        }
        
        //two loops that will insert remainder of elements 
        //when one of the donor lists is empty
        while (!a.isEmpty()) {
            c.add(a.get(0));
            a.remove(0);
        }
        
        while (!b.isEmpty()) {
            c.add(b.get(0));
            b.remove(0);            
        }        
        return c;
    }
    
    public static void main(String[] args) {
        // testing the mergesort
        ArrayList<Integer> testList = new ArrayList<>(Arrays.asList(3,1,4,2));
        testList = mergeSort(testList);
        System.out.println(testList);        
    }    
}
