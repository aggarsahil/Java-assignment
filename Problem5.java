import java.text.DecimalFormat;

public class Problem5 {
    public static String computeTax(double income) {
        double tax = 0.0;
        if (income > 250000) {
            tax += Math.min(income, 500000) - 250000;
        }
        if (income > 500000) {
            tax += (Math.min(income, 1000000) - 500000) * 2;
        }
        if (income > 1000000) {
            tax += (income - 1000000) * 3;
        }
        tax = tax / 10.0;
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(tax);
    }

    public static void main(String[] args) {
        System.out.println(computeTax(190000));
        System.out.println(computeTax(345000));
        System.out.println(computeTax(780000));
        System.out.println(computeTax(2400000));
    }
}