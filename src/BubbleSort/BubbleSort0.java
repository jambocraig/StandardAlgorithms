package BubbleSort;

public class BubbleSort0 {

    public static void main(String[] args) {
        int[] testArray = {5,4,3,2,1};
        
        for (int i : testArray) {
            System.out.print(i);
            System.out.print(" ");
        }        
        System.out.println();
        
        int temp;
        //inner sort for bubble
        for (int i = 0; i < testArray.length - 1; i++) {
            if (testArray[i]> testArray[i+1]) {
                temp = testArray[i+1];
                testArray[i+1] = testArray[i];
                testArray[i] = temp;
            }
        }
        
        for (int i : testArray) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
    
}
