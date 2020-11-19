package SearchAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2 {

    public static void main(String[] args) {
        char[] letters = {'a', 'f', 'e', 'd', 'r', 'w', 'b', 'q'};
        int index_low, index_high, index_mid;
        char value;
        System.out.print("Enter the letter you wish to find: ");
        Scanner sc = new Scanner(System.in);
        value = sc.next().charAt(0);
        // for a binary search to work, the array must be sorted
        Arrays.sort(letters);
                
        //binary search function
        int lo = 0;
        int hi = letters.length - 1;
        int mid = -1;
        while (lo <= hi) {
            mid = (hi + lo) / 2;
            if (value < letters[mid]) {
                hi = mid - 1;
            } else if (value > letters[mid]) {
                lo = mid + 1;
            } else {
                break;
            }
            mid = -1;
        }
        
        //displaying results
        if (mid!=-1) {
            System.out.println("location " + mid);
        } else {
            System.out.println("Not Found");
        }        
    }
}
