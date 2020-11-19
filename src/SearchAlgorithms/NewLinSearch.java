package SearchAlgorithms;

import java.util.Scanner;

public class NewLinSearch {

    public static void main(String[] args) {
        char[] letters = {'a', 'f', 'e', 'd', 'r', 'w', 'b', 'q'};
        char value;
        
        System.out.print("Enter the letter you wish to find: ");
        Scanner sc = new Scanner (System.in);
        value = sc.next().charAt(0);
        
        int pointer = -1;
        for (int i = 0; i < letters.length; i++) {
            if (value == letters[i]) {
                pointer = i;
                break;
            }
        }
        
        if (pointer != -1) {
            System.out.println("value found at index " + pointer);
        } else {
            System.out.println("value not found");
        }
        
        
    }

}
