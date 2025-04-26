import java.text.DecimalFormat;

public class Problem7 {
    public static String computeCompoundedInflation(double rate, int years) {
        double compoundedRate = Math.pow(1 + rate / 100, years) - 1;
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(compoundedRate * 100) + "%";
    }

    public static void main(String[] args) {
        System.out.println(computeCompoundedInflation(20, 5));
        System.out.println(computeCompoundedInflation(10, 3));
    }
}