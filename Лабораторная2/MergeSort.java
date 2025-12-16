package Лабораторная2;

public class MergeSort {

    public static void sort(int[] array) {
        int n = array.length;
        for (int step = n / 2; step > 0; step /= 2) {
            for (int i = step; i < n; i++) {
                int temp = array[i];
                int j;
                for (j = i; j >= step && array[j - step] > temp; j -= step) {
                    array[j] = array[j - step];
                }
                array[j] = temp;
            }
        }
    }
}
