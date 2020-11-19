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
public class InsertionSort0PART {

    /**
     * @param args the command line arguments
     */
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
        
            int st = 1;            
            // this shows use of short-circuit AND function
            while (st > 0 && numbers[st] < numbers[st - 1]) {
                temp = numbers[st];
                numbers[st] = numbers[st - 1];
                numbers[st - 1] = temp;
                st--;
            }
        

        // display sorted array
        System.out.println("Sorted array");
        for (int number : numbers) {
            System.out.print("|" + number);
        }
        System.out.println("|");
    }

}
