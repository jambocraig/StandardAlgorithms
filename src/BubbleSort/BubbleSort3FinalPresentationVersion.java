package BubbleSort;

import java.util.Random;

public class BubbleSort3FinalPresentationVersion {

    public static void main(String[] args) {
        
        //int[] numbers = {5,4,3,2,1};
        //int[] numbers = {1,2,3,4,5};
        int[] numbers = {1,2,3,5,4};
        // display original array

        System.out.println("Initial unsorted array");
        for (int number : numbers) {
            System.out.print("|" + number);
        }
        System.out.println("|");

        //BubbleModified
        //Inner loop does not always check the last element
        
        int temp;
        boolean swap;
        int bubble_count1 = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            swap = false;
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                bubble_count1++;
                if (numbers[j] > numbers[j + 1]) {
                    // set the swap flag to inform that there was need to swap
                    swap = true;
                    temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }
                // if there have been no swaps, break the loops
                if (!swap) break;                   
                
            }
            
        }

        // display sorted array
        System.out.println("Sorted array");
        for (int number : numbers) {
            System.out.print("|" + number);
        }
        System.out.println("|");
        System.out.println("Number of comparisons = " + bubble_count1);
    }
}
