package SearchAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author cmurray
 */
public class BinarySearchTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declare array of character values
        char[] letters = {'a', 'f', 'e', 'd', 'r', 'w', 'b', 'j'};
        Arrays.sort(letters);
        Scanner sc = new Scanner(System.in);
        char value;
        System.out.print("Enter character to be found: ");
        value = sc.nextLine().charAt(0);
        sc.close();

        int pos = binary(letters, value);
        
        //presenting results
        if (pos != -1) {
            System.out.println("Letter found at position " + pos);
        } else {
            System.out.println("Letter not found");
        }
    }

    private static int binary(char[] letters, char value) {
        //binary search algorithm
        //set initial pointers
        int low = 0;
        int high = letters.length - 1;
        int mid;
        while (low <= high) {
            //calculate the mid
            mid = (high + low) / 2;
            //actions based on comparison moving appropriate pointer
            if (value < letters[mid]) {
                high = mid - 1;
            } else if (value > letters[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }            
        }
        //return -1 (loop end - not found condition)
        return -1;
    }
}
