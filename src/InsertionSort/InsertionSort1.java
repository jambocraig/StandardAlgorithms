/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsertionSort;

import java.util.Random;

/**
 *
 * @author cmurray
 */
public class InsertionSort1 {

    /**
     * @param args the command line arguments
     */
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

        //InsertionSort
        int insertion_count = 0;
        for (int i = 1; i < numbers.length; i++) {
            int st = i;
            int temp;
            // this shows use of short-circuit AND function
            while (st > 0 && numbers[st] < numbers[st - 1]) {
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
    }

}
