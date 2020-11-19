package InsertionSort;

import java.util.Random;

public class InsertionSort1BASIC {

    public static void main(String[] args) {
        int[] numbers = {5,4,3,2,1};
        // display original array
        System.out.println("Initial unsorted array");
        for (int number : numbers) {
            System.out.print("|" + number);
        }
        System.out.println("|");

        //InsertionSort
        int temp;
        for (int i = 1; i < numbers.length; i++) {
            int st = i;            
            // this shows use of short-circuit AND function
            while (st > 0 && numbers[st] < numbers[st - 1]) {
                //swap the numbers
                temp = numbers[st];
                numbers[st] = numbers[st - 1];
                numbers[st - 1] = temp;
                //move the pointer to keep pointing at the focus number
                st--;
            }
        }

        // display sorted array
        System.out.println("Sorted array");
        for (int number : numbers) {
            System.out.print("|" + number);
        }
        System.out.println("|");
    }

}
