package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTester_2019 {

    public static void main(String[] args) {
        ArrayList<Integer> mainList = new ArrayList<>(Arrays.asList(1, 3, 7, 2, 5, 9));

        mainList = mergeSort(mainList);
        System.out.println(mainList);

    }

    private static ArrayList<Integer> merge(ArrayList<Integer> aList, ArrayList<Integer> bList) {
        ArrayList<Integer> combinedList = new ArrayList<>();
        while (!aList.isEmpty() && !bList.isEmpty()) {
            if (aList.get(0) < bList.get(0)) {
                combinedList.add(aList.get(0));
                aList.remove(0);
            } else {
                combinedList.add(bList.get(0));
                bList.remove(0);
            }
        }

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

    private static ArrayList<Integer> mergeSort(ArrayList<Integer> mainList) {
        int len = mainList.size();
        if (len == 1) {
            return mainList;
        }
        int mid = mainList.size() / 2;
        ArrayList<Integer> leftList = new ArrayList<>(mainList.subList(0, mid));
        ArrayList<Integer> rightList = new ArrayList<>(mainList.subList(mid, len));
        
        leftList = mergeSort(leftList);
        rightList = mergeSort(rightList);
        mainList = merge(leftList, rightList);
        return mainList;
    }
}
