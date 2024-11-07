import java.util.Scanner;

public class FibbonacciSeriesWithRecursion {
    int a = -1, b = 1;

    public static void main(String[] args) {

        FibbonacciSeriesWithRecursion fb = new FibbonacciSeriesWithRecursion();
        fb.fibbonacci();

    }

    void fibbonacci() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;

        }

    }

}
