package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeDevelopment_2019 {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> aList = new ArrayList<>(Arrays.asList(1, 3, 7));
        ArrayList<Integer> bList = new ArrayList<>(Arrays.asList(2, 5, 9));

        ArrayList<Integer> combinedList;
        combinedList = merge(aList, bList);
        System.out.println(combinedList);

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
}
