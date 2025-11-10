import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Numbers {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите длину массива: ");
    int length = scanner.nextInt();
    int[] array = new int[length];

    Random random = new Random();
    for (int i = 0; i < length; i++) {
      array[i] = random.nextInt(100);
    }
    System.out.println("Размер массива: " + array.length);
    System.out.println(java.util.Arrays.toString(array));

    int[] new_array = Arrays.stream(array).distinct().toArray();
    System.out.println("Размер нового массива: " + new_array.length);
    System.out.println(java.util.Arrays.toString(new_array));

    scanner.close();
  }
}
