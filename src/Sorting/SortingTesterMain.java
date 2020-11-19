package sorting;

import java.util.ArrayList;
import java.util.Random;
import static sorting.BubbleSort.bubbleSort;
import static sorting.InsertionSort.insertionSort;
import static sorting.MergeSort2.mergeSort;
import static sorting.QuickSort.quickSort;
import static sorting.QuickSort2.sort;

/**
 *
 * @author craigmurray
 */
public class SortingTesterMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int size = 10000;
        ArrayList<Integer> myList = new ArrayList<>();
        int[] testArr = new int[size];
        //random number test
        Random rn = new Random();

        for (int i = 0; i < size; i++) {
            int x = rn.nextInt(10000000);
            myList.add(x);
            testArr[i] = x;
        }

        //reverse list
        /*
        
       
        for (int i = 0; i < 6700; i++) {
            myList.add(10_000 - i);
            testArr[i] = 10_000 - i;
        } */
        
        
        ArrayList<Integer> myList2 = new ArrayList<>(myList.subList(0, myList.size()));
        ArrayList<Integer> myList3 = new ArrayList<>(myList.subList(0, myList.size()));
        ArrayList<Integer> myList4 = new ArrayList<>(myList.subList(0, myList.size()));

        long start1 = System.nanoTime();
        ArrayList<Integer> sortedList = bubbleSort(myList);
        long end1 = System.nanoTime();
        double duration1 = (end1 - start1) / 1000000.0;
        System.out.println("BubbleSort Duration = " + duration1 + " milliseconds");

        long start2 = System.nanoTime();
        ArrayList<Integer> sortedList2 = insertionSort(myList);
        long end2 = System.nanoTime();
        double duration2 = (end2 - start2) / 1000000.0;
        System.out.println("InsertionSort Duration = " + duration2 + " milliseconds");

        long start3 = System.nanoTime();
        ArrayList<Integer> sortedList3 = mergeSort(myList);
        long end3 = System.nanoTime();
        double duration3 = (end3 - start3) / 1000000.0;
        System.out.println("MergeSort Duration = " + duration3 + " milliseconds");

        long start4 = System.nanoTime();
        ArrayList<Integer> sortedList4 = quickSort(myList, 0, myList.size() - 1);
        long end4 = System.nanoTime();
        double duration4 = (end4 - start4) / 1000000.0;
        System.out.println("QuickSort Duration = " + duration4 + " milliseconds");

        long start5 = System.nanoTime();
        sort(testArr);
        long end5 = System.nanoTime();
        double duration5 = (end5 - start5) / 1000000.0;
        System.out.println("QuickSort2 Duration = " + duration5 + " milliseconds");

    }

}
