public class problem1 {
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static void main(String[] args) {
        System.out.println(countDigits(34));
        System.out.println(countDigits(-7291));
    }
}
