
import java.text.DecimalFormat;

public class Problem2 {
    public static String computeGrossPrice(double netPrice, double taxRate) {
        double grossPrice = netPrice / (1 + taxRate);
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(grossPrice);
    }

    public static void main(String[] args) {
        System.out.println(computeGrossPrice(99.95, 0.12));
        System.out.println(computeGrossPrice(49999.0, 0.28));
        System.out.println(computeGrossPrice(720.0, 0.05));
        System.out.println(computeGrossPrice(45.0, 0.0));
    }
}
