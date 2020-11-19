/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchAlgorithms;

import java.util.Scanner;

/**
 *
 * @author cmurray
 */
public class LinearSearchWhileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Linear Search Algorithm
        char[] letters = {'a', 'f', 'e', 'd', 'r', 'w', 'b', 'q'};
        char value;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character to be found: ");
        value = sc.next().charAt(0);

        // this is the start of Linear Search
        int pointer = -1;
        int i = 0;
        boolean found = false;
        while (i < letters.length && !found) {
            if (letters[i] == value) {
                pointer = i;
                found = true;
            }
        }
        //displaying results
        if (pointer != -1) {
            System.out.println(pointer);
        } else {
            System.out.println("Not found");
        }
    }

}
