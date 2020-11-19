package sorting;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author craigmurray
 */
public class MergePlay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(3, 1, 4, 2));

        ArrayList<Integer> sortedList = mergeSort2(myList);
        System.out.println(sortedList);
    }

    private static ArrayList<Integer> mergeSort2(ArrayList<Integer> myList) {
        int len = myList.size();
        if (len == 1) {
            return myList;
        }

        int mid = len / 2;
        ArrayList<Integer> leftList = new ArrayList<>(myList.subList(0, mid));
        ArrayList<Integer> rightList = new ArrayList<>(myList.subList(mid, len));

        ArrayList<Integer> left2List = mergeSort2(leftList);
        ArrayList<Integer> right2List = mergeSort2(rightList);
        ArrayList<Integer> sorted = merge(left2List,right2List);
        return sorted;

    }

    public static ArrayList<Integer> merge(ArrayList<Integer> l, ArrayList<Integer> r) {

        ArrayList<Integer> sortedList = new ArrayList<>();
        while (!l.isEmpty() && !r.isEmpty()) {
            System.out.println("loop");
            if (l.get(0) < r.get(0)) {
                System.out.println("left");
                sortedList.add(l.get(0));
                l.remove(0);
            } else {
                System.out.println("right");
                sortedList.add(r.get(0));
                r.remove(0);
            }
        }

        while (!l.isEmpty()) {
            sortedList.add(l.get(0));
            l.remove(0);
        }
        while (!r.isEmpty()) {
            sortedList.add(r.get(0));
            r.remove(0);
        }
        return sortedList;

    }

}
