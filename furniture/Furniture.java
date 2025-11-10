package furniture;

import java.util.Scanner;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите вес элемента 1: ");
        int weight1 = scanner.nextInt();
        System.out.print("Введите цену за грамм для элемента 1: ");
        double price_gram1 = scanner.nextDouble();
        AssemblyElement element1 = new AssemblyElement(weight1, price_gram1);
        System.out.print("Введите вес элемента 2: ");
        int weight2 = scanner.nextInt();
        System.out.print("Введите цену за грамм для элемента 2: ");
        double priceGram2 = scanner.nextDouble();
        AssemblyElement element2 = new AssemblyElement(weight2, priceGram2);
        System.out.print("Введите вес элемента 3: ");
        int weight3 = scanner.nextInt();
        System.out.print("Введите цену за грамм для элемента 3: ");
        double priceGram3 = scanner.nextDouble();
        AssemblyElement element3 = new AssemblyElement(weight3, priceGram3);
        System.out.print("Введите количество элемента 1: ");
        int count1 = scanner.nextInt();
        System.out.print("Введите количество элемента 2: ");
        int count2 = scanner.nextInt();
        System.out.print("Введите количество элемента 3: ");
        int count3 = scanner.nextInt();
        System.out.print("Введите стоимость сборки: ");
        double cost_assembly = scanner.nextDouble();

        double total_price = Method_AllPrice(element1, element2, element3, count1, count2, count3, cost_assembly);
        double max_price_element = Method_MaxPrice(element1, element2, element3, count1, count2, count3);

        System.out.println("=== ИТОГО ===");
        System.out.println("Стоимость элемента 1: " + element1.price_element);
        System.out.println("Стоимость элемента 2: " + element2.price_element);
        System.out.println("Стоимость элемента 3: " + element3.price_element);
        System.out.println("Общая стоимость изделия: " + total_price);
        System.out.println("Максимальная стоимость элемента в изделии: " + max_price_element);

        scanner.close();

    }

    public static double Method_MaxPrice(AssemblyElement element1, AssemblyElement element2,
            AssemblyElement element3,
            int count1, int count2, int count3) {
        double price1 = element1.price_element * count1;
        double price2 = element2.price_element * count2;
        double price3 = element3.price_element * count3;

        double max_price_element = Math.max(price1, Math.max(price2, price3));
        return max_price_element;
    }

    public static double Method_AllPrice(AssemblyElement elem1, AssemblyElement elem2, AssemblyElement elem3,
            int count1, int count2, int count3, double cost_assembly) {
        double total_elements_price = elem1.price_element * count1 + elem2.price_element * count2
                + elem3.price_element * count3;
        double total_price = total_elements_price + cost_assembly;
        return total_price;
    }
}