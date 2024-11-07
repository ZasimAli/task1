import java.util.Scanner;

public class FactorialNumberWithRecursion {
    static int fact = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        int res;
        FactorialNumberWithRecursion fn = new FactorialNumberWithRecursion();
        fn.factorial(n);
        System.out.print(fact);

    }

    void factorial(int n) {

        if (n >= 1) {
            fact = fact * n;
            factorial(n - 1);

        }

    }

}
