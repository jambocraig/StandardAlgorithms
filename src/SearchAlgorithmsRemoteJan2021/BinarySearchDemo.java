package SearchAlgorithmsRemoteJan2021;

import java.util.ArrayList;

/**
 *
 * @author Craig
 */
public class BinarySearchDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        
        nums = [1, 5, 8, 9, 12, 14, 17]
        value = 3
        
        Binary Search Pseudocode
        function binary
           //set the pointers
           lo = 0
           hi = nums.length - 1
        
           while low <= high
              mid = (lo + hi) DIV 2
              if value == nums[mid] then
                 return mid
              else if value > nums[mid] then
                 lo = mid + 1
              else
                 hi = mid - 1
              end if
           end while
           return -1        
        end function
         */

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(6);
        nums.add(8);
        nums.add(10);
        nums.add(11);
        nums.add(16);

        System.out.println(nums);

        int value = 16;

        int position = binary(nums, value);

        System.out.println(position);

    }

    private static int binary(ArrayList<Integer> nums, int value) {
        //setting pointers
        int lo = 0;
        int hi = nums.size() - 1;
        int mid;
        
        //iterate until lo and hi cross over (or exit through success)
        while (lo <= hi) {
            mid = (lo + hi)/2;
            //success checking
            if (value == nums.get(mid)) {
                return mid;
            } else if(value > nums.get(mid)) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }            
        }
        //default - not found
        return -1;
    }

}
