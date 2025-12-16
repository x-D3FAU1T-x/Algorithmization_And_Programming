package Лабораторная2;

import java.util.Arrays;
import java.util.Random;

public class TestArrays {
    static Random random = new Random();

    // Случайный массив
    static int[] Make_Array1(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size);
        }
        return array;
    }

    // Частично отсортированный массив (на 75%)
    static int[] Make_Array2(int size) {
        int[] array = Make_Array1(size);
        int count = (int) (size * 0.75);
        Arrays.sort(array, 0, count);
        return array;
    }

    // Обратно отсортированный массив
    static int[] Make_Array3(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = size - i;
        }
        return array;
    }

    // Массив с дубликатами (10% уникальных значений)
    static int[] Make_Array4(int size) {
        int unique = size / 10;
        if (unique < 1)
            unique = 1;
        int[] unique_numb = new int[unique];
        for (int i = 0; i < unique; i++) {
            unique_numb[i] = random.nextInt(size);
        }
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = unique_numb[random.nextInt(unique)];
        }
        return array;
    }

    // Почти отсортированный массив (90% отсортировано)
    static int[] Make_Array5(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        int mix = size / 10;
        for (int i = 0; i < mix; i++) {
            int m = random.nextInt(size);
            int n = random.nextInt(size);
            int tmp = array[m];
            array[m] = array[n];
            array[n] = tmp;
        }
        return array;
    }
}