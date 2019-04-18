import java.util.ArrayList;

public class QuickSortUniversal {

    // Method to swap 2 elements in an arraylist
    public static void swap(ArrayList<Pair> a, int left, int right) {
        Pair tempLeft = a.get(left);
        a.set(left, a.get(right));
        a.set(right, tempLeft);
    }

    private static void quickSortType(ArrayList<Pair> a, int from, int to, boolean type) {
        // If the indexes cross, then we've sorted the whole array.
        if (from >= to) {
            return;
        }
        // Choose a pivot value and then partition the array so that every value
        // less than the pivot is positioned before the pivot in the array and
        // every value greater than the pivot is positioned after the pivot in the array.

        // Also find first element of needed type
        int pivot = from;
        while (pivot < to && a.get(pivot).isLetter() != type) {
            pivot++;
        }
        // If no elements for swapping
        if (pivot == to) {
            return;
        }

        Pair pivotValue = a.get(pivot);
        int left = from - 1;
        int right = to + 1;

        while (left < right) {
            // Keep incrementing from the start of the range so long as the
            // values are less than the pivot.
            left++;
            while (left < to && (a.get(left).compareTo(pivotValue) < 0
                    || a.get(left).isLetter() != type  // Find element of needed type only
            )) {
                left++;
            }
            // Keep decrementing from the end of the range so long as the values are greater than the pivot
            right--;
            while (right > from && (a.get(right).compareTo(pivotValue) > 0
                    || a.get(right).isLetter() != type // Find element of needed type only
            )) {
                right--;
            }
            // So long at the indexes have not crossed, swap the pivot with the value that was out of place
            if (left < right) {
                swap(a, left, right);
            }
        }

        // Recursively sort the two portions of the array
        quickSortType(a, from, right, type);
        quickSortType(a, right + 1, to, type);
    }

    public static void quickSort(ArrayList<Pair> a, int from, int to) {
        quickSortType(a, from, to, true);
        quickSortType(a, from, to, false);
    }

}
