public class Problem4 {
    public static double findMedian(double[] arr) {
        int n = arr.length;
        if (n == 0) return -1.0;
        if (n % 2 == 1) return arr[n / 2];
        return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
    }

    public static void main(String[] args) {
        System.out.println(findMedian(new double[]{1.0, 2.0, 3.0}));
    }
}