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
public class LinSearch2 {

    /**
     * @param cArr
     * @param c
     * @param args the command line arguments
     * @return 
     */
    public static int linSearch(char[] cArr, char c) {
        // this is the start of Linear Search
        int p = -1;
        for (int i = 0; i < cArr.length; i++) {
            if (cArr[i] == c) {
                p = i;
                break;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        // Linear Search Algorithm
        char[] letters = {'a', 'f', 'e', 'd', 'r', 'w', 'b', 'q'};
        char value;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character to be found: ");
        value = sc.next().charAt(0);
        
        
        int pointer = linSearch(letters, value);
        
        //displaying results
        if (pointer != -1) {
            System.out.println(pointer);
        } else {
            System.out.println("Not found");
        }
    }
}
