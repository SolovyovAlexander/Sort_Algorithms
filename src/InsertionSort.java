import java.util.ArrayList;

public class InsertionSort {

    public static boolean exchange_is_possible(ArrayList<Pair> arr, int i) {

        boolean p = false;

        if (arr.get(i).isLetter()) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr.get(j).isLetter() && Integer.valueOf(arr.get(i).code.charAt(0)) < Integer.valueOf(arr.get(j).code.charAt(0))) {
                    p = true;
                    break;
                }
            }
        } else {
            for (int j = i - 1; j >= 0; j--) {
                if (!arr.get(j).isLetter() && Integer.valueOf(arr.get(i).code) < Integer.valueOf(arr.get(j).code)) {
                    p = true;
                    break;
                }
            }
        }
        return p;
    }

    public static int exchange(ArrayList<Pair> arr, int i) {

        if (arr.get(i).isLetter()) {

            for (int j = i - 1; j >= 0; j--) {
                if (arr.get(j).isLetter() && Integer.valueOf(arr.get(i).code.charAt(0)) < Integer.valueOf(arr.get(j).code.charAt(0))) {
                    Pair temp = arr.get(j);
                    arr.set(j, arr.get(i));
                    arr.set(i, temp);
                    return j;
                }
            }
        } else {
            for (int j = i - 1; j >= 0; j--) {
                if (!arr.get(j).isLetter() && Integer.valueOf(arr.get(i).code) < Integer.valueOf(arr.get(j).code)) {
                    Pair temp = arr.get(j);
                    arr.set(j, arr.get(i));
                    arr.set(i, temp);
                    return j;
                }
            }
        }
        return i;
    }

    public static void insertion_sort(ArrayList<Pair> arr) {
        for (int i = 1; i < arr.size(); i++) {
            int temp = i;
            while (exchange_is_possible(arr, temp)) {
                temp = exchange(arr, temp);
            }
        }
    }
}
