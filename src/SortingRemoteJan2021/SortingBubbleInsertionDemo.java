package SortingRemoteJan2021;

import java.util.ArrayList;

/**
 *
 * @author Craig
 */
public class SortingBubbleInsertionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declarations
        int size = 10;
        ArrayList<Integer> nums = new ArrayList<>();

        //populate with random values
        popRandom(nums, size);

        //populate with inverse numbers
        popReverse(nums, size);

        //print list
        printList(nums);

        //carry out bubble sort
        //bubble(nums);
        //carry out insertion sort
        insertion(nums);

        //print sorted list 
        printList(nums);

    }

    private static void popRandom(ArrayList<Integer> nums, int size) {
        nums.clear();
        for (int i = 0; i < size; i++) {
            nums.add((int) (Math.random() * size));
        }
    }

    private static void popReverse(ArrayList<Integer> nums, int size) {
        nums.clear();
        for (int i = 0; i < size; i++) {
            nums.add(size - i - 1);
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
            boolean swapped = false;
            for (int j = 0; j < nums.size() - 1 - i; j++) {
                if (nums.get(j) > nums.get(j + 1)) {
                    int temp = nums.get(j);
                    nums.set(j, nums.get(j + 1));
                    nums.set(j + 1, temp);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    //this is the original insertion sort with the write inside the inner loop
    private static void insertionOld(ArrayList<Integer> nums) {
        for (int i = 1; i < nums.size(); i++) {
            int position = i;
            int value = nums.get(i);
            while (position > 0 && value < nums.get(position - 1)) {
                nums.set(position, nums.get(position - 1));
                nums.set(position - 1, value);
                position--;
            }
        }
    }

    private static void insertion(ArrayList<Integer> nums) {
        for (int i = 1; i < nums.size(); i++) {
            int position = i;
            int value = nums.get(i);
            while (position > 0 && value < nums.get(position - 1)) {
                nums.set(position, nums.get(position - 1));
                position--;
            }
            nums.set(position, value);
        }
    }
}