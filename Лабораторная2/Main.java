package Лабораторная2;

public class Main {
    static double Test(int[] array, String sort) {
        int[] copy_array = array.clone();
        long start_time = System.nanoTime();
        if (sort.equals("selection")) {
            SelectionSort.sort(copy_array);
        } else if (sort.equals("shell")) {
            MergeSort.sort(copy_array);
        } else if (sort.equals("heap")) {
            HeapSort.sort(copy_array);
        }
        long end_time = System.nanoTime();
        return (end_time - start_time) / 1_000_000.0;
    }

    public static void main(String[] args) {
        int[] sizes = { 100, 1000, 10000 };
        for (int size : sizes) {
            System.out.println("\nТестирование для массива из " + size + " элементов:");
            int[][] test_arrays = new int[5][];
            String[] array_names = { "Случайный", "Частично отсортированный", "Обратный", "С дубликатами",
                    "Почти отсортированный" };
            test_arrays[0] = TestArrays.Make_Array1(size);
            test_arrays[1] = TestArrays.Make_Array2(size);
            test_arrays[2] = TestArrays.Make_Array3(size);
            test_arrays[3] = TestArrays.Make_Array4(size);
            test_arrays[4] = TestArrays.Make_Array5(size);
            String[] algoritm = { "selection", "shell", "heap" };
            String[] display = { "Сортировка Выбором", "Сортировка Слиянием", "Пирамидальная Сортировка" };
            int runs = 5;
            for (int i = 0; i < 5; i++) {
                System.out.println("\n" + array_names[i] + " массив:");
                for (int j = 0; j < 3; j++) {
                    double total_time = 0;
                    for (int run = 0; run < runs; run++) {
                        total_time += Test(test_arrays[i], algoritm[j]);
                    }
                    double time = total_time / runs;
                    System.out.printf("  %-25s: %.3f мс\n", display[j], time);
                }
            }
        }
    }
}