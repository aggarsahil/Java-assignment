public class Problem9 {
    public static boolean isSpecial(int number) {
        if (number < 10 || number > 99) return false;
        int tens = number / 10;
        int ones = number % 10;
        return number == (tens + ones + tens * ones);
    }

    public static void main(String[] args) {
        System.out.println(isSpecial(59));
        System.out.println(isSpecial(23));
    }
}