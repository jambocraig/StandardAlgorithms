package BubbleSort;

import java.util.Random;

public class BubbleSort1 {

    public static void main(String[] args) {
        // generating 10 element array, randomly populated
        int[] numbers = new int[10];
        Random gen = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = gen.nextInt(100);
        }
        // display original array

        System.out.println("Initial unsorted array");
        for (int number : numbers) {
            System.out.print("|" + number);
        }
        System.out.println("|");

        //BubbleBasic
        int temp;
        final int LEN = numbers.length;
        int bubble_count1 = 0;

        for (int i = 0; i < LEN-1; i++) {
            for (int j = 0; j < LEN - 1; j++) {
                //this line is for diagnostics ONLY
                bubble_count1++;
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }
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
