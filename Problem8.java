public class Problem8 {
    public static String convertSeconds(int totalSeconds) {
        int days = totalSeconds / 86400;
        totalSeconds %= 86400;
        int hours = totalSeconds / 3600;
        totalSeconds %= 3600;
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        return String.format("%d Day(s) %d Hour(s) %d Minute(s) %d Second(s)", days, hours, minutes, seconds);
    }

    public static void main(String[] args) {
        System.out.println(convertSeconds(21893872));
    }
}