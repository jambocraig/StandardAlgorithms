package BubbleSort;

public class bubbleSort9Jan19 {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] intArr = {5, 2, 3, 1, 1, 7, 3, 2, 4, 2, 1, 4};

        //insertion sort
        int l = intArr.length;
        //loop through items 1 to last item
        for (int i = 0; i < l; i++) {
            //inner loop 
            //goes from the i point BACKWARDS to position 1
            for (int j = 0; j < l - 1 - i ; j++) {
                //compares items and swaps if necessary
                if (intArr[j] > intArr[j + 1]) {
                    int temp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = temp;
                }
            }

        }

        for (int i : intArr) {
            System.out.print(i + " ");
        }
    }

}
