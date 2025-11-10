import java.util.Scanner;

public class Fraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первый числитель: ");
        int numerator1 = scanner.nextInt();
        System.out.print("Введите первый знаменатель: ");
        int denominator1 = scanner.nextInt();
        System.out.print("Введите второй числитель: ");
        int numerator2 = scanner.nextInt();
        System.out.print("Введите второй знаменатель: ");
        int denominator2 = scanner.nextInt();

        double fractional_part1 = Method_SFP(numerator1, denominator1);
        double fractional_part2 = Method_SFP(numerator2, denominator2);
        int[] fractional_amount = Method_AF(numerator1, denominator1, numerator2, denominator2);

        System.out.println("Дробная часть: " + fractional_part1);
        System.out.println("Дробная часть: " + fractional_part2);
        System.out.println("Сумма дробей: " + fractional_amount[0] + "/" + fractional_amount[1]);

        scanner.close();
    }

    public static double Method_SFP(int numerator, int denominator) {
        double result = (double) numerator / denominator;
        return result - (int) result;
    }

    public static int[] Method_AF(int numerator1, int denominator1, int numerator2, int denominator2) {
        int new_denominator = denominator1 * denominator2;
        int numerator_amount = numerator1 * denominator2 + numerator2 * denominator1;
        return new int[] { numerator_amount, new_denominator };
    }
}
