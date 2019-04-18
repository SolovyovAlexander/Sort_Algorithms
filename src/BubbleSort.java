import java.util.ArrayList;

public class BubbleSort {

    public static void ExchangeCloser(ArrayList<Pair> arr, int j, boolean for_chars) {
        Pair temp;
        if (!for_chars) {
            for (int i = j + 1; i < arr.size(); i++) {
                if ((!arr.get(i).isLetter()) && Integer.valueOf(arr.get(j).code) > Integer.valueOf(arr.get(i).code)) {
                    temp = arr.get(j);
                    arr.set(j, arr.get(i));
                    arr.set(i, temp);
                    break;
                }

                if ((!arr.get(i).isLetter()) && Integer.valueOf(arr.get(j).code) <= Integer.valueOf(arr.get(i).code)) {
                    break;
                }
            }
        }

        if (for_chars) {
            for (int i = j + 1; i < arr.size(); i++) {
                if (arr.get(i).isLetter() && Integer.valueOf(arr.get(j).code.charAt(0)) > Integer.valueOf(arr.get(i).code.charAt(0))) {
                    temp = arr.get(j);
                    arr.set(j, arr.get(i));
                    arr.set(i, temp);
                    break;
                }
                if ((!arr.get(i).isLetter()) && Integer.valueOf(arr.get(j).code.charAt(0)) <= Integer.valueOf(arr.get(i).code.charAt(0))) {
                    break;
                }
            }
        }
    }

    public static void Bubble_sort(ArrayList<Pair> a) {
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.size() - i; j++) {
                ExchangeCloser(a, j, a.get(j).isLetter());
                //      ArrayWriter2(a);
            }
            //  System.out.println("================");
        }
    }

}

