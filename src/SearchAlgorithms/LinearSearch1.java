package SearchAlgorithms;

import java.util.Scanner;

public class LinearSearch1 {

    public static void main(String[] args) {
        // Linear Search Algorithm
        char[] letters = {'a','f','e','d','r','w','b','q'};
        char value;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character to be found: ");
        value = sc.next().charAt(0);
        int pointer;
        pointer = findItem(letters, value);
        // this is the start of Linear Search
      
        //displaying results
        if (pointer != -1) {
            System.out.println(pointer);
        } else {
            System.out.println("Not found");
        }        
    }    

    private static int findItem(char[] letters, char value) {
        int pointer = -1;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i]== value) {
                return i;                
            }
        }  
        return -1;
    }
}
