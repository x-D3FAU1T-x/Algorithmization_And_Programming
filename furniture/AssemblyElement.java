package furniture;

public class AssemblyElement {
    public double price_element;

    public AssemblyElement(int weight, double price_1_gram) {
        this.price_element = Method_CointingPrice(weight, price_1_gram);
    }

    public static double Method_CointingPrice(double weight, double price_1_gram) {
        return weight * price_1_gram;
    }
}