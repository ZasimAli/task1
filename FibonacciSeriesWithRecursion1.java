public class FibonacciSeriesWithRecursion1 {
    int a = -1, b = 1;

    public static void main(String[] args) {

        FibonacciSeriesWithRecursion1 sc = new FibonacciSeriesWithRecursion1();

        sc.fibbonacci(10);

    }

    void fibbonacci(int i) {

        if (i >= 1) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
            fibbonacci(i - 1);

        }

    }

}
