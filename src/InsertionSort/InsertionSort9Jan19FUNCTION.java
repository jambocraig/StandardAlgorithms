package InsertionSort;

public class InsertionSort9Jan19FUNCTION {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] intArr = {5, 2, 3, 1, 1, 7, 3, 2, 4, 2, 1, 4};

        insertionSort(intArr);

        for (int i : intArr) {
            System.out.print(i + " ");
        }
    }

    public static void insertionSort(int[] intArr) {
        //insertion sort
        int l = intArr.length;
        //loop through items 1 to last item
        for (int i = 1; i < l; i++) {
            //inner loop 
            //goes from the i point BACKWARDS to position 1
            for (int j = i; j > 0; j--) {
                //must copy j because it will be altered
                int pointer = j;
                //compares items and swaps if necessary
                if (intArr[pointer] < intArr[pointer - 1]) {
                    int temp = intArr[pointer];
                    intArr[pointer] = intArr[pointer - 1];
                    intArr[pointer - 1] = temp;
                } //if the item and the item to its right are in order
                //break out of the inner loop
                else {
                    break;
                }
            }

        }
    }

}
