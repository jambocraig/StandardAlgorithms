package SortingAlgorithms;

import static SortingAlgorithms.BubbleStageFinal.bubble;
import static SortingAlgorithms.BubbleStageFinal.popArr;
import static SortingAlgorithms.BubbleStageFinal.popInvArr;
import static SortingAlgorithms.InsertionStageFinal.insertion;
import java.util.ArrayList;
import java.util.Collections;
import static sorting.MergeSort2.mergeSort;
import static Sorting.QuickSortDemo.quickSort;

/**
 *
 * @author cmurray
 */
public class SortTesterJan2020 {

    /**
     * @param args the command line arguments
     */
    /*
    Test Results
    int n = 1_000_000;
    Duration for bubble sort = 7.5112236245E9µs
    Duration for insertion sort = 5.702220394E9µs
    Duration for merge sort = 4.64120753E7µs
    Duration for quicksort = 286299.5µs
    BUILD SUCCESSFUL (total time: 221 minutes 0 seconds
    
    int n = 10_000_000;
    Duration for merge sort = 1.34122376482E10µs
    Duration for quicksort = 5379352.7µs
    BUILD SUCCESSFUL (total time: 223 minutes 43 seconds)
     */
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        ArrayList<Integer> arr4 = new ArrayList<>();
        int n = 10_000_000;
        popArr(arr1, n);
        //popInvArr(arr2, n);

        for (int i = 0; i < arr1.size(); i++) {
            //arr2.add(arr1.get(i));
            //arr3.add(arr1.get(i));
            arr4.add(arr1.get(i));
        }

        double start, stop, duration;
                
        start = System.nanoTime();
        //bubble(arr1);
        //System.out.println(arr1);
        stop = System.nanoTime();
        duration = (stop - start)/1000;        
        System.out.println("Duration for bubble sort = " + 
                duration + "\u00B5s");
        
        start = System.nanoTime();
        //insertion(arr2);
        //System.out.println(arr2);
        stop = System.nanoTime();
        duration = (stop - start)/1000;        
        System.out.println("Duration for insertion sort = " + 
                duration + "\u00B5s");       
         
        start = System.nanoTime();
        //using quickSortDemo
        //mergeSort(arr3);
        //Collections.sort(arr3);
        //System.out.println(arr3);
        stop = System.nanoTime();
        duration = (stop - start) / 1000;
        System.out.println("Duration for merge sort = "
                + duration + "\u00B5s");

        start = System.nanoTime();
        //using quickSortDemo
        quickSort(arr4, 0, arr4.size() - 1);
        //System.out.println(arr4);
        stop = System.nanoTime();
        duration = (stop - start) / 1000;
        System.out.println("Duration for quicksort = "
                + duration + "\u00B5s");
    }
}
