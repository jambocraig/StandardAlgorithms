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
public class SortingDemo_13Jan20211_single {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> nums2 = new ArrayList<>();
        int size = 50_000;
        int step = 1000;
        
        FileWriter fw = new FileWriter("sort_data.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
        for (int i = step; i <= size; i += step) {
            //populate the list with 'size' numbers from 0 to less than size
            popRandom(nums, i);
            //clear the nums2 arraylist and copy everything from the other arraylist
            nums2.clear();
            nums2.addAll(nums);

            long start = System.nanoTime();
            bubble(nums);
            long stop = System.nanoTime();
            double duration = (stop - start) / 1_000_000.0;

            start = System.nanoTime();
            insertion(nums2);
            stop = System.nanoTime();
            double duration2 = (stop - start) / 1_000_000.0;
            
            System.out.println(i + "," + duration + "," + duration2);
            bw.write(i + "," + duration + "," + duration2 + "\n");
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
        }
    }

    private static void insertion(ArrayList<Integer> nums) {
        for (int i = 1; i < nums.size(); i++) {
            int value = nums.get(i);
            int position = i;
            while (position > 0 && value < nums.get(position - 1)) {
                //shuffle the left item into the next place along
                nums.set(position, nums.get(position - 1));
                position--;
            }
            nums.set(position, value);
        }
    }
}
