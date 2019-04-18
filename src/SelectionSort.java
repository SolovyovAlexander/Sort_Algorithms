import java.util.ArrayList;

class SelectionSort {

    private static int min_search(ArrayList<Pair> arr, int from) {

        int min_index = from;

        for (int i = from + 1; i < arr.size(); i++) {
            if (arr.get(from).isLetter() && (arr.get(i).isLetter())) {
                if (Integer.valueOf(arr.get(min_index).code.charAt(0)) > Integer.valueOf(arr.get(i).code.charAt(0)))
                    min_index = i;
            }

            if (!arr.get(from).isLetter() && !(arr.get(i).isLetter())) {
                if (Integer.valueOf(arr.get(min_index).code) > Integer.valueOf(arr.get(i).code))
                    min_index = i;
            }
        }
        return min_index;
    }

    static void selection_sort(ArrayList<Pair> arr) {

        for (int i = 0; i < arr.size(); i++) {
            Pair temp_element = arr.get(i);
            int temp_index = SelectionSort.min_search(arr, i);


            arr.set(i, arr.get(temp_index));
            arr.set(temp_index, temp_element);
        }
    }

}

