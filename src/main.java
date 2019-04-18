import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class main {

    static void ArrayPrinterConsole(ArrayList<Pair> a) {
        System.out.print("Array: ");
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i).get_code() + " ");
        }
        System.out.println();
        System.out.println("------------------------------");
    }

    static void ArrayReader(ArrayList<Pair> arr) throws IOException {
        Locale.setDefault(Locale.US);

        File input = new File("input.txt");
        Scanner in = new Scanner(input);

        while (in.hasNext()) {
            String temp = in.next();

            if (temp.length() == 1) {
                if (Integer.valueOf(temp.charAt(0)) >= 65 & Integer.valueOf(temp.charAt(0)) <= 90) {
                    arr.add(new Pair(temp, true));
                } else {
                    arr.add(new Pair(temp, false));
                }
            } else {
                arr.add(new Pair(temp, false));
            }
        }
    }

    static void ArrayPrinter(ArrayList<Pair> arr) throws IOException {

        File outputFile = new File("output.txt");
        FileWriter fileWriter = new FileWriter(outputFile);
        PrintWriter out = new PrintWriter(fileWriter);

        for (int i = 0; i < arr.size(); i++) {
            out.print(arr.get(i).get_code() + " ");
        }

        out.close();
    }

    public static void main(String[] args) throws IOException {

        ArrayList<Pair> arr = new ArrayList();

        ArrayList<Pair> arrB;
        ArrayList<Pair> arrS;
        ArrayList<Pair> arrI;
        ArrayList<Pair> arrQ;
        ArrayList<Pair> arrM;

        ArrayReader(arr);

        ArrayPrinterConsole(arr);

        arrB = arr;
        BubbleSort.Bubble_sort(arrB);

        arrS = arr;
        SelectionSort.selection_sort(arrS);

        arrI = arr;
        InsertionSort.insertion_sort(arrI);

        arrQ = arr;
        QuickSortUniversal.quickSort(arrQ, 0, arr.size() - 1);


        // if ((arrB == arrI) == (arrB == arrS) == (arrB == arrQ)) ArrayPrinterConsole(arrS);;


        //QuickSortUniversal.quickSort(arr, 0, arr.size() - 1);


        ArrayPrinter(arr);

    }

}

