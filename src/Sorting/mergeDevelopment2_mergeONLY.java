/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author craigmurray
 */
public class mergeDevelopment2_mergeONLY {
    
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Integer> testList1 = new ArrayList<>(Arrays.asList(4,2,7,8));
        ArrayList<Integer> testList2 = new ArrayList<>(Arrays.asList(1,3,6,5));
        ArrayList<Integer> outList = merge(testList1,testList2);
        System.out.println(outList);
    }
    
}
