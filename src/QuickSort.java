import java.util.ArrayList;

public class QuickSort {

    public static int subSorting(ArrayList<Pair> a, int from, int to) {

        String opora = "fu";


        int from_new = from;
        int to_new = to;

        Pair temp;
        opora = a.get(to - 1).code;

        while (true) {
            while (Integer.valueOf(a.get(from_new).code) < Integer.valueOf(opora)) {
                from_new++;
            }
            while (Integer.valueOf(a.get(to_new).code) > Integer.valueOf(opora)) {
                to_new--;
            }
            if (from_new < to_new) {

                temp = a.get(from_new);
                a.set(from_new, a.get(to_new));
                a.set(to_new, temp);

                from_new++;
                to_new--;
            } else {
                return to_new;
            }
        }
    }

    public static void quickSort(ArrayList<Pair> a, int from, int to) {
        if (from < to) {
            int s = subSorting(a, from, to);
            quickSort(a, from, s);
            quickSort(a, s + 1, to);
        }
    }
}