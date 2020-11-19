package SearchAlgorithms;

import java.util.Scanner;

/**
 *
 * @author cmurray
 */
public class LinearSearchTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declare array of character values
        char[] letters = {'a', 'f', 'e', 'd', 'r', 'w', 'b', 'j'};
        Scanner sc = new Scanner(System.in);
        char value;
        System.out.print("Enter character to be found: ");
        value = sc.nextLine().charAt(0);
        sc.close();

        int pos;
        //calling the linear search function
        pos = linear(letters, value);

        if (pos != -1) {
            System.out.println("Letter found at position " + pos);
        } else {
            System.out.println("Letter not found");
        }
    }

    private static int linear(char[] letters, char value) {
        //iterate through data structure
        for (int i = 0; i < letters.length; i++) {
            //if item found - return pos
            if (value == letters[i]) {
                return i;
            }
        }
        //iteration complete with no find - return -1
        return -1;
    }
}
