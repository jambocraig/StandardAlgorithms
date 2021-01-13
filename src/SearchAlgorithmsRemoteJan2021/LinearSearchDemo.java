package SearchAlgorithmsRemoteJan2021;

import java.util.ArrayList;

/**
 *
 * @author Craig
 */
public class LinearSearchDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // demonstrating linear search
        /*
        
        assumption - 
        a list or array with integers is passed
        to the function, with a search value
        
        nums = [4, 3, 7]
        value = 5
        
        linear search pseudocode
        
        function linear(nums, value)
           for i = 0 to nums.length - 1
              if value == nums[i] then
                 return i
              end if
           next i
           return -1
        end function
        */
        
        int size = 10;
        
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            nums.add((int)(Math.random() * size));
        }
        
        System.out.println(nums);
        
        int value = 7;
        
        int position;
       
        position = linear(nums, value); 
        System.out.println("The value " + value + " was found at position " + position);        
    }

    private static int linear(ArrayList<Integer> nums, int value) {
        //iterate through the data structure
        for (int i = 0; i < nums.size(); i++) {
            //if the value is found, return the index
            if (value == nums.get(i)) {
                return i;
            }
        }
        //default - value not found
        return -1;        
    }
    
}
