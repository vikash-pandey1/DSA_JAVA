package GreedyAlgorithm;
import java.util.*;

public class FractionalKnap {
    public static void sortDec(int arr[][], int col) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[col], b[col]));
    }
    public static int calculate(int arr[][], int cap) {
        int mp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                int cw = arr[i][j + 1];
                int cp = arr[i][j];
                if (cw <= cap) {
                    mp += cp;
                    cap -= cw;
                } else {
                    double frac = (double)cap/(double)cw;
                    mp +=(cp*(frac));
                    cap -= (int)(cw*frac);
                }
            }
        }
        return mp;
    }

    public static void main(String[] args) {
        int arr[][] = { { 100, 20 }, { 60, 10 }, { 120, 30 } };
        sortDec(arr, 0);
        System.out.println(calculate(arr, 50));
    }
}
