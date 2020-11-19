package InsertionSort;

public class InsertionSortFromAlgorithmsBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] intArr = {3,2,4};
        for (Comparable comparable : intArr) {
            System.out.println(comparable);
        }
        insertionSort(intArr);
        System.out.println();
        for (Comparable comparable : intArr) {
            System.out.println(comparable);
        }
    }

    private static void insertionSort(Comparable[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--) {
                exchange(a, j, j-1);
            }
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exchange(Comparable[] a, int j, int i) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }    
}
