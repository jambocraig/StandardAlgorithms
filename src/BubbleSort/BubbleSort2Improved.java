package BubbleSort;

import java.util.Random;

public class BubbleSort2Improved {

    public static void main(String[] args) {
        // generating 10 element array, randomly populated
        int[] numbers = new int[10];
        Random gen = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = gen.nextInt(1000);
        }
        // display original array

        System.out.println("Initial unsorted array");
        for (int number : numbers) {
            System.out.print("|" + number);
        }
        System.out.println("|");

        //BubbleModified
        //Inner loop does not always check the last element
        
        int temp;
        int bubble_count1 = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
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
        System.out.println("Number of comparions = " + bubble_count1);
    }
}
