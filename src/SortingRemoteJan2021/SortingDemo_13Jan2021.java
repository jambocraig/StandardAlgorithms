package SortingRemoteJan2021;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Craig
 */
public class SortingDemo_13Jan2021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // declarations
        //int size = 100000;
        ArrayList<Integer> nums = new ArrayList<>();
        FileWriter fw = new FileWriter("BubbleData3.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        double total;
        double average;
        int subtests;
        for (int size = 1_000; size < 500_000; size += 500) {
            total = 0;
            subtests = 10;
            for (int i = 0; i < subtests; i++) {
                //COMPLETE THE METHODS BELOW
                //populate the list with 'size' numbers from 0 to less than size
                popRandom(nums, size);

                //populate the list with descending numbers from ('size' - 1) to 0
                //popReverse(nums, size);
                //print list
                //printList(nums); 
                long start = System.nanoTime();
                //call to bubble procedure
                bubble(nums);
                long stop = System.nanoTime();
                double duration = (stop - start) / 1_000_000.0;
                //System.out.println("duration = " + duration + " mS");
                total += duration;

                //print the sorted list
                //printList(nums);
            }
            average = total/subtests;
            bw.write(size + "," + average + "\n");
        }

        bw.close();

    }

    private static void popRandom(ArrayList<Integer> nums, int size) {
        nums.clear();
        for (int i = 0; i < size; i++) {
            nums.add((int) (Math.random() * size));
        }
    }

    private static void popReverse(ArrayList<Integer> nums, int size) {
        nums.clear();
        for (int i = size - 1; i > -1; i--) {
            nums.add(i);
        }
    }

    private static void printList(ArrayList<Integer> nums) {
        for (Integer num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void bubble(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size() - 1; i++) {
            //set a boolean flag to false - no swaps
            boolean swapped = false;
            for (int j = 0; j < nums.size() - 1 - i; j++) {
                if (nums.get(j) > nums.get(j + 1)) {
                    int temp = nums.get(j);
                    nums.set(j, nums.get(j + 1));
                    nums.set(j + 1, temp);
                    swapped = true;
                }
            }
            //detect no swap
            if (!swapped) {
                break;
            }
            swapped = false;
        }
    }
}
