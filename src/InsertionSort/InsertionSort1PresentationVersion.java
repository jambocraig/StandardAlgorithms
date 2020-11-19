package InsertionSort;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort1PresentationVersion {

    public static void main(String[] args) {
        int[] numbers = {5,4,3,2,1};
        
        // display original array
        System.out.println("Initial unsorted array");
        for (int number : numbers) {
            System.out.print("|" + number);
        }
        System.out.println("|");

        //InsertionSort
        int insertion_count = 0;
        for (int i = 1; i < numbers.length; i++) {
            int st = i;
            int temp;
            // this shows use of short-circuit AND function
            while (st > 0 && numbers[st] < numbers[st - 1]) {
                //swap the numbers in the array
                temp = numbers[st];
                numbers[st] = numbers[st - 1];
                numbers[st - 1] = temp;
                st--;
                insertion_count++;
            }
        }

        // display sorted array
        System.out.println("Sorted array");
        for (int number : numbers) {
            System.out.print("|" + number);
        }
        System.out.println("|");
        System.out.println("Number of comparisons = " + insertion_count);
        
        //printing an array using Arrays.toString
        System.out.println(Arrays.toString(numbers));
    }
}
