package InsertionSort;

public class InsertionSort9Jan19WithoutBreak {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] intArr = {5, 4, 3, 2, 1};
        //insertion sort
        final int LEN = intArr.length;
        //loop through items 1 to last item
        for (int i = 1; i < LEN; i++) {
            //inner loop 
            //goes from the i point BACKWARDS to position 1
            for (int j = i; j > 0; j--) {                
                //compares items and swaps if necessary
                if (intArr[j] < intArr[j - 1]) {
                    int temp = intArr[j];
                    intArr[j] = intArr[j - 1];
                    intArr[j - 1] = temp;
                }
            }
        }

        for (int i : intArr) {
            System.out.print(i + " ");
        }
    }

}
