package SearchAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinSearchMethod {

    public static void main(String[] args) {
        // Binary Search Algorithm
        char[] letters = {'a', 'f', 'e', 'd', 'r', 'w', 'b', 'q'};
        char value;
        
        Arrays.sort(letters);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character to be found: ");
        value = sc.next().charAt(0);
        
        int mid = -1;
        int low = 0;
        int high = letters.length - 1;
        
        while (low <= high) {
            mid = (low + high)/2;
            if (value < letters[mid]) {
                high = mid - 1;
            } else if (value > letters[mid]) {
                low = mid + 1;
            } else {
                break;
            }
        }
        
        if (mid != -1) {
            System.out.println("Value found at position " + mid);
        } else {
            System.out.println("Value not found");
        }
        
        
        
    }
    
}
