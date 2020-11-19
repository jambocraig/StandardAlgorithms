package Sorting;

import java.util.Arrays;

/**
 *
 * @author Craig
 */
public class SortTester {

    public static void main(String[] args) {
        final int SIZE = (int) Math.pow(2, 8);
        int[] intArr = new int[SIZE]; 
        int LIMIT = (int) Math.pow(2, 10);
        
        SortingMethods.populate(intArr, SIZE, LIMIT);
        System.out.println(Arrays.toString(intArr));
        //Arrays.sort(intArr);
        SortingMethods.insertion(intArr);
        //bubble(intArr);
        System.out.println(Arrays.toString(intArr));
        
    }

}
